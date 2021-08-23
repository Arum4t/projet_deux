package com.hemebiotech.sort;

import java.util.List;
import java.util.TreeMap;
/**
 * 
 * Sort a list and count occurrence
 *
 */
public interface ISymptomIteration {
	/**
	 * @param sortSymptoms sort the list getSymptoms
	 * 
	 * @return a list of symptoms with occurrence, sort alphabetically and avoiding overlap
	 */
	TreeMap<String, Integer> sortSymptoms(List<String> result);
}
