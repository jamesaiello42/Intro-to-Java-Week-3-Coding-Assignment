package javaWeek3;

public class App {
	public static void main(String[] args) {
		// Added 21 to the original ages array
		int ages[] = {3, 9, 23, 64, 2, 8, 21, 28, 93};
		String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int nameLengths[] = new int[names.length];
		
		// Test arrays to test all possible returns of isSumGtrThan100 function
		int testArray[] = {99, 1, -1, 0, 2};
		int testArray2[] = {99, 3, -3};
		
		// Test arrays to test all possible returns of isSumGtrThan100 function
		double arrayToBeAvg [] = {1.5, 2.43, 3.14, 4.4, 5.12, 6.78, 7.9, 8.78, 9.1, 10.2};
		double arrayToBeAvg2 [] = {2.5, 3.43, 4.14, 5.4, 6.12, 7.78, 8.9, 9.78, 10.1, 11.2, 12};
		double arrayToBeAvg3 [] = {2.5, 3.43};
		double arrayToBeAvg4 [] = {2.5, 3.43};
		
		// Variable for age average, number of letter, and total some of ages 
		double avgAge = 0;
		double letterNumAvg = 0;
		int nameLengthSum = 0;
		
		// Will show the subtraction of ages of last element and first element
		System.out.println("Printing what step 1A requested: " + (ages[ages.length - 1] - ages[0]));
		
		// Calculate the average of ages
		for (int i = 0; i < ages.length; i++)
			avgAge += ages[i]; 
		avgAge = avgAge / ages.length;
		
		// Print to screen
		System.out.println("Printing what step 1C requested: " + avgAge);
		
		// Ask if we can assume all are letters in names
		for (int i = 0; i < names.length; i++) {
			letterNumAvg += names[i].length();
		}
		letterNumAvg = letterNumAvg / names.length;
		
		System.out.println("Printing what step 2A requested: " + letterNumAvg);
		
		// Print all names in the names array
		System.out.print("Printing what step 2B requested: ");
		for (int i = 0; i < names.length; i++)
			System.out.print(names[i] + " ");
		
		// Loop number of characters for each name and put int array
		for (int i = 0; i < names.length; i++)
			nameLengths[i] = names[i].length();
		
		// Calculate the average of nameLengths
		for (int i = 0; i < nameLengths.length; i++)
			nameLengthSum += nameLengths[i]; 

		System.out.println("\nPrinting what step 6 requested: " + nameLengthSum);
		
		// Print a string n number of times
		System.out.println("Printing what step 7 requested: " + nTimes("Hello", 3));
		
		// Function to print first and last names together
		System.out.println("Printing what step 8 requested: " + fullName("James", "Aiello"));
		
		// Testing two arrays on the function that show true if array sum is greater or equal to 100
		System.out.println("\nPrinting all results of testing step 9's function: ");
		System.out.println(isSumGtrThan100(testArray));
		System.out.println(isSumGtrThan100(testArray2));
		
		// Will show average of array
		System.out.println("\nPrinting all results of testing step 10's function: ");
		System.out.println(avgDoublesArray(arrayToBeAvg));
		
		// Will show true / false if average of first array is greater than the second array 
		System.out.println("\nPrinting all results of testing step 11's function: ");
		System.out.println(avgDoublesArraysComparison(arrayToBeAvg, arrayToBeAvg2));
		System.out.println(avgDoublesArraysComparison(arrayToBeAvg3, arrayToBeAvg4));
		System.out.println(avgDoublesArraysComparison(arrayToBeAvg, arrayToBeAvg3));
		
		// Prints true if it is Hot Outside and I have $10.50 dollars in my pocket
		System.out.println("\nPrinting all results of testing step 12's function: ");
		System.out.println(willBuyDrink(true, 10.5));
		System.out.println(willBuyDrink(false, 10.51));
		System.out.println(willBuyDrink(true, 10.51));
		
		// My own function to show the surface area of a box
		System.out.println("\nPrinting an output of step 13's function: ");
		System.out.println(boxSurfaceArea(2.5, 3.5, 100.5));
		
	}
	
	// Returns a string concatenated to itself n times
	public static String nTimes(String word, int n) {
		String concatWord = "";
		
		for (int i = 0; i < n; i++)
			concatWord += word;
		return concatWord;
	}
	
	// Function returns First and Last concatenated together, seperated by a space
	public static String fullName(String firstName, String lastName)
	{
		return firstName + " " + lastName;	
	}
	
	// Returns true or false if array sums to 100 or more
	public static Boolean isSumGtrThan100(int array[])
	{
		int sum = 0;
		
		// Sum array
		for (int i = 0; i < array.length; i++)
			sum += array[i];
		
		// Check if 100 or more;
		return sum >= 100;
	}
	
	// Function calculates array of doubles average
	public static double avgDoublesArray(double array[])
	{
		double avg = 0;
		for (int i = 0; i < array.length; i++)
			avg += array[i];
		
		avg = avg / array.length;
		return avg;
	}
	
	// Compares two arrays to if the average array one is greater than array 2 average
	public static Boolean avgDoublesArraysComparison(double array[], double array2 [])
	{
		double avg = 0, avg2 = 0;
		
		// Sum array one elements
		for (int i = 0; i < array.length; i++)
			avg += array[i];
		
		// Sum array two elements
		for (int i = 0; i < array2.length; i++)
			avg2 += array2[i];
		
		// Calculate both averages
		avg = avg / array.length;
		avg2 = avg2 / array2.length;

		return avg > avg2;
	}
	
	// Function will return true it is Hot Outside and I have $10.5o dollars in my pocket
	public static Boolean willBuyDrink(Boolean isHotOutside, double moneyInPocket) {	
		return isHotOutside && moneyInPocket > 10.50;	
	}
	
	/* This function calculates the surface area of a box. SA = 2(height * width) + 2(height * length) + 2(width * length). 
		The function takes in length, width, and height, calculates, and returns the result.
		I did this function because I find math very fun.
	*/
	public static Double boxSurfaceArea (double l, double w, double h) {
		return 2 * (h * w) + 2 * (h * l) + 2 * (w * l);
	}
	
}
