
package io.gamemachine.client.messages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.io.UnsupportedEncodingException;

import io.protostuff.ByteString;
import io.protostuff.GraphIOUtil;
import io.protostuff.Input;
import io.protostuff.Message;
import io.protostuff.Output;
import io.protostuff.ProtobufOutput;

import java.io.ByteArrayOutputStream;
import io.protostuff.JsonIOUtil;
import io.protostuff.LinkedBuffer;
import io.protostuff.ProtobufIOUtil;
import io.protostuff.runtime.RuntimeSchema;

import io.gamemachine.util.LocalLinkedBuffer;


import java.nio.charset.Charset;


import io.protostuff.Schema;
import io.protostuff.UninitializedMessageException;


@SuppressWarnings("unused")
public final class WorldObjects implements Externalizable, Message<WorldObjects>, Schema<WorldObjects>{



    public static Schema<WorldObjects> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static WorldObjects getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final WorldObjects DEFAULT_INSTANCE = new WorldObjects();

        public List<WorldObject> worldObject;
	  
    public WorldObjects()
    {
        
    }


	

	    
    public Boolean hasWorldObject()  {
        return worldObject == null ? false : true;
    }
        
		public List<WorldObject> getWorldObjectList() {
		if(this.worldObject == null)
            this.worldObject = new ArrayList<WorldObject>();
		return worldObject;
	}

	public WorldObjects setWorldObjectList(List<WorldObject> worldObject) {
		this.worldObject = worldObject;
		return this;
	}

	public WorldObject getWorldObject(int index)  {
        return worldObject == null ? null : worldObject.get(index);
    }

    public int getWorldObjectCount()  {
        return worldObject == null ? 0 : worldObject.size();
    }

    public WorldObjects addWorldObject(WorldObject worldObject)  {
        if(this.worldObject == null)
            this.worldObject = new ArrayList<WorldObject>();
        this.worldObject.add(worldObject);
        return this;
    }
            	    	    	    	
    public WorldObjects removeWorldObjectByPlayerItemId(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.playerItemId.equals(obj.playerItemId)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectByAction(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.action.equals(obj.action)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectById(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.id.equals(obj.id)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectByRecordId(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.recordId.equals(obj.recordId)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectByOwnerId(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.ownerId.equals(obj.ownerId)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectByX(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.x.equals(obj.x)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectByY(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.y.equals(obj.y)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectByZ(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.z.equals(obj.z)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectByRx(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.rx.equals(obj.rx)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectByRy(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.ry.equals(obj.ry)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectByRz(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.rz.equals(obj.rz)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectByRw(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.rw.equals(obj.rw)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectByMaxHealth(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.maxHealth.equals(obj.maxHealth)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectByHealth(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.health.equals(obj.health)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectByParentId(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.parentId.equals(obj.parentId)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectByDestructable(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.destructable.equals(obj.destructable)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectByPrefab(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.prefab.equals(obj.prefab)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectByType(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.type.equals(obj.type)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectByGrid(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.grid.equals(obj.grid)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectByCurrentUser(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.currentUser.equals(obj.currentUser)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public WorldObjects removeWorldObjectByState(WorldObject worldObject)  {
    	if(this.worldObject == null)
           return this;
            
       	Iterator<WorldObject> itr = this.worldObject.iterator();
       	while (itr.hasNext()) {
    	WorldObject obj = itr.next();
    	
    	    		if (worldObject.state.equals(obj.state)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
            	
    
    
    
	
  
    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<WorldObjects> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public WorldObjects newMessage()
    {
        return new WorldObjects();
    }

    public Class<WorldObjects> typeClass()
    {
        return WorldObjects.class;
    }

    public String messageName()
    {
        return WorldObjects.class.getSimpleName();
    }

    public String messageFullName()
    {
        return WorldObjects.class.getName();
    }

    public boolean isInitialized(WorldObjects message)
    {
        return true;
    }

    public void mergeFrom(Input input, WorldObjects message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                            	case 1:
            	            		if(message.worldObject == null)
                        message.worldObject = new ArrayList<WorldObject>();
                                        message.worldObject.add(input.mergeObject(null, WorldObject.getSchema()));
                                        break;
                            	            
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, WorldObjects message) throws IOException
    {
    	    	
    	    	
    	    	if(message.worldObject != null)
        {
            for(WorldObject worldObject : message.worldObject)
            {
                if(worldObject != null) {
                   	    				output.writeObject(1, worldObject, WorldObject.getSchema(), true);
    				    			}
            }
        }
    	            	
    }

    public String getFieldName(int number)
    {
        switch(number)
        {
        	        	case 1: return "worldObject";
        	            default: return null;
        }
    }

    public int getFieldNumber(String name)
    {
        final Integer number = __fieldMap.get(name);
        return number == null ? 0 : number.intValue();
    }

    private static final java.util.HashMap<String,Integer> __fieldMap = new java.util.HashMap<String,Integer>();
    static
    {
    	    	__fieldMap.put("worldObject", 1);
    	    }
   
   public static List<String> getFields() {
	ArrayList<String> fieldNames = new ArrayList<String>();
	String fieldName = null;
	Integer i = 1;
	
    while(true) { 
		fieldName = WorldObjects.getSchema().getFieldName(i);
		if (fieldName == null) {
			break;
		}
		fieldNames.add(fieldName);
		i++;
	}
	return fieldNames;
}

public static WorldObjects parseFrom(byte[] bytes) {
	WorldObjects message = new WorldObjects();
	ProtobufIOUtil.mergeFrom(bytes, message, WorldObjects.getSchema());
	return message;
}

public static WorldObjects parseFromJson(String json) throws IOException {
	byte[] bytes = json.getBytes(Charset.forName("UTF-8"));
	WorldObjects message = new WorldObjects();
	JsonIOUtil.mergeFrom(bytes, message, WorldObjects.getSchema(), false);
	return message;
}

public WorldObjects clone() {
	byte[] bytes = this.toByteArray();
	WorldObjects worldObjects = WorldObjects.parseFrom(bytes);
	return worldObjects;
}
	
public byte[] toByteArray() {
	return toProtobuf();
	//return toJson();
}

public String toJson() {
	boolean numeric = false;
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	try {
		JsonIOUtil.writeTo(out, this, WorldObjects.getSchema(), numeric);
	} catch (IOException e) {
		e.printStackTrace();
		throw new RuntimeException("Json encoding failed");
	}
	String json = new String(out.toByteArray(), Charset.forName("UTF-8"));
	return json;
}

public byte[] toPrefixedByteArray() {
	LinkedBuffer buffer = LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE);
  Schema<WorldObjects> schema = WorldObjects.getSchema();
    
	final ByteArrayOutputStream out = new ByteArrayOutputStream();
    final ProtobufOutput output = new ProtobufOutput(buffer);
    try
    {
    	schema.writeTo(output, this);
        final int size = output.getSize();
        ProtobufOutput.writeRawVarInt32Bytes(out, size);
        final int msgSize = LinkedBuffer.writeTo(out, buffer);
        assert size == msgSize;
        
        buffer.clear();
        return out.toByteArray();
    }
    catch (IOException e)
    {
        throw new RuntimeException("Serializing to a byte array threw an IOException " + 
                "(should never happen).", e);
    }
 
}

public byte[] toProtobuf() {
	LinkedBuffer buffer = LocalLinkedBuffer.get();
	byte[] bytes = null;

	try {
		bytes = ProtobufIOUtil.toByteArray(this, WorldObjects.getSchema(), buffer);
		buffer.clear();
	} catch (Exception e) {
		buffer.clear();
		e.printStackTrace();
		throw new RuntimeException("Protobuf encoding failed");
	}
	return bytes;
}

}