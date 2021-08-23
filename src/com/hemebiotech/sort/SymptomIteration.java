package com.hemebiotech.sort;

import java.util.List;
import java.util.TreeMap;

public class SymptomIteration implements ISymptomIteration {
	
	/**
	 * Create a map and read the list
	 *
	 * Test if symptoms(key) exist in map
	 * 
	 * If exist : get the value for the occurrence of symptoms, increment and put the value in map
	 * 
	 * If do not exist : add symptoms and a occurrence(value) of 1 in the map
	 *
	 */
	
	@Override
	public TreeMap<String, Integer> sortSymptoms(List<String> result) {

		TreeMap<String, Integer> symptomsMap = new TreeMap<>();

		for (String symptoms : result) {
			if (symptomsMap.containsKey(symptoms)) {
				int occurence = 0;
				occurence = symptomsMap.get(symptoms).intValue();
				occurence = occurence + 1;
				symptomsMap.put(symptoms, occurence);

			} else {
				symptomsMap.put(symptoms, 1);
			}

		}
		return symptomsMap;
	}

}
