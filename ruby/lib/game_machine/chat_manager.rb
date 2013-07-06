module GameMachine
    class ChatManager < Actor


    aspect %w(ChatRegister Player ClientConnection)
    aspect %w(ChatMessage Player ClientConnection)
    aspect %w(JoinChat Player ClientConnection)
    aspect %w(LeaveChat Player ClientConnection)

    def post_init(*args)
      @chat_actors = {}
    end

    def on_receive(entity)
      unless @chat_actors.has_key?(entity.player.id)
        create_child(entity.player.id,entity.client_connection)
      end
      forward_chat_request(entity)
    end

    private

    def forward_chat_request(entity)
      @chat_actors[entity.player.id].tell(entity,nil)
    end

    def create_child(player_id,client_connection)
      name = "chat#{player_id}"
      builder = ActorBuilder.new(Systems::Chat,player_id,client_connection)
      child = builder.with_parent(context).with_name(name).start
      @chat_actors[player_id] = ActorRef.new(child,Systems::Chat.name)
    end
  end
end