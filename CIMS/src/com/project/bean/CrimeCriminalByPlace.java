package com.project.bean;

public class CrimeCriminalByPlace {

	private int personId;
	private String name_of_criminal;
	private String area_of_crime_criminal_firstarrested;
	private String place_of_crime;
	private String under_police_station;
	private String Which_type_crime;
	private String victims;
	private String Detail_description_of_crime;
	private String names_of_main_suspected;
	private String status;
	
	
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getName_of_criminal() {
		return name_of_criminal;
	}
	public void setName_of_criminal(String name_of_criminal) {
		this.name_of_criminal = name_of_criminal;
	}
	public String getArea_of_crime_criminal_firstarrested() {
		return area_of_crime_criminal_firstarrested;
	}
	public void setArea_of_crime_criminal_firstarrested(String area_of_crime_criminal_firstarrested) {
		this.area_of_crime_criminal_firstarrested = area_of_crime_criminal_firstarrested;
	}
	public String getPlace_of_crime() {
		return place_of_crime;
	}
	public void setPlace_of_crime(String place_of_crime) {
		this.place_of_crime = place_of_crime;
	}
	public String getUnder_police_station() {
		return under_police_station;
	}
	public void setUnder_police_station(String under_police_station) {
		this.under_police_station = under_police_station;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

	public CrimeCriminalByPlace() {
		super();
	}
	public CrimeCriminalByPlace(int personId, String name_of_criminal, String area_of_crime_criminal_firstarrested,String place_of_crime, String under_police_station, String which_type_crime, String victims,String detail_description_of_crime, String names_of_main_suspected, String status) {
		super();
		this.personId = personId;
		this.name_of_criminal = name_of_criminal;
		this.area_of_crime_criminal_firstarrested = area_of_crime_criminal_firstarrested;
		this.place_of_crime = place_of_crime;
		this.under_police_station = under_police_station;
		this.Which_type_crime = which_type_crime;
		this.victims = victims;
		this.Detail_description_of_crime = detail_description_of_crime;
		this.names_of_main_suspected = names_of_main_suspected;
		this.status = status;
		
		
	}
	
	
	@Override
	public String toString() {
		return "CrimeCriminal [personId=" + personId + ", name_of_criminal=" + name_of_criminal
				+ ", area_of_crime_criminal_firstarrested=" + area_of_crime_criminal_firstarrested + ", place_of_crime="
				+ place_of_crime + ", under_police_station=" + under_police_station + ", Which_type_crime="
				+ Which_type_crime + ", victims=" + victims + ", Detail_description_of_crime="
				+ Detail_description_of_crime + ", names_of_main_suspected=" + names_of_main_suspected + ", status="
				+ status + "]";
	}
	
	
	
	
	
}
