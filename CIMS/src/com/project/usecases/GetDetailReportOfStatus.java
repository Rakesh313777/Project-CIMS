package com.project.usecases;

import java.util.List;

import com.project.bean.Crime;
import com.project.dao.CrimeInfo;
import com.project.dao.CrimeInfoImpl;
import com.project.exceptions.CrimeException;

public class GetDetailReportOfStatus {

	public static void main(String[] args) {
		
		CrimeInfo cr = new CrimeInfoImpl();
		
	   try {
		   
		List<Crime> li1 = cr.DetailedReportOfStatus();
		
		for(Crime l :li1) {
			
			System.out.println("Status: "+l.getStatus()+" == "+"count: "+ l.getCount());
			
		}
		
	} catch (CrimeException e) {
		System.out.println(e.getMessage());
	}
		
	}
	
}
