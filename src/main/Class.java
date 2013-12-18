package main;

import java.util.ArrayList;

public class Class {
	
	private String name;
	private int numOfAssignments; 
	private ArrayList<Assignment> assignments; 
	
	public Class(String name){
		this.name = name; 
		this.numOfAssignments = 0; 
		this.assignments = new ArrayList<Assignment>(); 
		
	}
	
	public void setName(String className){
		this.name = className; 
	}
	
	public String getName(){
		return this.name; 
	}
	
	public void setNumOfAssignments(int numAssignments){
		this.numOfAssignments = numAssignments; 
		
	}
	
	public int getNumOfAssignments(){
		return this.numOfAssignments; 
	}
	
	public void addClasses(Assignment addedAssignment){
		this.assignments.add(addedAssignment); 
		
	}
	
	public ArrayList<Assignment> getAssignments(){
		return this.assignments; 
	}

}//end of class 
