package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;



public class SymptomDriver {
	
	public static void main (String[] args) {
		// get the list of symptoms
				List<String> symptoms;
				
				ISymptomReader iSymptomReader = new ReadSymptomDataFromFile("symptoms.txt");
				
				symptoms = iSymptomReader.getSymptoms();
				
				//Sorting the list
				TreeMap<String, Integer> symptomsMap;
				
				ISymptomIteration iSymptomIteration = new SymptomIteration();
				
				symptomsMap = iSymptomIteration.sortSymptoms(symptoms);
	}
}
