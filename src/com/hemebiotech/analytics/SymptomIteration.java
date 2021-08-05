package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class SymptomIteration implements ISymptomIteration {

	@Override
	public TreeMap<String, Integer> sortSymptoms(List<String> result) {

		TreeMap<String, Integer> symptomsMap = new TreeMap<>();

		for (String symptoms : result) {
			// Test if symptoms exist in map
			if (symptomsMap.containsKey(symptoms)) {
				int occurence = 0;
				// get the value for the occurrence of symptoms
				occurence = symptomsMap.get(symptoms).intValue();
				// increment
				occurence = occurence + 1;
				// put the value in the map
				symptomsMap.put(symptoms, occurence);

			} else {
				symptomsMap.put(symptoms, 1);
			}

		}
		return symptomsMap;
	}

}
