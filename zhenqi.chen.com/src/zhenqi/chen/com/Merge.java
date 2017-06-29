package zhenqi.chen.com;

import java.util.Arrays;

public class Merge {
	public static void main(String[] args){
		int[] a = {0, 5,9,8,200,0,34,55,66,52,64,65};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[] a){
		sort(a, 0, a.length-1);
	}
	public static void sort(int[] a, int lo, int hi){
		if(hi <= lo){
			return;
		}
		int mid = (hi + lo)/2;
		sort(a, lo, mid);
		sort(a, mid+1, hi);
		merge(a, lo, mid, hi);
	}
	public static void merge(int[] a, int lo, int mid , int hi){
		System.out.println("lo mid and hi:¡¡"+lo + " " + mid + " and"+ hi);
		int i = lo, j = hi;
		int length = j - i + 1;
		int tmpMid = mid - lo;
		int x = tmpMid + 1;
		int[] tmp = new int[length];
		for(int k = 0; k < tmp.length; k++){
			tmp[k] = a[i++];
		}
		System.out.println(Arrays.toString(tmp));
		for(int k = 0; lo <= hi; lo++){
			if(k > tmpMid){
				a[lo] = tmp[x++];
			}else if(x > length-1){
				a[lo] = tmp[k++];
			}else if(Util.less(tmp[k], tmp[x])){
				a[lo] = tmp[k++];
			}else{
				a[lo] = tmp[x++];
			}
		}
		

	}
}
