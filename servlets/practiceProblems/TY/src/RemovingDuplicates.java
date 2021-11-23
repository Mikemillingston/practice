import java.util.*;

/**
 * @author 
 *
 */
public class RemovingDuplicates {
	public static void removingDuplicateUsingSorting(int arr[]) {
		Arrays.sort(arr);
		int j = 0;
		// Traverse an array
		for (int i = 0; i < arr.length-1; i++) {
			//if value present in i and i+1 is nor equal
			if(arr[i] != arr[i+1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[arr.length-1];
		for (int k = 0; k < j; k++) {
			System.out.print(arr[k]+" ");
		}
	}
public static void removingDuplicateUsingHashing(int arr[]) {
	Map<Integer,Integer> map = new HashMap<>();
	for (int i = 0; i < arr.length; i++) {
		if(map.containsKey(arr[i])) {
			map.put(arr[i], map.get(arr[i]+1));	
		}else {
			map.put(arr[i], 1);
		}
	}
	//print Each key
	map.forEach((k, v) -> System.out.print(k+" "));
 }
public static void removingDuplicateUsingSet(int arr[]) {
	Set<Integer> st = new HashSet<Integer>();
	for (int i = 0; i < arr.length; i++) {
		st.add(arr[i]);
	}
	// print each set
	st.forEach(elements->System.out.print(elements+" "));
}
public static void main(String[] args) { 
	
	int arr[] = {25,331,5,2,6,4,4,5,6,8,8,8,8,9,9};
	//method calls
	removingDuplicateUsingHashing(arr);
	System.out.println();
	removingDuplicateUsingSet(arr);
	System.out.println();
	removingDuplicateUsingSorting(arr);
	System.out.println();
 }
}
