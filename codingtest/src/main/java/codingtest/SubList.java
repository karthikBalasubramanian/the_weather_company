package codingtest;
import java.util.HashMap;

public class SubList {
	
	public HashMap<Integer, Integer> getCountMap(int[] array) {
		if (array!=null && array.length > 0) {
			HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
			for (int value : array) {
				if (countMap.containsKey(value)) {
					countMap.put(value, countMap.get(value) + 1);
				} else {
					countMap.put(value, 1);
				}
			}
			return countMap;
		} else {
			return null;
		}

	}

	public String isSubList(int[] arrayToCheck, int[] array) {
		
		if((array!=null && array.length>0) && (arrayToCheck!=null && arrayToCheck.length>0)){
		
		
			if (arrayToCheck.length > array.length)
				return "Sorry, original array is smaller than the sublist array. So the array cannot be a sublist";
			HashMap<Integer, Integer> countMap = getCountMap(array);
			
			for (int value : arrayToCheck) {
				if (countMap.containsKey(value) && countMap.get(value) > 0) {
					countMap.put(value, countMap.get(value) - 1);
				} else {
					return "element "+value+" is either not present or has less number of occurences in original array";
				}
			}
			return "The given array is indeed a subset of the existing array";
		}
		
		else{
			return "Sorry either of the list is empty";
		}

		
	}

}
