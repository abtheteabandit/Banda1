package points;

import java.util.HashMap;
import java.util.LinkedList;

public class User_Idea_Goals{

	public User_Idea_Goals( int g, int s) {
		this.goal=g;
		this.start=s;
		this.alive=false;
		this.nextKey=1;
		this.computePrimeKey();
		this.nextUserIdeas=new HashMap<Integer, User_Idea_Genres>();
		this.randomGs=this.generatePossUserIdeas();
		// TODO Auto-generated constructor stub
	}

		private int goal;
		private int start;
		private boolean alive;
		private Integer primeKey;
		private Integer nextKey;
		private HashMap<Integer, User_Idea_Genres> nextUserIdeas;
		private LinkedList<int[]> randomGs;
		
	public int getGoal() {
			return goal;
		}

		public int getStart() {
			return start;
		}

		public boolean isAlive() {
			return alive;
		}

		public Integer getPrimeKey() {
			return primeKey;
		}

		public Integer getNextKey() {
			return nextKey;
		}

		public HashMap<Integer, User_Idea_Genres> getNextUserIdeas() {
			return nextUserIdeas;
		}

		public LinkedList<int[]> getRandomGs() {
			return randomGs;
		}

		public void setGoal(int goal) {
			this.goal = goal;
		}

		public void setStart(int start) {
			this.start = start;
		}

		public void setAlive(boolean alive) {
			this.alive = alive;
		}

		public void setPrimeKey(Integer primeKey) {
			this.primeKey = primeKey;
		}

		public void setNextKey(Integer nextKey) {
			this.nextKey = nextKey;
		}

		public void setNextUserIdeas(HashMap<Integer, User_Idea_Genres> nextUserIdeas) {
			this.nextUserIdeas = nextUserIdeas;
		}

		public void setRandomGs(LinkedList<int[]> randomGs) {
			this.randomGs = randomGs;
		}

	public Integer computePrimeKey(){
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
		return this.primeKey;
	}
	
	public Integer passKey(){
		this.nextKey=this.primeKey;
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
			User_Idea_Genres y = new User_Idea_Genres(x, this.nextKey, this);
			this.nextUserIdeas.put(y.computeKey(), y);
		}
	}
	
	
}
