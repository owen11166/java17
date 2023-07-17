package autoboxing;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Integer autoBoxed = 15;
		int autoUnboxed = autoBoxed;
		System.out.println(autoBoxed.getClass().getName());
		Double resultBoxed = getLiteral();
		double resultUnboxed = getDouble();
		Integer[] wrapperArray = new Integer[5];
		wrapperArray[0] = 50;
		System.out.println(Arrays.toString(wrapperArray));
		Character[] characterArray = { 'a', 'b', 'c', 'd' };
		System.out.println(Arrays.toString(characterArray));
		var ourList=getList(1,2,3,4,5);
		System.out.println(ourList);
	}
	private static ArrayList<Integer> getList(int...varargs){
		ArrayList<Integer> aList=new ArrayList<>();
		for(int i:varargs) {
			aList.add(i);
		}
		return aList;
	}

	private static int returnInt(Integer i) {
		return i;
	}

	private static Integer returnAnInteger(int i) {
		return i;
	}

	private static Double getDouble() {
		return Double.valueOf(100.00);
	}

	private static double getLiteral() {
		return 100.00;
	}
}
