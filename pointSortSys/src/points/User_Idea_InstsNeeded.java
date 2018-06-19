package points;

import java.util.HashMap;
import java.util.LinkedList;

public class User_Idea_InstsNeeded{

	public User_Idea_InstsNeeded(String[] insts, Integer prevKey) {
	
		this.instsNeeded=insts;
		this.nextKey=1;
		this.prevKey=prevKey;
		this.hashInsts= new int[15];
		this.computePrimeKey();
		this.nextUserIdeas= new HashMap<Integer, User_Idea_PosNDist>();
		this.userIdeasHere= new LinkedList< User_Idea_PosNDist>();
		// TODO Auto-generated constructor stub
	}
	private String[] instsNeeded;
	private Integer prevKey;
	private Integer primeKey;
	private Integer nextKey;
	private HashMap<Integer, User_Idea_PosNDist> nextUserIdeas;
	private LinkedList< User_Idea_PosNDist> userIdeasHere;
	
	private int[] hashInsts;
	
	public Integer computePrimeKey(){
		
		for(int i=0; i<this.instsNeeded.length; i++){
			int currentInKey=this.instsNeeded[i].hashCode();
			this.hashInsts[i]=currentInKey;
			this.primeKey=this.primeKey+currentInKey;
		}
		return this.primeKey;
	}
	
	public void setNextKey(){
		this.nextKey=this.primeKey*this.prevKey;
	}
	public Integer getNextKey(){
		return this.nextKey;
	}
	
}
