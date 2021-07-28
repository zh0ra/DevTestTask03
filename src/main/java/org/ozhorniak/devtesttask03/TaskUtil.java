package org.ozhorniak.devtesttask03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
}
