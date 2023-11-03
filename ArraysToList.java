package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysToList {
	public static void main(String[] args) {
		//Array into List
		String[] str = {"hi ","good ","morning"};
		//System.out.println(Arrays.toString(str));
		
		List<String> ls = new ArrayList<>();
		for(String s : str) {
			ls.add(s);
		}
		System.out.println(ls);
	
	//List into Array
	List<Integer> l = new ArrayList<>();
	l.add(10);
	l.add(20);
	l.add(30);
	//System.out.println(l);
	
	int[] arr= new int[l.size()];
	
	for(int i=0; i<arr.length; i++) {
		 arr[i]=l.get(i);
	}
	//System.out.println(Arrays.toString(arr));
	for(int a:arr) {
		System.out.println(a);
	}
	}	

}
