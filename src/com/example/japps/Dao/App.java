package com.example.japps.Dao;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
	StudentDbDao studentDbDao=new StudentDbDao();
    StudentsDao app=new StudentsDao();
    int choice;
    	do {
    	System.out.println("*********");
		System.out.println("1. Create Studentss");
		System.out.println("2. Display Students");
		System.out.println("3. Update Students");
		System.out.println("4. Exit");
		System.out.println("****************");
		System.out.print("Enter Option: ");
		
		Scanner sc = new Scanner(System.in);
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:{
			studentDbDao.addStudents();
//			System.out.println("Create Students");
//			app.createStudents();
			//studentDbDao.addStudents();
			break;
		}
		case 2:{
			System.out.println("show Students");
			app.showStudents();
			break;
		}
		case 3:{
			System.out.println("Update Students");
			app.updateStudents();
			break;
		}
		
		case 4:{
			System.exit(1);
			app.Exit();
			break;
			
		}
		default:
		System.out.println("wrong choice");
        }
		}
    while(true);
    
}
}
