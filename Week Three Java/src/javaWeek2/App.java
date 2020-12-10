package javaWeek2;

public class App {
	public static void main(String[] args) {
		// Ask about adding value to 
		int ages[] = {3, 9, 23, 64, 2, 8, 21, 28, 93};
		String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		double avgAge = 0;
		double letterNumAvg = 0;
		
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		// Calculate the average of ages
		for (int i = 0; i < ages.length; i++)
			avgAge += ages[i]; 
		avgAge = avgAge / (double)ages.length;
		
		System.out.println(avgAge);
		
		// Ask if we can assume all are letters in names
		for (int i = 0; i < names.length; i++) {
			letterNumAvg += names[i].length();
		}
		letterNumAvg = letterNumAvg / (double)(names.length);
		
		System.out.println(letterNumAvg);
		
	}
}
