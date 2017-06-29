package zhenqi.chen.com;

public class Util {
	public static boolean less(int v1, int v2){
		return v1 < v2;
	}
	public static void exch(int[] a, int i, int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
