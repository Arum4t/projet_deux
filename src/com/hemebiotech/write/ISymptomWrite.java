package com.hemebiotech.write;

import java.util.TreeMap;

/**
 * 
 * Write in a file result.out
 *
 */

public interface ISymptomWrite {
/**
 * 
 * @param symptomsMap read the map, get key and value and write in a file result.out
 * 
 */
	void writeSymptoms(TreeMap<String, Integer> symptomsMap);
}
