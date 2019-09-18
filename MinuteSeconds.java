//This program takes a total number seconds and then turns it into minutes and remainder of seconds 
public class MinuteSeconds {
//This is the class name	
	public static void main(String[] args) {
		//This is the main()method 
		
		//Here I define the variable total_seconds and give it a value
		int total_seconds = 500;
		
		//The variable for minutes is defined here 
		int minutes = total_seconds / 60;
		
		//The variable that calculates the left over minutes
		int seconds = total_seconds % 60;
		
		System.out.println("Total Seconds: " + total_seconds);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
		
	}

}
