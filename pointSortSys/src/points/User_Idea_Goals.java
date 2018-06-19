package points;

import java.util.HashMap;
import java.util.LinkedList;

public class User_Idea_Goals{

	public User_Idea_Goals( int g, int s, Integer prevKey) {
		this.goal=g;
		this.start=s;
		this.prevKey=prevKey;
		this.nextKey=1;
		this.computePrimeKey();
		this.nextUserIdeas=new HashMap<Integer, User_Idea_Genres>();
		this.randomGs=this.generatePossUserIdeas();
		// TODO Auto-generated constructor stub
	}

		private int goal;
		private int start;
		private Integer prevKey;
		private Integer primeKey;
		private Integer nextKey;
		private HashMap<Integer, User_Idea_Genres> nextUserIdeas;
		private LinkedList<int[]> randomGs;
		
	public void computePrimeKey(){
		switch(this.goal){
		case 1:
			this.goal=3;
			break;
		case 2: 
			this.goal=5;
			break;
		case 3: 
			this.goal=7;
			break;
		case 4:
			this.goal=11;
			break;
		case 5: 
			this.goal=13;
			break;
		}
		
		switch(this.start){
		case 1:
			this.start=3;
			break;
		case 2: 
			this.start=5;
			break;
		case 3: 
			this.start=7;
			break;
		case 4:
			this.start=11;
			break;
		case 5: 
			this.start=13;
			break;
		}
		this.primeKey = this.start*this.goal;
	}
	
	public Integer passKey(){
		this.nextKey=this.prevKey*this.primeKey;
		return this.nextKey;
	}
	
	public LinkedList<int[]> generatePossUserIdeas(){
		int[] randomGvals = new int[15];
		LinkedList<int[]> setOfRandGVals = new LinkedList<int[]>();
		for(int i=0; i<randomGvals.length; i++){
			for(int j=1; j<8; j++){
				randomGvals[i]=j;
			}
			setOfRandGVals.add(randomGvals);
		}
		return setOfRandGVals;
	}
	
	public void fillNextUserIdeaMap(){
		for(int[] x : this.randomGs){
			User_Idea_Genres y = new User_Idea_Genres(x, this.nextKey);
			this.nextUserIdeas.put(y.computeKey(), y);
		}
	}
	
	
}
