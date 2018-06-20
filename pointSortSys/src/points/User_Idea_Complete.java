package points;

import java.util.HashMap;

public class User_Idea_Complete{

	public User_Idea_Complete( Integer prevKey, User_Idea_InstsNeeded oldIdea) {
		this.prevKey=prevKey;
		this.finalKey=prevKey;
		this.usersHere= new HashMap<Integer, User>();
		this.finalAlive=false;
		this.prevLayer=oldIdea;
		// TODO Auto-generated constructor stub
	}

	private Integer prevKey;
	private boolean finalAlive;
	private Integer finalKey;
	private User_Idea_InstsNeeded prevLayer;
	private HashMap<Integer, User> usersHere;
	private double totalPosx, totalPosY, totalMaxDist, totalUsers, avgX, avgY, avgMax;
	private HashMap<Integer, User_Idea_PosNDist> exisitingPos;
	public void store(User aUser){
		usersHere.put(aUser.hashCode(), aUser);
		User_Idea_PosNDist x = new User_Idea_PosNDist( aUser, aUser.getPosX(), aUser.getPosY(), aUser.getMaxDist(), this.prevKey);
		
		exisitingPos.put(aUser.getPosKey(), x);
		this.finalAlive=true;
		this.prevLayer.setAlive(finalAlive);
		this.totalUsers+=1;
		this.totalPosx+=aUser.getPosX();
		this.totalPosY+=aUser.getPosY();
		this.totalMaxDist+=aUser.getMaxDist();
		this.avgX=this.totalPosx/this.totalUsers;
		this.avgY=this.totalPosY/this.totalUsers;
		this.avgMax=this.totalMaxDist/this.totalUsers;
		
	}

	public Integer getPrevKey() {
		return prevKey;
	}

	public boolean isFinalAlive() {
		return finalAlive;
	}

	public Integer getFinalKey() {
		return finalKey;
	}

	public HashMap<Integer, User> getUsersHere() {
		return usersHere;
	}

	public double getTotalPosx() {
		return totalPosx;
	}

	public double getTotalPosY() {
		return totalPosY;
	}

	public double getTotalMaxDist() {
		return totalMaxDist;
	}

	public double getTotalUsers() {
		return totalUsers;
	}

	public double getAvgX() {
		return avgX;
	}

	public double getAvgY() {
		return avgY;
	}

	public double getAvgMax() {
		return avgMax;
	}

	public void setPrevKey(Integer prevKey) {
		this.prevKey = prevKey;
	}

	public void setFinalAlive(boolean finalAlive) {
		this.finalAlive = finalAlive;
	}

	public void setFinalKey(Integer finalKey) {
		this.finalKey = finalKey;
	}

	public void setUsersHere(HashMap<Integer, User> usersHere) {
		this.usersHere = usersHere;
	}

	public void setTotalPosx(double totalPosx) {
		this.totalPosx = totalPosx;
	}

	public void setTotalPosY(double totalPosY) {
		this.totalPosY = totalPosY;
	}

	public void setTotalMaxDist(double totalMaxDist) {
		this.totalMaxDist = totalMaxDist;
	}

	public void setTotalUsers(double totalUsers) {
		this.totalUsers = totalUsers;
	}

	public void setAvgX(double avgX) {
		this.avgX = avgX;
	}

	public void setAvgY(double avgY) {
		this.avgY = avgY;
	}

	public void setAvgMax(double avgMax) {
		this.avgMax = avgMax;
	}
	
	
}
