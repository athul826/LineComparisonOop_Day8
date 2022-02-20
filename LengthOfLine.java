package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LengthOfLine {
	private static Scanner obj;
	private double length;
	public void lineLength(int x1, int x2,int y1,int y2) {
		this.length = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
		return;
	}

	public static void main(String[] args) {
		obj = new Scanner(System.in);
		LengthOfLine object = new LengthOfLine();
		System.out.println("Enter the numbers x1, x2, y1, y2.");
		int x1, x2, y1, y2;
		x1 = obj.nextInt();
		x2 = obj.nextInt();
		y1 = obj.nextInt();
		y2 = obj.nextInt();
		object.lineLength(x1, x2, y1, y2);
		System.out.printf("Length Of Line =  %.2f", object.length);
			

	}

}
