package main;

import java.util.ArrayList;

public class Student {
	
	private String name; 
	private ArrayList<Class> classes;
	
	public Student(String name){
		
		this.name = name; 
		this.classes = new ArrayList<Class>(); 
		
	}
	
	public void setName(String newName){
		this.name = newName; 
		
	}
	
	public String getName(){
		return this.name; 
	}
	
	public void addClasses(Class newClass){
		classes.add(newClass); 
	}
	
	public ArrayList<Class> getClasses(){
		return this.classes; 
	}

}
