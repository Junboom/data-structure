package sort;

import java.util.Vector;

public class MergeSort {

	static void merge(Vector<Integer> v, int s, int e, int m) {
		Vector<Integer> ret = new Vector<>();
		int i = s;
		int j = m + 1;

		while (i <= m || j <= e) {
			if (m < i)
				ret.add(v.get(j++));
			else if (e < j || v.get(i) < v.get(j))
				ret.add(v.get(i++));
			else
				ret.add(v.get(j++));
		}

		for (int k = s; k <= e; k++)
			v.set(k, ret.get(k - s));
	}

	static void mergeSort(Vector<Integer> v, int s, int e) {
		if (s < e) {
			int m = (s + e) / 2;

			mergeSort(v, s, m);
			mergeSort(v, m + 1, e);
			merge(v, s, e, m);
		}
	}

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();

		v.add(20);
		v.add(112);
		v.add(403);
		v.add(52);
		v.add(70);
		v.add(6);
		v.add(33);
		v.add(45);
		v.add(50);
		v.add(7);
		v.add(61);
		v.add(33);

		System.out.println(v);
		mergeSort(v, 0, v.size() - 1);
		System.out.println(v);
	}

}
