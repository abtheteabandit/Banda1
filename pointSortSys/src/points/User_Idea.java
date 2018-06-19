package points;

import java.util.HashMap;
import java.util.LinkedList;

public class User_Idea {
	
	public User_Idea(Integer primeKey) {
		this.primeKey = primeKey;
		this.subUserIdeas = new HashMap<Integer, User_Idea>();
		this.userIdeasHere = new LinkedList<User_Idea>();
	}
	private double primeKey;
	private HashMap <Integer, User_Idea> subUserIdeas;
	LinkedList<User_Idea> userIdeasHere;
	public double getPrimeKey() {
		return primeKey;
	}
	public HashMap<Integer, User_Idea> getSubUserIdeas() {
		return subUserIdeas;
	}
	public LinkedList<User_Idea> getUserIdeasHere() {
		return userIdeasHere;
	}
	public void setPrimeKey(double primeKey) {
		this.primeKey = primeKey;
	}
	public void setSubUserIdeas(HashMap<Integer, User_Idea> subUserIdeas) {
		this.subUserIdeas = subUserIdeas;
	}
	public void setUserIdeasHere(LinkedList<User_Idea> userIdeasHere) {
		this.userIdeasHere = userIdeasHere;
	}
	
	

	
	
	
	
	
	
	
}
