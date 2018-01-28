package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		
		boolean hungry = false;
		
		if(!hungry) {
			
			System.out.println("I'm starving");
			
		} else {
			
			System.out.println("I'm not hungry");
			
		}
		
		int hungerRating =5;
		if(hungerRating<6) {
			System.out.println("Not Hungry");
		} else {
			System.out.println("I'm Starving!");
		}
		
		int favoriteTemp = 75;
		int currentTemp = 30;
		String opinion = null;
		
		if(currentTemp < favoriteTemp -30) {
			opinion = "It's pretty darn cold";
		} else if(currentTemp < favoriteTemp - 20) {
			opinion = "it's kinda cold";
		} else if(currentTemp > favoriteTemp +10) {
			opinion = "It's hot!";
		} else {
			opinion = "it's a beautiful day!";
		}

		System.out.println(opinion);
		
		int month = 6;
		String monthString;
		
		switch(month) {
		
		case 1: monthString = "January";
			break;
		case 2: monthString = "February";
			break;
		case 3: monthString = "March";
			break;
		case 4: monthString = "April";
			break;
		default: monthString = "Unknown Month";
			break;
		}
		System.out.println(monthString);
	}

}
