package main;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);

//Finding Max Number		
		System.out.println(numbers.stream().reduce((accumulator, current) -> Math.max(accumulator, current)));

//Finding Min Number		
		System.out.println(numbers.stream().reduce((accumulator, current) -> Math.min(accumulator, current)));

//Removing Odd numbers
		numbers.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.print("" + i + ", "));
		System.out.println(" ");

//Removing the Even Numbers:
		numbers.stream().filter(i -> i % 2 != 0).forEach(i -> System.out.print("" + i + ", "));

//Sum of the list
		System.out.println(numbers.stream().reduce((accumulator, current) -> accumulator + current));
		
//Square Every number of the list
		numbers.stream().map((i -> Math.pow(i, 2))).forEach(num -> System.out.println(num));

//Square every number in list and remove even nums
		numbers.stream().filter(i -> i % 2 != 0).map((i -> Math.pow(i, 2))).forEach(num -> System.out.println(num));

//Square every number in list and remove even nums and then find the min value
		System.out.println(numbers.stream().map(i -> i = (int) Math.pow(i, 2)).filter(i -> i % 2 != 0)
				.reduce((accumulator, current) -> Math.min(accumulator, current)));

		
		
//////////////////////////////////////////For Loops/////////////////////////////////////////
		
//Finding the max value;

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
