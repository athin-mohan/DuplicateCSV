package com.athin.Base;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MakeCsvs {

	public static void main(String[] args) throws IOException {
		FileWriter writer=new FileWriter("C:\\Users\\Athin\\Desktop\\TestCsv\\old.csv",true);
		BufferedWriter bwriter=new BufferedWriter(writer);
		System.out.println("Hi");
		for(int i=200000;i<=500000;i++)
		{
		    
			bwriter.write(Integer.toString(i));
			bwriter.newLine();
		}
      bwriter.flush();
      bwriter.close();
	

	
	FileWriter writer1=new FileWriter("C:\\Users\\Athin\\Desktop\\TestCsv\\new.csv",true);
	BufferedWriter bwriter1=new BufferedWriter(writer1);
	for(int i=400000;i<=500000;i++)
	{
	    
		bwriter1.write(Integer.toString(i));
		bwriter1.newLine();
	}
  bwriter1.flush();
  bwriter1.close();
}
}
