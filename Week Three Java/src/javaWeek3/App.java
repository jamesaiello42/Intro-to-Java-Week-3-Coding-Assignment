package javaWeek3;

public class App {
	public static void main(String[] args) {
		// Ask about adding value to 
		int ages[] = {3, 9, 23, 64, 2, 8, 21, 28, 93};
		String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int nameLengths[] = new int[names.length];
		
		double avgAge = 0;
		double letterNumAvg = 0;
		int nameLengthSum = 0;
		
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
		
		for (int i = 0; i < names.length; i++)
			System.out.print(names[i] + " ");
		
		for (int i = 0; i < names.length; i++)
			nameLengths[i] = names[i].length();
		
		// Calculate the average of nameLengths
		for (int i = 0; i < nameLengths.length; i++)
			nameLengthSum += nameLengths[i]; 

		System.out.println("\n" + nameLengthSum);
	}
	
	public String printNTimes(String word, int n) {
		String concatWord = null;
		
		for (int i = 0; i < n; i++)
			concatWord += word;
		return concatWord;
	}
	
}
