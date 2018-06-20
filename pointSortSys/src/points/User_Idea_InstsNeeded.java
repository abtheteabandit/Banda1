package points;

import java.util.HashMap;
import java.util.LinkedList;

public class User_Idea_InstsNeeded{

	public User_Idea_InstsNeeded(String[] insts, Integer prevKey, User_Idea_InstsPlayed old) {
	
		this.instsNeeded=insts;
		this.prevLayer=old;
		this.nextKey=1;
		this.prevKey=prevKey;
		this.hashInsts= new int[15];
		this.computePrimeKey();
		this.setNextKey();
		this.nextUserIdeas= new HashMap<Integer, User_Idea_Complete>();
		this.userIdeasHere= new LinkedList< User_Idea_PosNDist>();
		this.alive = false;
		// TODO Auto-generated constructor stub
	}
	private String[] instsNeeded;
	private Integer prevKey;
	private Integer primeKey;
	private User_Idea_InstsPlayed prevLayer;
	private boolean alive;
	private Integer nextKey;
	private HashMap<Integer, User_Idea_Complete> nextUserIdeas;
	private LinkedList< User_Idea_PosNDist> userIdeasHere;
	
	private int[] hashInsts;
	
	public Integer computePrimeKey(){
		
		for(int i=0; i<this.instsNeeded.length; i++){
			int currentInKey=this.instsNeeded[i].hashCode();
			this.hashInsts[i]=currentInKey;
			this.primeKey=this.primeKey*currentInKey;
		}
		return this.primeKey;
	}
	
	public void setNextKey(){
		this.nextKey=this.primeKey*this.prevKey;
	}
	public Integer getNextKey(){
		return this.nextKey;
	}

	public String[] getInstsNeeded() {
		return instsNeeded;
	}

	public Integer getPrevKey() {
		return prevKey;
	}

	public Integer getPrimeKey() {
		return primeKey;
	}

	public boolean isAlive() {
		return alive;
	}

	public HashMap<Integer, User_Idea_Complete> getNextUserIdeas() {
		return nextUserIdeas;
	}

	public LinkedList<User_Idea_PosNDist> getUserIdeasHere() {
		return userIdeasHere;
	}

	public int[] getHashInsts() {
		return hashInsts;
	}

	public void setInstsNeeded(String[] instsNeeded) {
		this.instsNeeded = instsNeeded;
	}

	public void setPrevKey(Integer prevKey) {
		this.prevKey = prevKey;
	}

	public void setPrimeKey(Integer primeKey) {
		this.primeKey = primeKey;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
		this.prevLayer.setAlive(this.alive);
	}

	public void setNextKey(Integer nextKey) {
		this.nextKey = nextKey;
	}

	public void setNextUserIdeas(HashMap<Integer, User_Idea_Complete> nextUserIdeas) {
		this.nextUserIdeas = nextUserIdeas;
	}

	public void setUserIdeasHere(LinkedList<User_Idea_PosNDist> userIdeasHere) {
		this.userIdeasHere = userIdeasHere;
	}

	public void setHashInsts(int[] hashInsts) {
		this.hashInsts = hashInsts;
	}
	public void setPrevLayerAlive(){
		if (this.alive==true){
			this.prevLayer.setAlive(this.alive);
		}
	}
	
	
}
