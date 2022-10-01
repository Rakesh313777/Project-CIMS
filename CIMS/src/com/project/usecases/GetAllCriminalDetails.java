package com.project.usecases;

import java.util.List;

import com.project.bean.Crime;
import com.project.bean.Criminal;
import com.project.dao.CrimeInfo;
import com.project.dao.CrimeInfoImpl;
import com.project.exceptions.CrimeException;
import com.project.exceptions.CriminalExeption;

public class GetAllCriminalDetails {

	
	public static void main(String[] args) {
		
		CrimeInfo cri = new CrimeInfoImpl();
		
	     try {
	    	 
			List<Criminal> li3 =  cri.getAllCriminalDetails();
			
			 for(Criminal li:li3) {
				 
				 System.out.println("name_of_criminal: "+li.getName_of_criminal());
				 System.out.println("Age: "+li.getAge());
				 System.out.println("Gender: "+li.getGender());
				 System.out.println("Address: "+li.getAddress());
				 System.out.println("Identifying_marks_in_face: "+li.getIdentifying_marks_in_face());
				 System.out.println("area_of_crime_criminal_firstarrested: "+li.getArea_of_crime_criminal_firstarrested());
				 System.out.println("attached_to_which_crime: "+li.getAttached_to_which_crime());
				 System.out.println("personId: "+li.getPersonId());
				 System.out.println("=================================/n");
				 
			 }
			
//			li2.forEach(c -> System.out.println(c));
			
		} catch (CriminalExeption e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}
}
