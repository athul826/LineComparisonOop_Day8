package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class EqualityOfTwoLine {
	
	private static Scanner obj;
	private double length;
	public  void LengthOfLine(int x1,int x2, int y1, int y2) {
		
		this.length = Math.sqrt((x2-x1)^2 +(y2-y1)^2);
		return;
	}

	public static void main(String[] args) {
		double length1, length2;
		int x1, x2, y1, y2;
		obj = new Scanner(System.in);
		EqualityOfTwoLine object = new EqualityOfTwoLine();
			System.out.println("Enter the numbers x1, x2 ,y1, y2");
			x1 = obj.nextInt();
			x2 = obj.nextInt();
			y1 = obj.nextInt();
			y2 = obj.nextInt();
			object.LengthOfLine(x1, x2, y1, y2);
			length1 = object.length;
			System.out.println("Enter the Numbers x1, x2, y1, y2. ");
				x1 = obj.nextInt();
				x2 = obj.nextInt();
				y1 = obj.nextInt();
				y2 = obj.nextInt();
				object.LengthOfLine(x1, x2, y1, y2);
				length2 = object.length;
				
				if (length1 == length2) 
				{
					System.out.println("the Two lines are Equal");
					
				}else
				{
					System.out.println("Two Lines Are Not Equal");
				}
			
		
	}

}
