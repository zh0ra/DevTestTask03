package org.ozhorniak.devtesttask03;

public class UnionFind {

	private int[] parent;
	private byte[] rank;
	private int counter;

	public UnionFind(int n) {

		if (n < 0)
			throw new IllegalArgumentException();
		this.counter = n;
		this.parent = new int[n];
		this.rank = new byte[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
			rank[i] = 0;
		}
	}

	public int find(int p) {
		if (p < 0 || p >= parent.length) {
			throw new IllegalArgumentException("index " + p + " is not between 0 and" + (parent.length - 1));
		}
		while (p != parent[p]) {
			parent[p] = parent[parent[p]];
			p = parent[p];
		}
		return p;
	}

	public void union(int p, int q) {
		int rp = find(p);
		int rq = find(q);
		if (rp == rq)
			return;

		if (rank[rp] < rank[rq])
			parent[rp] = rq;
		else if (rank[rp] > rank[rq])
			parent[rq] = rp;
		else {
			parent[rq] = rp;
			rank[rp]++;
		}
		counter--;
	}

	public int getCounder() {
		return this.counter;
	}
}
