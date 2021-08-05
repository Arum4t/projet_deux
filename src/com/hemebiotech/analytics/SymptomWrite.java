package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SymptomWrite implements ISymptomWrite {

	@Override
	public void writeSymptoms(TreeMap<String, Integer> symptomsMap) {

		try {
			FileWriter writer = new FileWriter("result.out");
			for (Map.Entry<String, Integer> entry : symptomsMap.entrySet()) {
				String key = entry.getKey();
				Integer element = entry.getValue();
				System.out.println(key + " : " + element.intValue());
				writer.write(key + " : " + element.intValue() + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
