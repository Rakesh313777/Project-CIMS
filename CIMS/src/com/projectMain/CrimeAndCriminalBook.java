package com.projectMain;

import java.util.List;
import java.util.Scanner;

import com.project.bean.Crime;
import com.project.bean.CrimeCriminalByPlace;
import com.project.bean.Criminal;
import com.project.dao.CrimeInfo;
import com.project.dao.CrimeInfoImpl;
import com.project.exceptions.CrimeCriminalException;
import com.project.exceptions.CrimeException;
import com.project.exceptions.CriminalExeption;

public class CrimeAndCriminalBook {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter options you want ");

			System.out.println("press '1' for Register Crime Details");
			System.out.println("press '2' for Register the Criminal Details ");
			System.out.println("press '3' to Get the Crime Details ");
			System.out.println("press '4' to Get the criminal Details ");
			System.out.println("Press '5' Search Crime Details By Entering Name Of Victim");
			System.out.println("press '6' to Get the crime Details by Status Entering By Solved or Not solved ");
			System.out.println("press '7' to Get the Detailed Report of Status ");
			System.out.println("press '8' to Get the Details of Crime AND Criminal By enter the Place of Crime");
			System.out.println("Press '9' Update the crime Status By Entering the name of victims ");	
			System.out.println("press '10' Search By DateAndTime NoOf Crimes Recorded in place ");
			System.out.println("press '0' to Exit ");
			System.out.println("=============================================/n");
			
			
			int x = sc.nextInt();
			
			if(x == 1) {
				
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
				 
//				 String res =  cri.registerCrime(n, dt, ar, wc, vt, des, sus,aups, st);
//				 
//				 System.out.println(res);
//				   
		
				
			}
			else if(x == 2) {
				
				Scanner ss = new Scanner(System.in);
				
				System.out.println("Enter the name_of_criminal :");
				   String cn = ss.nextLine();
				   
				   System.out.println("Enter the Age: ");
				   int ag = ss.nextInt();
				   
				   ss.nextLine();
				   
				   System.out.println("Enter the Gender :");
				   String gn = ss.nextLine();
				   
				   System.out.println("Enter the Address: ");
				   String ad = ss.nextLine();
				   
				   System.out.println("Enter the Identifying_marks_in_face : ");
				   String fm = ss.nextLine();
				   
				   System.out.println("Enter the area_of_crime_criminal_firstarrested : ");
				   String arcf = ss.nextLine();
				   
				   
				   System.out.println("Enter the attached_to_which_crime : ");
				   String awc = ss.nextLine();
				   
				   System.out.println("Enter the personId: ");
				   int id = ss.nextInt();
				   
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
				   
				   

		
			}
			else if(x == 3) {
				
				CrimeInfo cri1 = new CrimeInfoImpl();
				
			     try {
			    	 
					List<Crime> li2 =  cri1.getAllCrimeDetails();
					
					 for(Crime li:li2) {
						 
						 System.out.println("seq no: "+li.getNumber());
						 System.out.println("Date_and_time: "+li.getDate_and_time());
						 System.out.println("Area_of_crime: "+li.getPlace_of_crime());
						 System.out.println("Which_type_crime: "+li.getWhich_type_crime());
						 System.out.println("Victims: "+li.getVictims());
						 System.out.println("Detail_description_of_crime: "+li.getDetail_description_of_crime());
						 System.out.println("Names_of_main_suspected: "+li.getNames_of_main_suspected());
						 System.out.println("Under_police_station: "+li.getUnder_police_station());
						 System.out.println("Status: "+li.getStatus());
						 System.out.println("=================================\n");
						 
					 }
					
//					li2.forEach(c -> System.out.println(c));
					
				} catch (CrimeException e) {
					
					System.out.println(e.getMessage());
					
				}
				
			}else if(x == 4) {
				
				CrimeInfo cri = new CrimeInfoImpl();
				
			     try {
			    	 
					List<Criminal> li3 =  cri.getAllCriminalDetails();
					
					 for(Criminal li:li3) {
						 
						 System.out.println("name_of_criminal: "+li.getName_of_criminal());
						 System.out.println("Age: "+li.getAge());
						 System.out.println("Gender: "+li.getGender());
						 System.out.println("Address: "+li.getAddress());
						 System.out.println("Identifying_marks_in_face: "+li.getIdentifying_marks_in_face());
						 System.out.println("area_of_crime_criminal_firstarrested: "+li.getArea_of_crime_criminal_firstarrested());
						 System.out.println("attached_to_which_crime: "+li.getAttached_to_which_crime());
						 System.out.println("personId: "+li.getPersonId());
						 System.out.println("=================================\n");
						 
					 }
					
//					li2.forEach(c -> System.out.println(c));
					
				} catch (CriminalExeption e) {
					
					System.out.println(e.getMessage());
					
				}
				
			     
			     
			}else if(x == 5) {
			
				
				Scanner s5 = new Scanner(System.in);
				
				System.out.println("Enter the victims name to Search the Details Of Crime ");
				String st = s5.nextLine();
				
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
					 System.out.println("=================================\n");
					
					
				} catch (CrimeException e) {

		            System.out.println(e.getMessage()); 
					
				}
					
				
				
				
			}
			else if(x == 6) {
				
				Scanner s = new Scanner(System.in);
				
				System.out.println("Enter the status 'solved' 'not solved' ");
				String sv = s.nextLine().toLowerCase();
				
				
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
				
				

				
				
			
			}else if(x == 7) {
				
				CrimeInfo cr = new CrimeInfoImpl();
				
				   try {
					   
					List<Crime> li1 = cr.DetailedReportOfStatus();
					
					for(Crime l :li1) {
						
						System.out.println("Status: "+l.getStatus()+" == "+"count: "+ l.getCount());
						
						
					}
					
				} catch (CrimeException e) {
					System.out.println(e.getMessage());
				}
				   System.out.println("=====================================================/n");
				   
				
			}else if(x == 8) {
				Scanner s1 = new Scanner(System.in);
				
				
				System.out.println("Enter the place of crime: ");
				String poc = s1.nextLine();
				
				
				CrimeInfo ci = new CrimeInfoImpl();
				
				try {
					
					List<CrimeCriminalByPlace> li1 =  ci.getTheCrimeAndCriminalDetailsByPlace(poc);
					
//					li1.forEach(s -> System.out.println(s));
					for(CrimeCriminalByPlace li:li1) {
						
						System.out.println("personId: "+li.getPersonId());
						System.out.println("name_of_criminal: "+li.getName_of_criminal());
						System.out.println("area_of_crime_criminal_firstarrested: "+li.getArea_of_crime_criminal_firstarrested());
						System.out.println("place_of_crime: "+li.getPlace_of_crime());
						System.out.println("under_police_station: "+li.getUnder_police_station());
						System.out.println("Which_type_crime: "+li.getWhich_type_crime());
						System.out.println("victims: "+li.getVictims());
						System.out.println("Detail_description_of_crime: "+li.getDetail_description_of_crime());
						System.out.println("names_of_main_suspected: "+li.getNames_of_main_suspected());
						System.out.println("status: "+li.getStatus());
						System.out.println("===================================/n");
						
					}
					
					
				} catch (CrimeCriminalException e) {
					
					System.out.println(e.getMessage());

				}
				
			}else if(x == 9) {
				Scanner s2 = new Scanner(System.in);
				
				System.out.println("Enter the name of victims to Update the status of crime which is solved");
				String ss = s2.nextLine();
				
				CrimeInfo cr = new CrimeInfoImpl();
				
			try {
					String re = cr.updateTheStatusAfterSolvingCrimeByVictimName(ss);
					
				System.out.println(re);
			}catch(CrimeException e)
			{
				System.out.println(e.getMessage());
			}
				
				
			}else if(x ==10) {
				
				
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
					System.out.println("========================================\n");
					
					
				} catch (CrimeException e) {

		            System.out.println(e.getMessage());       
					
				}
				
				
			}
			else if( x == 0) {
				
				
				System.out.println("Thanku.....");
				break;
				
				
			}
				
			
			
			
			
		}
		
		sc.close();
		
	}

}
