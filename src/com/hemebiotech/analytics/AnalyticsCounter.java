package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

import com.hemebiotech.read.ISymptomReader;
import com.hemebiotech.read.ReadSymptomDataFromFile;
import com.hemebiotech.sort.ISymptomIteration;
import com.hemebiotech.sort.SymptomIteration;
import com.hemebiotech.write.ISymptomWrite;
import com.hemebiotech.write.SymptomWrite;

public class AnalyticsCounter {

/**
 * 
 * Call all methods 
 * 
 * Get the list of symptoms
 * Sort the list 
 * Display the list
 * Write the list in result.out
 *
 */
	
	public static void main(String[] args) {

		List<String> symptoms;

		ISymptomReader iSymptomReader = new ReadSymptomDataFromFile("symptoms.txt");

		symptoms = iSymptomReader.getSymptoms();

		TreeMap<String, Integer> symptomsMap;

		ISymptomIteration iSymptomIteration = new SymptomIteration();

		symptomsMap = iSymptomIteration.sortSymptoms(symptoms);

		ISymptomWrite iSymptomWrite = new SymptomWrite();

		iSymptomWrite.writeSymptoms(symptomsMap);
	}
}
