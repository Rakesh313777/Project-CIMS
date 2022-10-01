package com.project.usecases;

import java.util.Scanner;

import com.project.dao.CrimeInfo;
import com.project.dao.CrimeInfoImpl;
import com.project.exceptions.CrimeException;

public class UpdateCrimeStatus {
	
	public static void main(String[] args) throws CrimeException {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of victims to solve the status of crime");
		String ss = sc.nextLine();
		
		CrimeInfo cr = new CrimeInfoImpl();
		
	try {
			String re = cr.updateTheStatusAfterSolvingCrimeByVictimName(ss);
			
		System.out.println(re);
	}catch(CrimeException e)
	{
		System.out.println(e.getMessage());
	}
		
		
		
	}

}
