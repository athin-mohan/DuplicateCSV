package com.athin.Base;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//public class MultiExample {


	public class MultiExample extends Thread{		
		String checkvalue;
		BufferedWriter b;
		
		public MultiExample(String line1, BufferedWriter writer) {
			checkvalue=line1;
			b=writer;
			
		}

		public void run()
		{
			System.out.println("Hi");
			while(checkvalue!=null)
			{
				int noOfMatches=0;
				FileReader reader2 = null;
				try {
					reader2 = new FileReader("C:\\Users\\Athin\\Desktop\\TestCsv\\new.csv");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				BufferedReader breader2=new BufferedReader(reader2);
				String line2 = null;
				try {
					line2 = breader2.readLine();
					System.out.println(line2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				while(line2!=null)
				{
				if(checkvalue.equalsIgnoreCase(line2))
				{
					noOfMatches++;
					
				}
				try {
					line2=breader2.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				if(noOfMatches==1)
				{
					try {
						b.write(checkvalue);
						System.out.println(checkvalue);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						b.newLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				try {
					breader2.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					reader2.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}   
			
			
		}
	}		
		

	



//}
