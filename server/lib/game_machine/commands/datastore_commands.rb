module GameMachine
  module Commands
    class DatastoreCommands

      attr_reader :store
      def initialize
        @store = DbLib::Store.get_instance
      end

      def define_dbproc(name,&blk)
        ObjectDb.dbprocs[name] = blk
      end

      def call_dbproc(name,current_entity_id,update_entity,blocking=true)
        ref = ObjectDb.find_distributed(current_entity_id)
        message = MessageLib::ObjectdbUpdate.new.
          set_current_entity_id(current_entity_id).
          set_update_method(name).
          set_update_entity(update_entity)
        if blocking
          ref.ask(message, 100)
        else
          ref.tell(message)
        end
      end

      def put!(entity)
        store.set(entity.id,entity)
      end

      def get!(entity_id)
        store.get(entity_id)
      end

      def delete!(entity_id)
        store.delete(entity_id)
      end

      def put(entity)
        ref = Actor::Base.find_distributed(entity.get_id,'object_store')
        ref.tell(MessageLib::ObjectdbPut.new.set_entity(entity))
      end

      def get(entity_id,timeout=1000)
        ref = Actor::Base.find_distributed(entity_id,'object_store')
        ref.ask(MessageLib::ObjectdbGet.new.set_entity_id(entity_id), timeout)
      end

      def delete(entity_id)
        ref = Actor::Base.find_distributed(entity_id,'object_store')
        ref.tell(MessageLib::ObjectdbDel.new.set_entity_id(entity_id))
      end

    end
  end
end
