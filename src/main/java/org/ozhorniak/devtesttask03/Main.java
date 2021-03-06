package org.ozhorniak.devtesttask03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.ozhorniak.devtesttask03.UnionFind;

/**
 * 
 * @author Oleksandr Zhorniak
 *
 */
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(">> Dev test. Task 2");
		long startTime = System.currentTimeMillis();
		new Main().run();
		long allTimes = System.currentTimeMillis() - startTime;
		System.out.println("\n>> " + allTimes + " ms.");
		
	}

	private void run() throws FileNotFoundException {
				//TaskUtil.getenerateRandomIntSet(100000, 1000);
				taskTest();
	}

	private void taskTest() throws FileNotFoundException {
		//Scanner in = new Scanner(new File("input_large.txt"));

		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			// System.out.println("n = " + n);
			UnionFind un = new UnionFind(n);

			int p;
			int q;

			while (in.hasNext()) {

				p = in.nextInt();
				q = in.nextInt();

				if (un.find(p) == un.find(q))
					continue;
				un.union(p, q);
				System.out.println(p + " " + q);
			
			}

			System.out.println("Count of separated graphs is : " + un.getCounder());
		}
	}
}