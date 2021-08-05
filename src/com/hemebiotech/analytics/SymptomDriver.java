package com.hemebiotech.analytics;

import java.util.List;



public class SymptomDriver {
	
	public static void main (String[] args) {
		// get the list of symptoms
				List<String> fruits;
				
				ISymptomReader iSymptomReader = new ReadSymptomDataFromFile("symptoms.txt");
				
				fruits = iSymptomReader.getSymptoms();
	}
}
