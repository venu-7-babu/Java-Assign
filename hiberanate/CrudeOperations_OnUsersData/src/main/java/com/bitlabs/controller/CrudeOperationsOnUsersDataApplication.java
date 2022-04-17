package com.bitlabs.controller;

import java.util.List;
import java.util.Scanner;

import com.bitlabs.dao.Dao;
import com.bitlabs.dao.DaoImp;
import com.bitlabs.entity.Users;

public class CrudeOperationsOnUsersDataApplication {
	Users usr=new Users();
    Dao dao=new DaoImp();
    Scanner s=new Scanner(System.in);
    
    public void addUser() {
		  System.out.println("enter Name");
		  usr.setUname(s.next());
	      System.out.println("enter Email id");   	   
		  usr.setEmail(s.next());
		  System.out.println("Enter mobile number"); 
		  usr.setMobile(s.nextLong());
	      boolean b=dao.addUsers(usr);
	      if(b) {
	    	  System.out.println("Inserted sucessfully");
	      }
	      else {
	    	  System.out.println("Fail");
	      }
	}
    
    public void getUserinfo() {
		 
		  System.out.println("Enter student id");
		  usr=dao.getUserbyId(s.nextInt());
		  System.out.println("Name:  "+usr.getUname());
		  System.out.println("Email:  "+usr.getEmail());
		  System.out.println("Mobile:  "+usr.getMobile());
    }
    
    public void deleteUserById() {
		System.out.println("Enter student id");
		int uid=s.nextInt();
		boolean b=dao.deleteUserById(uid);
		if(b) {
			System.out.println("Record deleted Successfully");
		}
		else {
			System.out.println("fail");
		}
	}
    
    public void viewAllUsers() {
		List<Users> list=dao.viewAllUsers();
		for(Users s:list) {
			System.out.println("Name: "+s.getUname());
			System.out.println("Email: "+s.getEmail());
			System.out.println("Name: "+s.getMobile());
			
		}
	}
    
    public void updateUserInfo() {
		System.out.println("Enter Student id");
		int uid=s.nextInt();
		System.out.println("Enter Student Name");
		String uname=s.next();
		dao.updateUserbyId(uid,uname);
	}
    
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		CrudeOperationsOnUsersDataApplication  obj=new CrudeOperationsOnUsersDataApplication();
		
		System.out.println("1. Add User");
		System.out.println("2. View User information");
		System.out.println("3. view All the Users");
		System.out.println("4. delete User ");
		System.out.println("5. Update User information");
		System.out.println("Choose your option");
		int option=s.nextInt();
		if(option==1) {
			obj.addUser();
		}
		
		else if(option ==2) {
			obj.getUserinfo();
		}
		else if(option==3) {
			obj.viewAllUsers();
		}
		else if(option==4) {
			obj.deleteUserById();
		}
		else if(option ==5) {
			obj.updateUserInfo();
		}
		
	}

}
