package zhenqi.chen.com;

import java.util.Arrays;

public class Quick {
	public static int quick(int[] a, int lo, int hi){
		int i = lo;
		int j = hi+1;
		while(true){
			while(Util.less(a[++i], a[lo])){
				if(i >= hi){
					break;
				}
			}
			while(!Util.less(a[--j], a[lo])){
				if(j <= lo){
					break;
				}
			}
			if(i >= j){
				break;
			}
			Util.exch(a, i, j);
		}
		Util.exch(a, lo, j);
		return j;
	}

	public static void sort(int[] a, int lo, int hi){
		System.out.println("lo: " + lo + "-------hi: " + hi);
		if(lo >= hi){
			return;
		}
		int j = quick(a, lo, hi);
		sort(a, lo, j);
		sort(a, j+1, hi);
	}
	public static void sort(int[] a){
		System.out.println(Arrays.toString(a));
		sort(a, 0, a.length - 1);
	}
	public static void main(String[] args){
		int[] a = {3,1,2,3,5,6,2,8,5,1,0,9,3};
//		int j = quick(a, 0, a.length - 1);
		sort(a);
		System.out.println(Arrays.toString(a));
	}
}
