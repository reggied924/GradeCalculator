package main;

public class Assignment {
	
	private String name; 
	private int ttlPoints;
	private int pointsEarned; 
	
	public Assignment(String name){
		this.name = name; 
		this.ttlPoints = 0; 
		this.pointsEarned = 0; 
	}
	
	public void setName(String newName){
		this.name = newName; 
	}
	
	public String getName(){
		return this.name; 
	}
	
	public void setTotalPoints(int totalPoints){
		this.ttlPoints = totalPoints; 
	}
	
	public int getTotalPoints(){
		return this.ttlPoints; 
	}
	
	public void setPointsEarned(int pointsEarned){
		this.pointsEarned = pointsEarned;
	}
	
	public int getPointsEarned(){
		return this.pointsEarned; 
	}

}
