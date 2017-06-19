package codingtest;

/**
 * SubList.java
 * Purpose: Check if either of the passed list is sublist of the other. 
 *
 * @author Karthik Balasubramanian
 * @version 1.0 06/18/17
 */

import java.util.ArrayList;
import java.util.HashMap;

public class SubList {

	/**
	 * This is a helper method for isSubList()
	 *
	 * @param arrayList
	 *            is an ArrayList<?> whose occurrence count-map is
	 *            created.
	 * @return countMap, a HashMap<Object,Integer> with array elements as key
	 *         and their # of occurrences as value.
	 */

	private HashMap<Object, Integer> getCountMap(ArrayList<?> arrayList) {

		HashMap<Object, Integer> countMap = new HashMap<Object, Integer>();
		for (Object value : arrayList) {
			if (countMap.containsKey(value)) {
				countMap.put(value, countMap.get(value) + 1);
			} else {
				countMap.put(value, 1);
			}
		}
		return countMap;
	}

	/**
	 * This is a helper method for isSubList()
	 *
	 * @param countMap,
	 *            HashMap<Object,Integer> occurrence counter map of the
	 *            large-list.
	 * @param smallList,
	 *            ArrayList<?> looped through to check if all the elements
	 *            of the list is present in the HashMap.
	 * @param sListName,
	 *            String - Name of the small list
	 * @param lListName,
	 *            String - Name of the large list
	 * @return String, result that conveys whether the smallList is a subList or
	 *         not.
	 */

	private String checkSubList(HashMap<Object, Integer> countMap, ArrayList<?> smallList, String sListName,
			String lListName) {

		for (Object value : smallList) {

			if (countMap.containsKey(value) && countMap.get(value) > 0) {
				countMap.put(value, countMap.get(value) - 1);
			} else {
				return sListName + " element " + value + " not present in " + lListName + " whose size is >= "
						+ sListName + ". Therefore " + sListName + " is not a sublist of " + lListName;
			}
		}

		return sListName + " is a sublist of " + lListName;

	}

	/**
	 * This Method compares two lists and returns if either of the list is a
	 * sublist of the other.
	 *
	 * @param listOne,
	 *            ArrayList of any type, is the first list
	 *            passed.
	 * @param listTwo,
	 *            ArrayList of any type, is the second list
	 *            passed.
	 * @return String, result that conveys whether either of the list can be a
	 *         sublist of another.
	 */

	public String isSubList(ArrayList<?> listOne, ArrayList<?> listTwo) {

		HashMap<Object, Integer> countMap = null;
		String smallList = null;
		String largeList = null;

		if ((listOne != null && !listOne.isEmpty()) && (listTwo != null && !listTwo.isEmpty())) {

			if (listOne.get(0).getClass().isInstance(listTwo.get(0))) {
				if (listOne.size() >= listTwo.size()) {

					smallList = "listTwo";
					largeList = "listOne";
					countMap = getCountMap(listOne);
					return checkSubList(countMap, listTwo, smallList, largeList);

				} else {

					smallList = "listOne";
					largeList = "listTwo";
					countMap = getCountMap(listTwo);
					return checkSubList(countMap, listOne, smallList, largeList);

				}
			} else {
				return "Cannot compare two lists of different types.";
			}

		} else if (listOne != null && !listOne.isEmpty()) {
			return "listTwo is a sublist of listOne";
		} else if (listTwo != null && !listTwo.isEmpty()) {
			return "listOne is a sublist of listTwo";
		} else {
			return "Both lists are empty";
		}

	}

}
