package com.project.dao;

import java.util.List;

import com.project.bean.Crime;
import com.project.bean.CrimeCriminalByPlace;
import com.project.bean.Criminal;
import com.project.exceptions.CrimeCriminalException;
import com.project.exceptions.CrimeException;
import com.project.exceptions.CriminalExeption;

public interface CrimeInfo {

	public String registerCrime(Crime crime);
	
	public String registerCriminal(Criminal criminal)throws CriminalExeption;
	

	public List<Crime> getAllCrimeDetails()throws CrimeException;
	
	public List<Criminal> getAllCriminalDetails() throws CriminalExeption;
	
	public List<Crime> getCrimeDetailsByStatus(String status)throws CrimeException;
	
	
	public String updateTheStatusAfterSolvingCrimeByVictimName(String victims)throws CrimeException;
	
	
	public List<CrimeCriminalByPlace> getTheCrimeAndCriminalDetailsByPlace(String place_of_crime)throws CrimeCriminalException;
	
	public List<Crime> DetailedReportOfStatus()throws CrimeException;
	
	public Crime getDetailsOfCrimeBySearcingByNameOfVictim(String victims) throws CrimeException;
	
	public List<Crime> SearchByDateAndTimeNoOfCrimesRecorded(String x, String y)throws CrimeException;
	
	
	
}
