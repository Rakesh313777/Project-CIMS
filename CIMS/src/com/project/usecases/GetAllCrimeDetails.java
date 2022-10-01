package com.project.usecases;

import java.util.List;

import com.project.bean.Crime;
import com.project.dao.CrimeInfo;
import com.project.dao.CrimeInfoImpl;
import com.project.exceptions.CrimeException;

public class GetAllCrimeDetails {
	
	public static void main(String[] args) {
		
		
		CrimeInfo cri1 = new CrimeInfoImpl();
		
		     try {
		    	 
				List<Crime> li2 =  cri1.getAllCrimeDetails();
				
				 for(Crime li:li2) {
					 
					 System.out.println("seq no: "+li.getNumber());
					 System.out.println("Date_and_time: "+li.getDate_and_time());
					 System.out.println("Area_of_crime: "+li.getPlace_of_crime());
					 System.out.println("Which_type_crime: "+li.getWhich_type_crime());
					 System.out.println("Victims: "+li.getVictims());
					 System.out.println("Detail_description_of_crime: "+li.getDetail_description_of_crime());
					 System.out.println("Names_of_main_suspected: "+li.getNames_of_main_suspected());
					 System.out.println("Under_police_station: "+li.getUnder_police_station());
					 System.out.println("Status: "+li.getStatus());
					 System.out.println("=================================/n");
					 
				 }
				
//				li2.forEach(c -> System.out.println(c));
				
			} catch (CrimeException e) {
				
				System.out.println(e.getMessage());
				
			}
		
		
	}

}
