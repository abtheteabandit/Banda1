package points;

import java.util.HashMap;
import java.util.LinkedList;

public class User_Idea {
	
	public User_Idea() {
		this.subUserIdeas = new HashMap<Integer, User_Idea_Goals>();
		
	}
	private double primeKey;
	private HashMap <Integer, User_Idea_Goals> subUserIdeas;
	public double getPrimeKey() {
		return primeKey;
	}
	public HashMap<Integer, User_Idea_Goals> getSubUserIdeas() {
		return subUserIdeas;
	}
	
	public void setPrimeKey(double primeKey) {
		this.primeKey = primeKey;
	}
	public void setSubUserIdeas(HashMap<Integer, User_Idea_Goals> subUserIdeas) {
		this.subUserIdeas = subUserIdeas;
	}
	
	public void generateNextUserIdeas(){
		for(int i=1; i<6; i++){
			for(int j=1; j<6; j++){
				User_Idea_Goals x = new User_Idea_Goals(i,j);
				this.subUserIdeas.put(x.computePrimeKey(), x);
				
			}
		}
	}
	

	
	
	
	
	
	
	
}
