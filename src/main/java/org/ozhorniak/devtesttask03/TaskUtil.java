package org.ozhorniak.devtesttask03;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class TaskUtil {
	
	public static void printArray(final int[] arr) {

		StringBuffer stringBuffer = new StringBuffer();

		stringBuffer.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				stringBuffer.append(", ");
			}
			stringBuffer.append(arr[i]);
		}
		stringBuffer.append("]");
		System.out.print(stringBuffer.toString());
	}

	public static void measureTime(Runnable task, String notice) {
		long startTime = System.currentTimeMillis();
		task.run();
		long resultTime = System.currentTimeMillis() - startTime;
		System.out.println(notice + resultTime + " ms.");
	}
	
	public static void getenerateRandomIntSet(int size, int scope) throws FileNotFoundException {
		System.out.println("Generate large set pair of itegers ...");
		PrintWriter printWriter = new PrintWriter("input_large.txt");
			int[] a = new int[size];
			Random random = new Random();
			printWriter.print(scope + "\n");

			for (int i = 0; i < size; i++) {
				a[i] = random.nextInt(scope);
			}
			for (int i = 0; i < a.length; i++) {
				
			
				printWriter.print(a[i] +" "+ a[i] + "\n");
				
			}
		
	}
}
