package points;

import java.util.HashMap;
import java.util.LinkedList;

public class AliveOrDead {
	
	public AliveOrDead(Integer[] allFinalKeys, LinkedList<User> users) {
		this.allFinalKeys= allFinalKeys;
		this.keyToUser = new HashMap<Integer, User>();
		this.keyToAlive = new HashMap<Integer, Boolean>();
		this.setUpDeadForAllKeys();
		this.putUsersToKeysAlive(users);
		
	}
	private HashMap<Integer, User> keyToUser;
	private HashMap<Integer, Boolean> keyToAlive;
	private Integer[] allFinalKeys;
	
	public void setUpDeadForAllKeys(){
		for(int i=0; i<this.allFinalKeys.length; i++){
			keyToAlive.put(this.allFinalKeys[i], false);
		}
	}
	
	public void putUsersToKeysAlive(LinkedList<User> users){
		for (User x: users){
			this.keyToUser.put(x.hashCode(), x);
			this.keyToAlive.replace(x.hashCode(), true);
		}
	}
	
	public void addLivingUser(User newUser){
		this.keyToUser.put(newUser.hashCode(), newUser);
		this.keyToAlive.put(newUser.hashCode(), true);
	}

	public HashMap<Integer, User> getKeyToUser() {
		return keyToUser;
	}

	public HashMap<Integer, Boolean> getKeyToAlive() {
		return keyToAlive;
	}

	public Integer[] getAllFinalKeys() {
		return allFinalKeys;
	}

	public void setKeyToUser(HashMap<Integer, User> keyToUser) {
		this.keyToUser = keyToUser;
	}

	public void setKeyToAlive(HashMap<Integer, Boolean> keyToAlive) {
		this.keyToAlive = keyToAlive;
	}

	public void setAllFinalKeys(Integer[] allFinalKeys) {
		this.allFinalKeys = allFinalKeys;
	}
	
	
}
