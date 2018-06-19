package points;

import java.util.HashMap;

public class User_Idea_Complete{

	public User_Idea_Complete( Integer prevKey) {
		this.prevKey=prevKey;
		this.finalKey=prevKey;
		this.usersHere= new HashMap<Integer, User>();
		// TODO Auto-generated constructor stub
	}

	private Integer prevKey;
	private Integer finalKey;
	private HashMap<Integer, User> usersHere;
}
