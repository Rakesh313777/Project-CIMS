package com.project.usecases;

import java.util.Scanner;

import com.project.bean.Crime;
import com.project.dao.CrimeInfo;
import com.project.dao.CrimeInfoImpl;

public class RegisterCrimeDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Id no:");
		   int n = sc.nextInt();
		
		   System.out.println("Enter the datetime in yyyy-mm-dd hr:min:sec format");
		   String dt = sc.next();
		   
		   sc.nextLine();
		   
		   System.out.println("Enter the place of crime :");
		   String ar = sc.nextLine();
		   
		   System.out.println("Enter the which type of crime: ");
		   String wc = sc.nextLine();
		   
		   System.out.println("Enter the victims names: ");
		   String vt = sc.nextLine();
		   
		   System.out.println("Enter the Detail description of crime: ");
		   String des = sc.nextLine();
		   
		   
		   System.out.println("Enter the names of main suspected: ");
		   String sus = sc.nextLine();
		   
		   System.out.println("Enter the crime comes under which police station town: ");
		   String aups = sc.nextLine();
		   
		   System.out.println("Enter the status 'solved' or 'not solved' ");
		   String st = sc.nextLine();
		   
		 CrimeInfo cri1 = new CrimeInfoImpl();
		 
		 Crime crime = new Crime();
		   crime.setNumber(n);
		   crime.setDate_and_time(dt);
		   crime.setPlace_of_crime(ar);
		   crime.setWhich_type_crime(wc);
		   crime.setVictims(vt);
           crime.setDetail_description_of_crime(des);
           crime.setNames_of_main_suspected(sus);
           crime.setUnder_police_station(aups);
           crime.setStatus(st);
           
           String res = cri1.registerCrime(crime);
           System.out.println(res);
		 
//		 String res =  cri.registerCrime(n, dt, ar, wc, vt, des, sus,aups, st);
//		 
//		 System.out.println(res);
//		   
		sc.close();
	}
	
}
