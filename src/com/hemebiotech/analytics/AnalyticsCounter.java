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

	public static void main(String[] args) {
		// get the list of symptoms
		List<String> symptoms;

		ISymptomReader iSymptomReader = new ReadSymptomDataFromFile("symptoms.txt");

		symptoms = iSymptomReader.getSymptoms();

		// Sorting the list
		TreeMap<String, Integer> symptomsMap;

		ISymptomIteration iSymptomIteration = new SymptomIteration();

		symptomsMap = iSymptomIteration.sortSymptoms(symptoms);

		// Display the list and write the list in result.out
		ISymptomWrite iSymptomWrite = new SymptomWrite();

		iSymptomWrite.writeSymptoms(symptomsMap);
	}
}
