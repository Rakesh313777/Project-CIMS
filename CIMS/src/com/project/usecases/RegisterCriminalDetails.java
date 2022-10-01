package com.project.usecases;

import java.util.Scanner;

import com.project.bean.Criminal;
import com.project.dao.CrimeInfo;
import com.project.dao.CrimeInfoImpl;
import com.project.exceptions.CriminalExeption;

public class RegisterCriminalDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name_of_criminal :");
		   String cn = sc.nextLine();
		
		   System.out.println("Enter the Age: ");
		   int ag = sc.nextInt();
		   
		   sc.nextLine();
		   
		   System.out.println("Enter the Gender :");
		   String gn = sc.nextLine();
		   
		   System.out.println("Enter the Address: ");
		   String ad = sc.nextLine();
		   
		   System.out.println("Enter the Identifying_marks_in_face : ");
		   String fm = sc.nextLine();
		   
		   System.out.println("Enter the area_of_crime_criminal_firstarrested : ");
		   String arcf = sc.nextLine();
		   
		   
		   System.out.println("Enter the attached_to_which_crime : ");
		   String awc = sc.nextLine();
		   
		   System.out.println("Enter the personId: ");
		   int id = sc.nextInt();
		   
		   CrimeInfo cri2 = new CrimeInfoImpl();
		   
		     Criminal criminal = new Criminal();
		      criminal.setName_of_criminal(cn);
		      criminal.setAge(ag);
		      criminal.setGender(gn);
		      criminal.setAddress(ad);
		      criminal.setIdentifying_marks_in_face(fm);
		      criminal.setArea_of_crime_criminal_firstarrested(arcf);
		      criminal.setAttached_to_which_crime(awc);
		      criminal.setPersonId(id);
		  
		      
			try {
				
				String res1 = cri2.registerCriminal(criminal);
				System.out.println(res1);
				
				
			} catch (CriminalExeption e) {
			 
				System.out.println("please enter the correct area..");
			}
		   
		   

		   sc.close();
		   
	}
	
}
