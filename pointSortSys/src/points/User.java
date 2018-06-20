package points;

import java.util.Arrays;
import java.util.LinkedList;

public class User {
	
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

	
	public User(String username, String email, String password, String firstName, String lastName, int[] genreVal,
			double posX, double posY, double maxDist, String[] lookignFors, String[] plays, int goals, int start) {
		
		
		
		this.username = username;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.genreVal = genreVal;
		this.posX = posX;
		this.posY = posY;
		this.maxDist = maxDist;
		this.area =maxDist*maxDist*Math.PI;
		this.lookingForS = lookignFors;
		this.plays=plays;
		this.tempCompScore= new Compatibility(this,125);
		this.goals=goals;
		this.lookingFor = new LinkedList<User>();
		this.lookingForMe =new LinkedList<User>();
		this.compatibleDistnInst =new LinkedList<User>();
		this.compatibleInst =new LinkedList<User>();
		this.compatibleSorted =new LinkedList<User>();
		this.compToMerch = new compMerchToUser(this, 0);
		this.possibleMerch=new LinkedList<merch>();
		String[] tempMerch = {""};
		this.lookingForMerch=tempMerch;
		this.jam=false;
		this.jamsIn=new LinkedList<jam>();
		this.jammers=new LinkedList<User>();
		this.jamsMade=new LinkedList<jam>();
		this.start=start;
		this.totalKey=0;
		
		if(this.genreVal[0]>=4){
			this.jazz=true;
			this.genreOrdered[0]="jazz";
			
		}
		if(this.genreVal[1]>=4){
			this.rock=true;
			this.genreOrdered[1]="rock";
		}
		if(this.genreVal[2]>=4){
			this.hipHop=true;
			this.genreOrdered[2]="hipHop";
		}
		if(this.genreVal[3]>=4){
			this.electronic=true;
			this.genreOrdered[3]="electronic";
		}
		if(this.genreVal[4]>=4){
			this.country=true;
			this.genreOrdered[4]="country";
		}
		if(this.genreVal[5]>=4){
			this.pop=true;
			this.genreOrdered[5]="pop";
		}
		if(this.genreVal[6]>=4){
			this.blues=true;
			this.genreOrdered[6]="blues";
		}
		if(this.genreVal[7]>=4){
			this.classical=true;
			this.genreOrdered[7]="classical";
		}
		if(this.genreVal[8]>=4){
			this.folk=true;
			this.genreOrdered[8]="folk";
		}
		if(this.genreVal[9]>=4){
			this.experimental=true;
			this.genreOrdered[9]="experimental";
		}
		if(this.genreVal[10]>=4){
			this.RnB=true;
			this.genreOrdered[10]="RnB";
		}
		if(this.genreVal[11]>=4){
			this.gospel=true;
			this.genreOrdered[11]="gospel";
		}
		if(this.genreVal[12]>=4){
			this.funk=true;
			this.genreOrdered[12]="funk";
		}
		if(this.genreVal[13]>=4){
			this.latin=true;
			this.genreOrdered[13]="latin";
		}
		if(this.genreVal[14]>=4){
			this.regge=true;
			this.genreOrdered[14]="regge";
		}
		
		
	}
	
	private String username, email, password, firstName, lastName, prefferedJamInst;
	private int[] genreVal;
	private int  goals, start;
	private Integer goalStartKey, genreKey, instsPlayKey, instsNeededKey, posKey, distKey, totalKey;
	private compMerchToUser compToMerch;
	private Compatibility tempCompScore;
	private double posX, posY, maxDist, area;
	private String[] plays, genreOrdered, lookingForS, lookingForMerch;
	private boolean jazz, blues, rock, hipHop, experimental, folk, RnB, pop, electronic, country, classical, gospel, funk, latin, regge, jam;
	private LinkedList<User> lookingForMe, lookingFor, compatibleInst, compatibleDistnInst, compatibleSorted;
	private LinkedList<merch> possibleMerch;
	private LinkedList<jam> jamsIn, jamsMade;
	private LinkedList<User> jammers;

	
	public compMerchToUser getCompToMerch() {
		return compToMerch;
	}
	public void setCompToMerch(compMerchToUser compToMerch) {
		this.compToMerch = compToMerch;
	}
	void setLookingFor(LinkedList<User> x){
		this.lookingFor = x;
		
	}
	void setLookingForMe(LinkedList<User> x){
		this.lookingForMe = x;
	}
	public String getUsername() {
		return username;
	}
	public String[] getLookingForS(){
		return this.lookingForS;
	}
	
	public String[] getLookingForMerch() {
		return lookingForMerch;
	}
	public void setLookingForMerch(String[] lookingForMerch) {
		this.lookingForMerch = lookingForMerch;
	}
	public Compatibility getTempCompScore() {
		return tempCompScore;
	}
	public LinkedList<User> getCompatibleSorted() {
		return compatibleSorted;
	}
	public void setTempCompScore(Compatibility tempCompScore) {
		this.tempCompScore = tempCompScore;
	}
	public void setCompatibleSorted(LinkedList<User> compatibleSorted) {
		this.compatibleSorted = compatibleSorted;
	}
	public LinkedList<User> getCompatibleDistnInst() {
		return compatibleDistnInst;
	}
	public void setCompatibleDistnInst(LinkedList<User> compatibleDistnInst) {
		this.compatibleDistnInst = compatibleDistnInst;
	}
	public LinkedList<User> getCompatibleInst() {
		return compatibleInst;
	}
	public void setCompatibleInst(LinkedList<User> compatibleInst) {
		this.compatibleInst = compatibleInst;
	}
	
	public LinkedList<merch> getPossibleMerch() {
		return possibleMerch;
	}
	public void setPossibleMerch(LinkedList<merch> possibleMerch) {
		this.possibleMerch = possibleMerch;
	}
	public String getEmail() {
		return email;
	}
	public int getGoals() {
		return goals;
	}
	public String[] getGenreOrdered() {
		return genreOrdered;
	}
	public LinkedList<User> getLookingForMe() {
		return lookingForMe;
	}
	public LinkedList<User> getLookingFor() {
		return lookingFor;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	public void setGenreOrdered(String[] genreOrdered) {
		this.genreOrdered = genreOrdered;
	}
	public void setLookingForS(String[] lookingForS) {
		this.lookingForS = lookingForS;
	}
	public String getPassword() {
		return password;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int[] getGenreVal() {
		return genreVal;
	}
	
	public double getPosX() {
		return posX;
	}
	public double getPosY() {
		return posY;
	}
	public double getMaxDist() {
		return maxDist;
	}
	public double getArea() {
		return area;
	}
	public String[] getPlays() {
		return plays;
	}
	public boolean isJazz() {
		return jazz;
	}
	public boolean isBlues() {
		return blues;
	}
	public boolean isRock() {
		return rock;
	}
	public boolean isHipHop() {
		return hipHop;
	}
	public boolean isExperimental() {
		return experimental;
	}
	public boolean isFolk() {
		return folk;
	}
	public boolean isRnB() {
		return RnB;
	}
	public boolean isPop() {
		return pop;
	}
	public boolean isElectronic() {
		return electronic;
	}
	public boolean isCountry() {
		return country;
	}
	
	public String getPrefferedJamInst() {
		return prefferedJamInst;
	}
	public LinkedList<jam> getJamsIn() {
		return jamsIn;
	}
	public LinkedList<jam> getJamsMade() {
		return jamsMade;
	}
	public LinkedList<User> getJammers() {
		return jammers;
	}
	public void setPrefferedJamInst(String prefferedJamInst) {
		this.prefferedJamInst = prefferedJamInst;
	}
	public void setJamsIn(LinkedList<jam> jamsIn) {
		this.jamsIn = jamsIn;
	}
	public void setJamsMade(LinkedList<jam> jamsMade) {
		this.jamsMade = jamsMade;
	}
	public void setJammers(LinkedList<User> jammers) {
		this.jammers = jammers;
	}
	public boolean isClassical() {
		return classical;
	}
	public boolean isGospel() {
		return gospel;
	}
	public boolean isFunk() {
		return funk;
	}
	public boolean isLatin() {
		return latin;
	}
	public boolean isRegge() {
		return regge;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setGenreVal(int[] genreVal) {
		this.genreVal = genreVal;
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
	public int getStart() {
		return start;
	}
	public Integer getGoalStartKey() {
		return goalStartKey;
	}
	public Integer getGenreKey() {
		return genreKey;
	}
	public Integer getInstsPlayKey() {
		return instsPlayKey;
	}
	public Integer getInstsNeededKey() {
		return instsNeededKey;
	}
	public Integer getPosKey() {
		return posKey;
	}
	public Integer getDistKey() {
		return distKey;
	}
	public Integer getTotalKey() {
		return totalKey;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public void setGoalStartKey(Integer goalStartKey) {
		this.goalStartKey = goalStartKey;
	}
	public void setGenreKey(Integer genreKey) {
		this.genreKey = genreKey;
	}
	public void setInstsPlayKey(Integer instsPlayKey) {
		this.instsPlayKey = instsPlayKey;
	}
	public void setInstsNeededKey(Integer instsNeededKey) {
		this.instsNeededKey = instsNeededKey;
	}
	public void setPosKey(Integer posKey) {
		this.posKey = posKey;
	}
	public void setDistKey(Integer distKey) {
		this.distKey = distKey;
	}
	public void setTotalKey(Integer totalKey) {
		this.totalKey = totalKey;
	}
	public void setPosX(double posX) {
		this.posX = posX;
	}
	public void setPosY(double posY) {
		this.posY = posY;
	}
	public void setMaxDist(double maxDist) {
		this.maxDist = maxDist;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setPlays(String[] plays) {
		this.plays = plays;
	}
	public void setJazz(boolean jazz) {
		this.jazz = jazz;
	}
	public void setBlues(boolean blues) {
		this.blues = blues;
	}
	public void setRock(boolean rock) {
		this.rock = rock;
	}
	public void setHipHop(boolean hipHop) {
		this.hipHop = hipHop;
	}
	public void setExperimental(boolean experimental) {
		this.experimental = experimental;
	}
	public void setFolk(boolean folk) {
		this.folk = folk;
	}
	public void setRnB(boolean rnB) {
		RnB = rnB;
	}
	public void setPop(boolean pop) {
		this.pop = pop;
	}
	public void setElectronic(boolean electronic) {
		this.electronic = electronic;
	}
	public void setCountry(boolean country) {
		this.country = country;
	}
	public void setClassical(boolean classical) {
		this.classical = classical;
	}
	public void setGospel(boolean gospel) {
		this.gospel = gospel;
	}
	public void setFunk(boolean funk) {
		this.funk = funk;
	}
	public void setLatin(boolean latin) {
		this.latin = latin;
	}
	public void setRegge(boolean regge) {
		this.regge = regge;
	}
	@Override
	public String toString() {
		String user = "";
		user= "User [username: " + username + ", Instruments:";
		for (int i=0; i<this.plays.length; i++){
			user+= " "+this.plays[i]+",";
		}
		user+="]";
		return user;
	}
	
	
	@Override
	public int hashCode() {
		this.genreKey=1;
		for(int i=0; i<this.genreVal.length; i++){
			this.genreKey=this.genreKey*this.genreVal[i]*primeG[i];
		}
		
		this.instsNeededKey=0;
		for(int i=0; i<this.lookingForS.length; i++){
			this.instsNeededKey=this.lookingForS[i].hashCode()+this.instsNeededKey;
		}
		this.goalStartKey=0;
		switch(this.goals){
			case 1:
				this.goals=61;
				break;
			case 2:
				this.goals=67;
				break;
			case 3:
				this.goals=71;
				break;
			case 4:
				this.goals=73;
				break;
			case 5:
				this.goals=79;
				break;
		}
		switch(this.start){
		case 1:
			this.start=61;
			break;
		case 2:
			this.start=67;
			break;
		case 3:
			this.start=71;
			break;
		case 4:
			this.start=73;
			break;
		case 5:
			this.start=79;
			break;
		}
		
		this.goalStartKey=this.goals*this.start;
		this.instsPlayKey=0;
		for(int i=0; i<this.plays.length; i++){
			this.instsPlayKey=this.plays[i].hashCode()+this.instsPlayKey;
		}
		
		this.posKey=((int)(this.posX)*83)*((int)(this.posY)*97);
		this.distKey=(int)this.maxDist * 101;
		this.totalKey=goalStartKey*instsPlayKey*this.genreKey*this.instsNeededKey;
		return this.totalKey;
		
	}
	
	public Integer getHashCode(){
		return this.totalKey;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (RnB != other.RnB)
			return false;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (blues != other.blues)
			return false;
		if (classical != other.classical)
			return false;
		if (compatibleDistnInst == null) {
			if (other.compatibleDistnInst != null)
				return false;
		} else if (!compatibleDistnInst.equals(other.compatibleDistnInst))
			return false;
		if (compatibleInst == null) {
			if (other.compatibleInst != null)
				return false;
		} else if (!compatibleInst.equals(other.compatibleInst))
			return false;
		if (compatibleSorted == null) {
			if (other.compatibleSorted != null)
				return false;
		} else if (!compatibleSorted.equals(other.compatibleSorted))
			return false;
		if (country != other.country)
			return false;
		if (electronic != other.electronic)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (experimental != other.experimental)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (folk != other.folk)
			return false;
		if (funk != other.funk)
			return false;
		if (!Arrays.equals(genreOrdered, other.genreOrdered))
			return false;
		if (!Arrays.equals(genreVal, other.genreVal))
			return false;
		if (goals != other.goals)
			return false;
		if (gospel != other.gospel)
			return false;
		if (hipHop != other.hipHop)
			return false;
		if (jazz != other.jazz)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (latin != other.latin)
			return false;
		if (lookingFor == null) {
			if (other.lookingFor != null)
				return false;
		} else if (!lookingFor.equals(other.lookingFor))
			return false;
		if (lookingForMe == null) {
			if (other.lookingForMe != null)
				return false;
		} else if (!lookingForMe.equals(other.lookingForMe))
			return false;
		if (!Arrays.equals(lookingForS, other.lookingForS))
			return false;
		if (Double.doubleToLongBits(maxDist) != Double.doubleToLongBits(other.maxDist))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (!Arrays.equals(plays, other.plays))
			return false;
		if (pop != other.pop)
			return false;
		if (Double.doubleToLongBits(posX) != Double.doubleToLongBits(other.posX))
			return false;
		if (Double.doubleToLongBits(posY) != Double.doubleToLongBits(other.posY))
			return false;
		if (regge != other.regge)
			return false;
		if (rock != other.rock)
			return false;
		if (tempCompScore == null) {
			if (other.tempCompScore != null)
				return false;
		} else if (!tempCompScore.equals(other.tempCompScore))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	public void jamMaker(int startTime, int endTime, double posX, double posY, String city, String state, String country, int spots, LinkedList<String> instsNeeded,LinkedList<User> allUsers ){
		jam x = new jam(startTime,endTime,this,posX,posY,city,state,country, spots, instsNeeded );
		cleanUpJams();
		this.jamsIn.add(x);
		this.jamsMade.add(x);
		this.jam=true;
		jamAlg y= new jamAlg(allUsers);
		y.matchActiveJammers(x);
	}
	
	public boolean isJam() {
		return jam;
	}
	public void setJam(boolean jam) {
		this.jam = jam;
	}
	
	public void cleanUpJams(){
		for (jam x: this.jamsIn){
			if(!x.isActive()){
				jamsIn.remove(x);
				jamsMade.remove(x);
			}
		}
	}
	
	public boolean checkForActive(){
		for (jam x: this.jamsIn){
			if(x.isActive()) {
				this.jam=true;
				return this.jam;
			}
		}
		this.jam=false;
		return this.jam;
	}

	public void joinJam(jam x){
		x.addJammers(this);
		
	}
}
