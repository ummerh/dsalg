package com.kloudiva.dsalg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class DNASequenceMatcher {

	public static void main(String[] args) {
		String[] samples = new String[] { "gtcactcggtaggcctctcggtgagtatctcgataggtaactcggcgtc",
				"atctctcggtaggcctctcggtgagtatctcgataggtctatcggtatg" };

		HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();

		for (int i = 0; i < samples.length; i++) {
			for (int j = 0; j < samples[i].length() - 20; j++) {
				String seq = new String(samples[i].substring(j, j + 20));
				System.out.println(seq);
				ArrayList<Integer> matches = null;
				if ((matches = map.get(seq)) == null) {
					matches = new ArrayList<Integer>();
					map.put(seq, matches);
				}
				matches.add(j);
			}
		}
		Collection<ArrayList<Integer>> vals = map.values();
		for (Iterator iterator = vals.iterator(); iterator.hasNext();) {
			ArrayList<Integer> arrayList = (ArrayList<Integer>) iterator.next();
			if (arrayList.size() > 1) {
				System.out.println(arrayList);
			}
		}
	}

}