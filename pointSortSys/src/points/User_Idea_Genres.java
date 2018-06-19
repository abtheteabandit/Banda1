package points;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class User_Idea_Genres {

	public User_Idea_Genres(int[] gVal, Integer prevKey) {
		
		this.genreVal=gVal;
		this.prevKey=prevKey;
		this.nextKey=1;
		this.nextUserIdeas=new HashMap<Integer, User_Idea_InstsPlayed>();
		String[] tempInsts= {"guitar", "drums", "saxaphone", "piano", "bass", "violin", "producer", "rapper", "singer", "mixer", "DJ", "frenchHorn", "tuba", "cello", "flute", "oboe", "clarinet", "viola", "picalo", "harmonic", "ukele", "mallets", "marimba", "uprightBass", "trombone", "harp", "citar"};
		List<String> temp2Insts = new LinkedList<String>();
		for(int i=0; i<tempInsts.length; i++){
			temp2Insts.add(tempInsts[i]);
		}
		
		this.instsBank=temp2Insts;
		this.possInsts=this.genPossInsts();
		this.usserIdeasHere= new LinkedList<User_Idea_InstsPlayed>();
	}
	private int primeKey;
	final int jazzPrime = 3;
	final int rockPrime = 5;
	final int bluesPrime = 7;
	final int experPrime = 13;
	final int classPrime = 13;
	final int funkPrime = 17;
	final int latinPrime = 19;
	final int gospelPrime = 23;
	final int rNBPrime = 29;
	final int rapPrime = 37;
	final int countryPrime = 41;
	final int folkPrime = 43;
	final int popPrime = 47;
	final int electronicPrime = 53;
	final int reggePrime = 59;
	final int[] primeG = {jazzPrime, rockPrime, rapPrime, electronicPrime, countryPrime, popPrime, bluesPrime, classPrime, folkPrime, experPrime, gospelPrime, funkPrime, latinPrime, reggePrime};
	private int[] genreVal;
	private Integer prevKey, nextKey;
	private HashMap<Integer, User_Idea_InstsPlayed> nextUserIdeas;
	private List<List<String>> possInsts;
	private List<String> instsBank;
	private LinkedList<User_Idea_InstsPlayed> usserIdeasHere;
	
	public int computeKey(){
		for (int i=0; i<this.genreVal.length; i++){
			this.primeKey=this.primeKey*this.genreVal[i]*primeG[i];
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
	
	
	public void createNextUserIdeas(){
		this.setNextKey();
		for (List<String> x : this.possInsts){
			String[] tempArr = (java.lang.String[]) x.toArray();
			User_Idea_InstsPlayed y = new User_Idea_InstsPlayed(tempArr, this.nextKey);
			this.usserIdeasHere.add(y);
			this.nextUserIdeas.put(y.computePrimeKey(), y);
		}
	}

}
