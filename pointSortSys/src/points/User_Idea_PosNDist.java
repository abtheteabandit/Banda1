package points;

import java.util.HashMap;
import java.util.LinkedList;

public class User_Idea_PosNDist  {

	public User_Idea_PosNDist(User aUser, double posXX, double posYY, double maxDistIn, Integer prevKey) {
	
		this.posX=posXX;
		this.posY=posYY;
		this.maxDist=maxDistIn;
		this.prevKey=prevKey;
		aUser.hashCode();
		this.posKey=aUser.getPosKey();
		this.distKey=aUser.getDistKey();
		this.primeKey=this.posKey*this.distKey;
		this.alive=true;
		
		this.usersHere.add(aUser);
		// TODO Auto-generated constructor stub
	}
	private double posX, posY, maxDist;
	private Integer prevKey, primeKey, posKey, distKey;
	private LinkedList<User> usersHere;
	private boolean alive;
	
	public void store(User x){
		usersHere.add(x);
	}
	
	
}
