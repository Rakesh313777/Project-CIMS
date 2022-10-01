package com.project.usecases;

import java.util.List;
import java.util.Scanner;

import com.project.bean.Crime;
import com.project.dao.CrimeInfo;
import com.project.dao.CrimeInfoImpl;
import com.project.exceptions.CrimeException;

public class SearchByDateAndTimeNoOfCrimesRecords {

	
	public static void main(String[] args) {
		
		Scanner s3 = new Scanner(System.in);
		
		System.out.println("Enter the  dates and time formats");
		System.out.println("Enter the '1st' dateandtime in yy-mm-dd hr:ms:ss format to find No Of Crimes Recorded with area wise");
		
		String dt1 = s3.nextLine();
		
		System.out.println("Enter the '2nd' dateandtime in yy-mm-dd hr:ms:ss format to find No Of Crimes Recorded with area wise");
		
		String dt2 = s3.nextLine();
		
		
		CrimeInfo ci = new CrimeInfoImpl();
		
		  try {
			  
			List<Crime> lz = ci.SearchByDateAndTimeNoOfCrimesRecorded(dt1,dt2);
			
			for(Crime l :lz) {
				
				System.out.println("place_of_crime: "+l.getPlace_of_crime()+" = "+"count: "+l.getCount());
				
			}
			
			
		} catch (CrimeException e) {

            System.out.println(e.getMessage());       
			
		}
		
		
	}
}
