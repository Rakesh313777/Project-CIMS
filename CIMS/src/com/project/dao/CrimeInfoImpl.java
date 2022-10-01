package com.project.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.bean.Crime;
import com.project.bean.CrimeCriminalByPlace;
import com.project.bean.Criminal;
import com.project.exceptions.CrimeCriminalException;
import com.project.exceptions.CrimeException;
import com.project.exceptions.CriminalExeption;
import com.project.utility.DBUtil;

public class CrimeInfoImpl implements CrimeInfo{

//	  crime Register details------------------------------------------------------------------------------------>
	
	@Override
	public String registerCrime(Crime crime) {
		
		String message = "Not inserted..........";
		
		try(Connection conn = DBUtil.provideConnection()){
			
		
			PreparedStatement ps = conn.prepareStatement("insert into crime values(?,?,?,?,?,?,?,?,?)");
			
			 ps.setInt(1, crime.getNumber());
			 ps.setString(2, crime.getDate_and_time());
			 ps.setString(3, crime.getPlace_of_crime());
			 ps.setString(4, crime.getWhich_type_crime());
			 ps.setString(5, crime.getVictims());
			 ps.setString(6, crime.getDetail_description_of_crime());
			 ps.setString(7, crime.getNames_of_main_suspected());
			 ps.setString(8, crime.getUnder_police_station());
			 ps.setString(9, crime.getStatus());
		
			int x = ps.executeUpdate();
			if(x>0) {
				message = "crime added successfull......to list";
			}
			
			
		}catch(SQLException e)
		{
		   message = e.getMessage();
			
		}
		
		
		
		return message;
		
		
	}

//	criminal Register details------------------------------------------------------------------------------>
	
	
	@Override
	public String registerCriminal(Criminal criminal) throws CriminalExeption{
		
		String message = "Not inserted..............";
		
		try(Connection conn = DBUtil.provideConnection()){
			
			
			PreparedStatement ps = conn.prepareStatement("insert into criminal values(?,?,?,?,?,?,?,?)");
			
			 ps.setString(1, criminal.getName_of_criminal());
			 ps.setInt(2, criminal.getAge());
			 ps.setString(3, criminal.getGender());
			 ps.setString(4, criminal.getAddress());
			 ps.setString(5, criminal.getIdentifying_marks_in_face());
			 ps.setString(6, criminal.getArea_of_crime_criminal_firstarrested());
			 ps.setString(7, criminal.getAttached_to_which_crime());
			 ps.setInt(8, criminal.getPersonId());
			
			int x = ps.executeUpdate();
			if(x>0) {
				message = "criminal added successfull...... to list";
			}
			
			
		}catch(SQLException e)
		{
			throw new CriminalExeption(e.getMessage());
			
		}
		
		
		
		
		return message;
	}

//	Get crime details---------------------------------------------------------------------------------->
	
	@Override
	public List<Crime> getAllCrimeDetails() throws CrimeException {
		
		List<Crime> lis = new ArrayList();
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from crime");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				int num = rs.getInt("number");
				String dtm = rs.getString("Date_and_time");
				String arc = rs.getString("place_of_crime");
				String wtc = rs.getString("Which_type_crime");
				String vt = rs.getString("victims");
				String ddc = rs.getString("Detail_description_of_crime");
				String nms = rs.getString("names_of_main_suspected");
				String ups = rs.getString("under_police_station");
				String st = rs.getString("status");
				
				Crime cr = new Crime(num, dtm, arc, wtc, vt, ddc, nms, ups, st);
				
				lis.add(cr);
				
			}
			
		}catch(SQLException e)
		{
			throw new CrimeException(e.getMessage());
			
		}
		
		if(lis.size() == 0)
		{
			throw new CrimeException("No Crime Records found....");
		}
		
		
		return lis;
		
	}
	
	
//	Get criminal details---------------------------------------------------------------------------------->

	@Override
	public List<Criminal> getAllCriminalDetails() throws CriminalExeption {
		
		List<Criminal> lis1 = new ArrayList();
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from criminal");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				String nme = rs.getString("name_of_criminal");
				int ag = rs.getInt("Age");
				String gd = rs.getString("Gender");
				String ad = rs.getString("Address");
				String imf = rs.getString("Identifying_marks_in_face");
				String accf = rs.getString("area_of_crime_criminal_firstarrested");
				String atc = rs.getString("attached_to_which_crime");
				int id = rs.getInt("personId");
			
				Criminal crimi = new Criminal(nme, ag, gd, ad, imf, accf,atc,id);
				
				lis1.add(crimi);
				
			}
			
		}catch(SQLException e)
		{
			throw new CriminalExeption(e.getMessage());
			
		}
		
		if(lis1.size() == 0)
		{
			throw new CriminalExeption("No Criminal Records found....");
		}
		
		
		
		return lis1;
	}

	
//	get Crime Details By Status---------------------------------------------------------------------------------->
	 
	@Override
	public List<Crime> getCrimeDetailsByStatus(String status) throws CrimeException {
		
		List<Crime> list = new ArrayList();
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from crime where status = ?");
			ps.setString(1, status);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				int num = rs.getInt("number");
				String dtm = rs.getString("Date_and_time");
				String arc = rs.getString("place_of_crime");
				String wtc = rs.getString("Which_type_crime");
				String vt = rs.getString("victims");
				String ddc = rs.getString("Detail_description_of_crime");
				String nms = rs.getString("names_of_main_suspected");
				String ups = rs.getString("under_police_station");
				String st = rs.getString("status");
				
				Crime cr1 = new Crime(num, dtm, arc, wtc, vt, ddc, nms, ups, st);
				
				list.add(cr1);
				
			}
			
		}catch(SQLException e)
		{
			throw new CrimeException(e.getMessage());
			
		}
		
		if(list.size() == 0)
		{
			throw new CrimeException("No Crime_solved Records found....");
		}
		
		
		
		
		
		return list;
	}

	
//	update The Status After Solving Crime By victims Name---------------------------------------------------------------------------------->
	
	@Override
	public String updateTheStatusAfterSolvingCrimeByVictimName(String victims)throws CrimeException  {
		
		String message = "please enter correct name....";
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("update crime set status = 'solved' where victims = ? ");
			
			ps.setString(1, victims);
			
			  int x = ps.executeUpdate(); 
			  
			  if(x>0) {
				  
				  message = "update susccesfull......";
			  }
	          
			
		}catch(SQLException e)
		{
			message = e.getMessage();
			
		}
		

		return message;
	}

//	get The Crime And Criminal Details By Place of crime---------------------------------------------------------------------------------->
	 
	@Override
	public List<CrimeCriminalByPlace> getTheCrimeAndCriminalDetailsByPlace(String place_of_crime)throws CrimeCriminalException {
		
		List<CrimeCriminalByPlace> lis1 = new ArrayList();
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select cm.personId,cm.name_of_criminal,cm.area_of_crime_criminal_firstarrested,c.place_of_crime,c.under_police_station,c.Which_type_crime,c.victims,c.Detail_description_of_crime,c.names_of_main_suspected,c.status from crime c INNER JOIN criminal cm ON c.number = cm.personId where c.place_of_crime = ? ");
			ps.setString(1,place_of_crime );
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				int pid = rs.getInt("personId");
				String noc = rs.getString("name_of_criminal");
				String aoccf = rs.getString("area_of_crime_criminal_firstarrested");
				String poc = rs.getString("place_of_crime");
				String upc = rs.getString("under_police_station");
				String wtc = rs.getString("Which_type_crime");
				String v = rs.getString("victims");
				String ddoc = rs.getString("Detail_description_of_crime");
				String noms = rs.getString("names_of_main_suspected");
				String st = rs.getString("status");
				
				
				CrimeCriminalByPlace ccbp = new CrimeCriminalByPlace(pid, noc, aoccf, poc, upc,wtc, v, ddoc, noms, st);
				
						lis1.add(ccbp);
						
			}
			
		}catch(SQLException e)
		{
			throw new CrimeCriminalException(e.getMessage());
			
		}
		
		if(lis1.size() == 0)
		{
			throw new CrimeCriminalException("No Records found....");
		}
		
			
		return lis1;
	}

//	Detailed Report Of Status ------------------------------------------------------------------------>
	
@Override
public List<Crime> DetailedReportOfStatus() throws CrimeException {
	
	List<Crime> list1 = new ArrayList();
	
	try(Connection conn = DBUtil.provideConnection()){
		
		PreparedStatement ps = conn.prepareStatement("select status,count(*)count from crime group by status");
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			
			String st = rs.getString("status");
			int c = rs.getInt("count");
			
			Crime cr = new Crime();
			 cr.setStatus(st);
			 cr.setCount(c);
			
			
			list1.add(cr);
			
		}
		
	}catch(SQLException e)
	{
		throw new CrimeException(e.getMessage());
		
	}
	
	if(list1.size() == 0)
	{
		throw new CrimeException("No status Records found....");
	}
	
	
	return list1;
	
}

//getDetailsOfCrimeBySearcingByNameOfVictim---------------------------------------------------------------->

@Override
public Crime getDetailsOfCrimeBySearcingByNameOfVictim(String victims) throws CrimeException {
	Crime crime = null;
	
	
	try(Connection conn = DBUtil.provideConnection()){
		
		  PreparedStatement ps = conn.prepareStatement("select * from crime where victims = ?");	
			ps.setString(1, victims);
		  
		  
		  ResultSet rs = ps.executeQuery();
		  
		  if(rs.next()) {
			  
			  int n = rs.getInt("number");
			  String dt = rs.getString("Date_and_time");
			  String poc = rs.getString("place_of_crime");
			  String wtc = rs.getString("Which_type_crime");
			  String vt = rs.getString("victims");
			  String ddc = rs.getString("Detail_description_of_crime");
			  String nms = rs.getString("names_of_main_suspected");
			  String ups = rs.getString("under_police_station");
			  String st = rs.getString("status");
		
			  crime = new Crime(n, dt,poc,wtc,vt,ddc,nms,ups, st);
			

		  }else {
			  
			  throw new CrimeException("Details not found with this victim "+victims);
		  }
		  
		  
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new CrimeException(e.getMessage());
		}
	
	
	return crime;
}

//Search By DateAndTime No Of Crimes Recorded--------------------------------------------------------------------------->


@Override
public List<Crime> SearchByDateAndTimeNoOfCrimesRecorded(String x, String y) throws CrimeException {

	List<Crime> ls = new ArrayList<>();
	
	
	try(Connection conn = DBUtil.provideConnection()){
		
		  PreparedStatement ps = conn.prepareStatement("select  place_of_crime, count(*)count from crime where Date_and_time Between ? and ? group by place_of_crime; ");	
			ps.setString(1, x);
			ps.setString(2, y);
		  
		  
		  ResultSet rs = ps.executeQuery();
		  
		  while(rs.next()) {
			  
			  String poc = rs.getString("place_of_crime");
			  int co = rs.getInt("count");
			  
			  Crime c1 = new Crime();
			    c1.setPlace_of_crime(poc);
			    c1.setCount(co);
			 ls.add(c1);   	   

		  }
		  
		  
	}catch(SQLException e)
	{
		throw new CrimeException(e.getMessage());
		
	}
	
	if(ls.size() == 0)
	{
		throw new CrimeException("Record not found of Crime ");
	}
	
	
	
	return ls;
}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
