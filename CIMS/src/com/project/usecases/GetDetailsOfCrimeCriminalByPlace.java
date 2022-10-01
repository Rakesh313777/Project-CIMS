package com.project.usecases;

import java.util.List;
import java.util.Scanner;

import com.project.bean.CrimeCriminalByPlace;
import com.project.dao.CrimeInfo;
import com.project.dao.CrimeInfoImpl;
import com.project.exceptions.CrimeCriminalException;

public class GetDetailsOfCrimeCriminalByPlace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the place of crime: ");
		String poc = sc.nextLine();
		
		
		CrimeInfo ci = new CrimeInfoImpl();
		
		try {
			
			List<CrimeCriminalByPlace> li1 =  ci.getTheCrimeAndCriminalDetailsByPlace(poc);
			
			li1.forEach(s -> System.out.println(s));
			
			
		} catch (CrimeCriminalException e) {
			
			System.out.println(e.getMessage());

		}
		
	}
	
}
