package com.project.usecases;

import java.util.Scanner;

import com.project.bean.Crime;
import com.project.dao.CrimeInfo;
import com.project.dao.CrimeInfoImpl;
import com.project.exceptions.CrimeException;

public class SearchCrimeDetailsByNameOfVictim {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the victims name to Search the Details Of Crime ");
		String st = sc.nextLine();
		
		CrimeInfo c1 = new CrimeInfoImpl();
		
		  try {
			  
			Crime cz = c1.getDetailsOfCrimeBySearcingByNameOfVictim(st);
			
			System.out.println("seq no: "+cz.getNumber());
			 System.out.println("Date_and_time: "+cz.getDate_and_time());
			 System.out.println("Area_of_crime: "+cz.getPlace_of_crime());
			 System.out.println("Which_type_crime: "+cz.getWhich_type_crime());
			 System.out.println("Victims: "+cz.getVictims());
			 System.out.println("Detail_description_of_crime: "+cz.getDetail_description_of_crime());
			 System.out.println("Names_of_main_suspected: "+cz.getNames_of_main_suspected());
			 System.out.println("Under_police_station: "+cz.getUnder_police_station());
			 System.out.println("Status: "+cz.getStatus());
			 System.out.println("=================================/n");
			
			
		} catch (CrimeException e) {

            System.out.println(e.getMessage()); 
			
		}
		
		
		
	}

}
