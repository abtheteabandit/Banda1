package points;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class User_Idea_InstsPlayed{

	


	public User_Idea_InstsPlayed(String[] insts, Integer prevKey, User_Idea_Genres old) {

		this.instsPlayed = insts;
		this.alive = false;
		this.prevLayer = old;
		this.prevKey=prevKey;
		this.nextKey=1;
		this.hashInsts = new int[this.instsPlayed.length];
		this.computePrimeKey();
		this.nextUserIdeas=new HashMap<Integer, User_Idea_InstsNeeded>();
		String[] tempInsts= {"guitar", "drums", "saxaphone", "piano", "bass", "violin", "producer", "rapper", "singer", "mixer", "DJ", "frenchHorn", "tuba", "cello", "flute", "oboe", "clarinet", "viola", "picalo", "harmonic", "ukele", "mallets", "marimba", "uprightBass", "trombone", "harp", "citar"};
		List<String> temp2Insts = new LinkedList<String>();
		for(int i=0; i<tempInsts.length; i++){
			temp2Insts.add(tempInsts[i]);
		}
		this.usserIdeasHere = new LinkedList<User_Idea_InstsNeeded>();
		this.instsBank=temp2Insts;
		this.possInsts=this.genPossInsts();
		// TODO Auto-generated constructor stub
	}
	
	private String[] instsPlayed;
	private Integer prevKey;
	private Integer primeKey;
	private Integer nextKey;
	private int[] hashInsts;
	private boolean alive;
	private List<String> instsBank;
	private User_Idea_Genres prevLayer;
	private HashMap<Integer, User_Idea_InstsNeeded> nextUserIdeas;
	private LinkedList<User_Idea_InstsNeeded> usserIdeasHere;
	private List<List<String>> possInsts;
	
	public Integer computePrimeKey(){
			
			for(int i=0; i<this.instsPlayed.length; i++){
				int currentInKey=this.instsPlayed[i].hashCode();
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

	public List<List<String>> genPossInsts(){
		 List<List<String>> x = combination(this.instsBank, this.instsBank.size());
		 return x;
	}
	
	public static <String> List<List<String>> combination(List<String> values, int size) {

	    if (0 == size) {
	        return Collections.singletonList(Collections.<String> emptyList());
	    }

	    if (values.isEmpty()) {
	        return Collections.emptyList();
	    }

	    List<List<String>> combination = new LinkedList<List<String>>();

	    String actual = values.iterator().next();

	    List<String> subSet = new LinkedList<String>(values);
	    subSet.remove(actual);

	    List<List<String>> subSetCombination = combination(subSet, size - 1);

	    for (List<String> set : subSetCombination) {
	        List<String> newSet = new LinkedList<String>(set);
	        newSet.add(0, actual);
	        combination.add(newSet);
	    }

	    combination.addAll(combination(subSet, size));

	    return combination;
	}
	
	
	public String[] getInstsPlayed() {
		return instsPlayed;
	}

	public Integer getPrevKey() {
		return prevKey;
	}

	public Integer getPrimeKey() {
		return primeKey;
	}

	public int[] getHashInsts() {
		return hashInsts;
	}

	public boolean isAlive() {
		return alive;
	}

	public List<String> getInstsBank() {
		return instsBank;
	}

	public User_Idea_Genres getPrevLayer() {
		return prevLayer;
	}

	public HashMap<Integer, User_Idea_InstsNeeded> getNextUserIdeas() {
		return nextUserIdeas;
	}

	public LinkedList<User_Idea_InstsNeeded> getUsserIdeasHere() {
		return usserIdeasHere;
	}

	public List<List<String>> getPossInsts() {
		return possInsts;
	}

	public void setInstsPlayed(String[] instsPlayed) {
		this.instsPlayed = instsPlayed;
	}

	public void setPrevKey(Integer prevKey) {
		this.prevKey = prevKey;
	}

	public void setPrimeKey(Integer primeKey) {
		this.primeKey = primeKey;
	}

	public void setNextKey(Integer nextKey) {
		this.nextKey = nextKey;
	}

	public void setHashInsts(int[] hashInsts) {
		this.hashInsts = hashInsts;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
		this.prevLayer.setAlive(this.alive);
	}

	public void setInstsBank(List<String> instsBank) {
		this.instsBank = instsBank;
	}

	public void setPrevLayer(User_Idea_Genres prevLayer) {
		this.prevLayer = prevLayer;
	}

	public void setNextUserIdeas(HashMap<Integer, User_Idea_InstsNeeded> nextUserIdeas) {
		this.nextUserIdeas = nextUserIdeas;
	}

	public void setUsserIdeasHere(LinkedList<User_Idea_InstsNeeded> usserIdeasHere) {
		this.usserIdeasHere = usserIdeasHere;
	}

	public void setPossInsts(List<List<String>> possInsts) {
		this.possInsts = possInsts;
	}

	public void createNextUserIdeas(){
		this.setNextKey();
		for (List<String> x : this.possInsts){
			String[] tempArr = (java.lang.String[]) x.toArray();
			User_Idea_InstsNeeded y = new User_Idea_InstsNeeded(tempArr, this.nextKey, this);
			this.usserIdeasHere.add(y);
			this.nextUserIdeas.put(y.computePrimeKey(), y);
		}
	} 

}
