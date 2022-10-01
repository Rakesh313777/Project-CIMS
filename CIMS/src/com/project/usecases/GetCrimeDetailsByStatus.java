package com.project.usecases;

import java.util.List;
import java.util.Scanner;

import com.project.bean.Crime;
import com.project.dao.CrimeInfo;
import com.project.dao.CrimeInfoImpl;
import com.project.exceptions.CrimeException;

public class GetCrimeDetailsByStatus {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the status 'solved' 'not solved' ");
		String sv = sc.nextLine().toLowerCase();
		
		
		CrimeInfo cr = new CrimeInfoImpl();
		
		 try {
			 
			List<Crime> ls = cr.getCrimeDetailsByStatus(sv);
			
			for(Crime ls1 :ls) {
				
				 System.out.println("seq no: "+ls1.getNumber());
				 System.out.println("Date_and_time: "+ls1.getDate_and_time());
				 System.out.println("Area_of_crime: "+ls1.getPlace_of_crime());
				 System.out.println("Which_type_crime: "+ls1.getWhich_type_crime());
				 System.out.println("Victims: "+ls1.getVictims());
				 System.out.println("Detail_description_of_crime: "+ls1.getDetail_description_of_crime());
				 System.out.println("Names_of_main_suspected: "+ls1.getNames_of_main_suspected());
				 System.out.println("Under_police_station: "+ls1.getUnder_police_station());
				 System.out.println("Status: "+ls1.getStatus());
				 System.out.println("=================================/n");
				
				
			}
			
			
		} catch (CrimeException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
	}
	
}
