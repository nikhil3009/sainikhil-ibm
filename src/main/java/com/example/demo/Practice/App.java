package com.example.demo.Practice;
import java.util.Scanner;
import com.example.service.DemoServiceImpl;
public class App 
{
    public static void main( String[] args )
    {
        DemoServiceImpl objservice=new DemoServiceImpl();
        Scanner sc=new Scanner(System.in);
        int choice =0;
        while(choice!=5)
        {
        	System.out.println("1.create task");
        	System.out.println("2.display");
        	System.out.println("3.delete");
        	System.out.println("4.update");
        	System.out.println("enter you choice");
        	choice=sc.nextInt();
        	switch(choice)
        	{
        	case 1:
        		{
        			System.out.println("enter todo name");
        			String name=sc.next();
        			objservice.createToDoService(name);
        			break;
        		}
        	case 2:
        		{
        			System.out.println(objservice.display());
        			break;
        		}
        	case 3:
        		{
        			System.out.println("enter the name");
        			String name=sc.next();
        			objservice.deleteService(name);
        			break;
        		}
        	case 4:
        		{
        			System.out.println("enter the old name");
        			String oldname=sc.next();
        			System.out.println("enter the new name");
        			String name=sc.next();
        			objservice.updateService(oldname, name);
        			break;
        		}
        	case 0:
        		{
        			System.out.println("bye");
        			break;
        		}
        	default:
        		System.out.println("enter the correct choice");
        	}
        }
    }
}
