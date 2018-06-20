package points;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class User_Idea_Genres {

	public User_Idea_Genres(int[] gVal, Integer prevKey, User_Idea_Goals old) {
		
		this.genreVal=gVal;
		this.prevLayer = old;
		this.prevKey=prevKey;
		this.nextKey=1;
		this.alive=false;
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
	private Integer primeKey;
	private User_Idea_Goals prevLayer;
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
	private boolean alive;
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
	
	
	public int getPrimeKey() {
		return primeKey;
	}

	public int getJazzPrime() {
		return jazzPrime;
	}

	public int getRockPrime() {
		return rockPrime;
	}

	public int getBluesPrime() {
		return bluesPrime;
	}

	public int getExperPrime() {
		return experPrime;
	}

	public int getClassPrime() {
		return classPrime;
	}

	public int getFunkPrime() {
		return funkPrime;
	}

	public int getLatinPrime() {
		return latinPrime;
	}

	public int getGospelPrime() {
		return gospelPrime;
	}

	public int getrNBPrime() {
		return rNBPrime;
	}

	public int getRapPrime() {
		return rapPrime;
	}

	public int getCountryPrime() {
		return countryPrime;
	}

	public int getFolkPrime() {
		return folkPrime;
	}

	public int getPopPrime() {
		return popPrime;
	}

	public int getElectronicPrime() {
		return electronicPrime;
	}

	public int getReggePrime() {
		return reggePrime;
	}

	public int[] getPrimeG() {
		return primeG;
	}

	public int[] getGenreVal() {
		return genreVal;
	}

	public Integer getPrevKey() {
		return prevKey;
	}

	public boolean isAlive() {
		return alive;
	}

	public HashMap<Integer, User_Idea_InstsPlayed> getNextUserIdeas() {
		return nextUserIdeas;
	}

	public List<List<String>> getPossInsts() {
		return possInsts;
	}

	public List<String> getInstsBank() {
		return instsBank;
	}

	public LinkedList<User_Idea_InstsPlayed> getUsserIdeasHere() {
		return usserIdeasHere;
	}

	public void setPrimeKey(int primeKey) {
		this.primeKey = primeKey;
	}

	public void setGenreVal(int[] genreVal) {
		this.genreVal = genreVal;
	}

	public void setPrevKey(Integer prevKey) {
		this.prevKey = prevKey;
	}

	public void setNextKey(Integer nextKey) {
		this.nextKey = nextKey;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
		this.prevLayer.setAlive(this.alive);
	}

	public void setNextUserIdeas(HashMap<Integer, User_Idea_InstsPlayed> nextUserIdeas) {
		this.nextUserIdeas = nextUserIdeas;
	}

	public void setPossInsts(List<List<String>> possInsts) {
		this.possInsts = possInsts;
	}

	public void setInstsBank(List<String> instsBank) {
		this.instsBank = instsBank;
	}

	public void setUsserIdeasHere(LinkedList<User_Idea_InstsPlayed> usserIdeasHere) {
		this.usserIdeasHere = usserIdeasHere;
	}

	public void createNextUserIdeas(){
		this.setNextKey();
		for (List<String> x : this.possInsts){
			String[] tempArr = (java.lang.String[]) x.toArray();
			User_Idea_InstsPlayed y = new User_Idea_InstsPlayed(tempArr, this.nextKey, this);
			this.usserIdeasHere.add(y);
			this.nextUserIdeas.put(y.computePrimeKey(), y);
		}
	}

}
