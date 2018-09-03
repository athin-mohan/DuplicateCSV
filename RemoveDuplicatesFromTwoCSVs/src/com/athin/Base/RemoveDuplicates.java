package com.athin.Base;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;






public class RemoveDuplicates {
	
	

	
	

	public static void main(String[] args) throws IOException {
		
		int flag=0;
		
		FileReader reader=new FileReader("C:\\Users\\Athin\\Desktop\\TestCsv\\old.csv");
		BufferedReader breader=new BufferedReader(reader);
		System.out.println("1");
		
	String line1=breader.readLine();
	FileWriter writer=new FileWriter("C:\\Users\\Athin\\Desktop\\TestCsv\\now.csv",true);
	BufferedWriter bwriter=new BufferedWriter(writer);
	while(line1!=null)
	{
		int noOfMatches=0;
		FileReader reader2=new FileReader("C:\\Users\\Athin\\Desktop\\TestCsv\\new.csv");
		BufferedReader breader2=new BufferedReader(reader2);
		String line2=breader2.readLine();
		while(line2!=null)
		{
		if(line1.equalsIgnoreCase(line2))
		{
			noOfMatches++;
			
		}
		line2=breader2.readLine();
		}
		if(noOfMatches==1)
		{
			bwriter.write(line1);
			bwriter.newLine();
			
		}
		breader2.close();
		reader2.close();
		++flag;
		System.out.println("Id number checked"+flag);
	}
		breader.close();
		reader.close();
		bwriter.flush();
		bwriter.close();

	}

}
