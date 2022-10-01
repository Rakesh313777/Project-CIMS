package com.project.bean;

public class Crime {

	private int number;
	private String  Date_and_time;
	private String place_of_crime; 	
	private String Which_type_crime;           
	private String victims ;                    
	private String Detail_description_of_crime; 
	private String names_of_main_suspected;     
	private String under_police_station;        
	private String status;
	
	
	private int count;
	

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDate_and_time() {
		return Date_and_time;
	}
	public void setDate_and_time(String date_and_time) {
		Date_and_time = date_and_time;
	}
	public String getPlace_of_crime() {
		return place_of_crime;
	}
	public void setPlace_of_crime(String place_of_crime) {
		this.place_of_crime = place_of_crime;
	}
	public String getWhich_type_crime() {
		return Which_type_crime;
	}
	public void setWhich_type_crime(String which_type_crime) {
		Which_type_crime = which_type_crime;
	}
	public String getVictims() {
		return victims;
	}
	public void setVictims(String victims) {
		this.victims = victims;
	}
	public String getDetail_description_of_crime() {
		return Detail_description_of_crime;
	}
	public void setDetail_description_of_crime(String detail_description_of_crime) {
		Detail_description_of_crime = detail_description_of_crime;
	}
	public String getNames_of_main_suspected() {
		return names_of_main_suspected;
	}
	public void setNames_of_main_suspected(String names_of_main_suspected) {
		this.names_of_main_suspected = names_of_main_suspected;
	}
	public String getUnder_police_station() {
		return under_police_station;
	}
	public void setUnder_police_station(String under_police_station) {
		this.under_police_station = under_police_station;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	public Crime() {
		super();
	}
	
	
	public Crime(int number, String date_and_time, String place_of_crime, String which_type_crime, String victims,String detail_description_of_crime, String names_of_main_suspected, String under_police_station,String status) {
		super();
		this.number = number;
		this.Date_and_time = date_and_time;
		this.place_of_crime = place_of_crime;
		this.Which_type_crime = which_type_crime;
		this.victims = victims;
		this.Detail_description_of_crime = detail_description_of_crime;
		this.names_of_main_suspected = names_of_main_suspected;
		this.under_police_station = under_police_station;
		this.status = status;
	}
	

	
	
	
}
