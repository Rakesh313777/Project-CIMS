package com.project.bean;

public class Criminal {
	
	 private String name_of_criminal;
	 private int  Age;                                 
	 private String Gender;          
	 private String Address;                             
	 private String Identifying_marks_in_face;            
	 private String area_of_crime_criminal_firstarrested;
	 private String attached_to_which_crime;
	 private int personId;
	 
	public String getName_of_criminal() {
		return name_of_criminal;
	}
	public void setName_of_criminal(String name_of_criminal) {
		this.name_of_criminal = name_of_criminal;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getIdentifying_marks_in_face() {
		return Identifying_marks_in_face;
	}
	public void setIdentifying_marks_in_face(String identifying_marks_in_face) {
		Identifying_marks_in_face = identifying_marks_in_face;
	}
	public String getArea_of_crime_criminal_firstarrested() {
		return area_of_crime_criminal_firstarrested;
	}
	public void setArea_of_crime_criminal_firstarrested(String area_of_crime_criminal_firstarrested) {
		this.area_of_crime_criminal_firstarrested = area_of_crime_criminal_firstarrested;
	}
	public String getAttached_to_which_crime() {
		return attached_to_which_crime;
	}
	public void setAttached_to_which_crime(String attached_to_which_crime) {
		this.attached_to_which_crime = attached_to_which_crime;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	
	
	
	
	public Criminal() {
		super();
	}
	
	
	public Criminal(String name_of_criminal, int age, String gender, String address, String identifying_marks_in_face,String area_of_crime_criminal_firstarrested, String attached_to_which_crime, int personId) {
		super();
		this.name_of_criminal = name_of_criminal;
		this.Age = age;
		this.Gender = gender;
		this.Address = address;
		this.Identifying_marks_in_face = identifying_marks_in_face;
		this.area_of_crime_criminal_firstarrested = area_of_crime_criminal_firstarrested;
		this.attached_to_which_crime = attached_to_which_crime;
		this.personId = personId;
	}
	
	
	@Override
	public String toString() {
		return "Criminal [name_of_criminal=" + name_of_criminal + ", Age=" + Age + ", Gender=" + Gender + ", Address="
				+ Address + ", Identifying_marks_in_face=" + Identifying_marks_in_face
				+ ", area_of_crime_criminal_firstarrested=" + area_of_crime_criminal_firstarrested
				+ ", attached_to_which_crime=" + attached_to_which_crime + ", personId=" + personId + "]";
	}
	 
	 

	 
	 
	 
}
