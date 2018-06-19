package points;

import java.util.HashMap;
import java.util.Set;

public class CompHolder {
	public CompHolder(HashMap<Integer, User_Idea> compUsers, Integer totalKey, int layer) {
		super();
		this.compUsers = compUsers;
		this.totalKey = totalKey;
		this.layer=layer;
	}
	private HashMap<Integer, User_Idea> compUsers;
	private Integer totalKey;
	private int layer;
	
	private void computeTotalKey(){
		Set x =this.compUsers.keySet();
		Integer[] y =(Integer[]) x.toArray();
		for(int i=0; i<y.length; i++){
			this.totalKey= y[i]*totalKey;
		}
	}

	public HashMap<Integer, User_Idea> getCompUsers() {
		return compUsers;
	}

	public Integer getTotalKey() {
		return totalKey;
	}

	public void setCompUsers(HashMap<Integer, User_Idea> compUsers) {
		this.compUsers = compUsers;
	}

	public void setTotalKey(Integer totalKey) {
		this.totalKey = totalKey;
	}
	
	
	
	
	
}
