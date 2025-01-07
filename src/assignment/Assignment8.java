package assignment;

import java.util.HashMap;
import java.util.Map;

public class Assignment8 {

	public static void main(String[] args) {
		
		String [] name = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		int [] salary = {75000, 68000, 82000, 90000, 60000};
		int [] experienceYears = {5,3,7,10,2};
		double [] yearEndRating = {4.2, 3.8, 4.5, 2, 3.5};
		
		Map<String, Double> percentage = new HashMap<String, Double>();
		
		for (int i = 0; i < name.length; i++) {
            double variablePayPercentage;
            double bonus;
            double reward = (experienceYears[i] >= 5) ? 5000 : 0;

            // Determine variable pay and bonus based on rating
            if (yearEndRating[i] >= 4) {
                variablePayPercentage = 0.15;
                bonus = 1500;
            } else if (yearEndRating[i] >= 3) {
                variablePayPercentage = 0.10;
                bonus = 1200;
            } else {
                variablePayPercentage = 0.03;
                bonus = 300;
            }
            
         // Calculate hike
            double hike = (salary[i] * variablePayPercentage) + bonus + reward;

            // Calculate hike percentage
            double hikePercentage = (hike / salary[i]) * 100;

            // Store result in map
            percentage.put(name[i], hikePercentage);
        }

        // Print the results
        System.out.println("Employee Hike Percentages:");
        for (Map.Entry<String, Double> entry : percentage.entrySet()) {
            System.out.printf("%s: %.2f%%\n", entry.getKey(), entry.getValue());

        }
		
	}
}