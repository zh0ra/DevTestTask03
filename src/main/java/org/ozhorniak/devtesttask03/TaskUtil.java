package org.ozhorniak.devtesttask03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskUtil {
	private static void printArray(final int[] arr) {

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

	public static int[] readInput() throws FileNotFoundException {

		List<Integer> inputList = new ArrayList<Integer>();

		Scanner in = new Scanner(new File("input_int.txt"));

		// Scanner in = new Scanner(System.in);
		
		 // Amount of vectors in the file with data 
		int vectorCount = in.nextInt();
		
		while (in.hasNext()) {
			inputList.add(in.nextInt());
		}

		in.close();
		int[] arr = new int[inputList.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) inputList.get(i);
		}

		return arr;
	}

	private static void measureTime(Runnable task, String notice) {
		long startTime = System.currentTimeMillis();
		task.run();
		long resultTime = System.currentTimeMillis() - startTime;
		System.out.println(notice + resultTime + " ms.");
	}
}
