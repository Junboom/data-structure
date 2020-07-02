package sort;

import java.util.Vector;

public class QuickSort {
	
	static void quickSort(Vector<Integer> v, int s, int e) {
		int i = s;
		int j = e;
		int pivot = v.get((s+e)/2);
		
		while (i <= j) {
			while (v.get(i) < pivot)	++i;
			while (pivot < v.get(j))	--j;
			
			if (i <= j) {
				int temp = v.get(i);
				v.set(i, v.get(j));
				v.set(j, temp);
				
				++i; --j;
			}
		}
		
		if (s < e) {
			quickSort(v, s, i - 1);
			quickSort(v, i, e);
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
		quickSort(v, 0, v.size() - 1);
		System.out.println(v);
	}
	
}
