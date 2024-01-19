package com.example.japps.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.example.japps.Model.Students;

	public class StudentsDao {
		List<Students> students = new ArrayList<>();
		int sequence=100;
		
		
		
		public void createStudents() {
			Students SDao= new Students();
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter FirstName");
			SDao.setFirstName(sc.nextLine());
			
			System.out.println("Enter LasttName");
			SDao.setLasttName(sc.nextLine());
			
			System.out.println("Enter Age");
			SDao.setAge(sc.nextInt());
//			
//			System.out.println("Enter ID");
//			SDao.setId(sc.nextInt());
			
			students.add(SDao);
//			sequence++;
			
		}
		public void showStudents() {
			Students SDao= new Students();
			System.out.println("Enter FirstName " +SDao.getFirstName());
			System.out.println("Enter LastName " +SDao.getLasttName());
			System.out.println("Enter age " +SDao.getAge());
			System.out.println("Enter ID " +SDao.getId());
		}
		
		
		public void updateStudents() {
			Students SDao= new Students();
			int choice;
			do {
			System.out.println("***********");
			System.out.println("Enter firstname");
			System.out.println("Enter LastName");
			System.out.println("Enter Age");
			System.out.println("Back");
			System.out.println("***********");
			
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			
			switch(choice) {
				case 1: {
					System.out.println("Enter FirstName");
					SDao.setFirstName(sc.nextLine());
					break;
				}
				case 2: {
					System.out.println("Enter LastName");
					SDao.setLasttName(sc.nextLine());
					break;
				}
				case 3: {
					System.out.println("Enter AGE ");
					SDao.setAge(sc.nextInt());
					break;
				}
				default: 
					System.out.println("Wrong Choice");
	
						
					}
				}
				while(choice!=4);
				}
		
		   public void Exit() {
						System.out.println("Successfully Exited");
			}
}
		
			
		
		
	
   

