package com.example.japps.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.example.japps.Model.Students;

import uitl.DbConnectionUtil;


public class StudentDbDao {
DbConnectionUtil dbConnectionUtil=new DbConnectionUtil();
	
	public void addStudents() {
		Students emp =new Students();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter FirstName");
		emp.setFirstName(sc.nextLine());
	  
		System.out.println("Enter LasttName");
		emp.setLasttName(sc.nextLine());
	   	   
		System.out.println("Enter age");
		emp.setAge(sc.nextInt());
		
		Connection con = dbConnectionUtil.getDbConnection();
		 if(con!=null) {
			 String query = "INSERT INTO student_db.students (first_name,last_name,age) VALUES(?,?,?)";
			 try {
				 PreparedStatement ps = con.prepareStatement(query);
				 ps.setString(1, emp.getFirstName());
				 ps.setString(2, emp.getLasttName());
				 ps.setInt(3, emp.getAge());
				 
				 Boolean temp=ps.execute();
				 if(temp) {
					 System.out.println("Data inserted");
				 }
			
				 
			 }catch (Exception e) {
				// TODO: handle exception
				 e.printStackTrace();
			}
		 }
		
	} 
}







	
	