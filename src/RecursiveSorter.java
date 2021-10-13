
/**
 * Recursive selection sort
 * For more information on sorting algorithms, try:
 * http://www.toves.org/books/java/ch20-sort/index.html
 * @author EmilyHill
 *
 */
public class RecursiveSorter {
	
	private int[] sortedArray;
	private int[] array;
	
	public RecursiveSorter() {
		array = new int[1];
	}
	
	public RecursiveSorter(int[] a) {
		array = a;
	}
	
	public void setArray(int[] a) {
		array = a;
	}

	public int[] getSortedArray() {
		return sortedArray;
	}

	public int[] getOriginalArray() {
		return array;
	}
	
	public int[] sort() {
		sortedArray = array.clone();
		recursiveSort(sortedArray.length - 1);
	    return sortedArray;
	}
	
	public int[] recursiveSort(int endIndex) {
		if (endIndex > 0) {
			int m = getMaxIndex(endIndex, sortedArray);
			swap(m, endIndex, sortedArray);
			recursiveSort(endIndex-1);
		}
		return sortedArray;
	}
	
	public int getMaxIndex(int endIndex, int[] a) {
		int max = a[0];
		int maxIndex = 0;
		for (int i = 1; i <= endIndex; i++) {
			if (a[i] > max) {
				max = a[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	public void swap(int src, int dest, int[] a) {
		int temp = a[dest];
		a[dest] = a[src];
		a[src] = temp;
	}
	
	public String toString() {
		return "Original: " + prettyPrint(getOriginalArray()) + "\n" +
			   "Sorted:   " + prettyPrint(getSortedArray());
	}
	
	private String prettyPrint(int[] a) {
		String s = "";
		for (int i : a)
			s += i + " ";
		return s;
	}
	
	public static void main(String[] args) {
		// Automate running, but not testing
		int[] array = {5, 67, 12, 20};
		RecursiveSorter s = new RecursiveSorter(array);
		s.sort();
		System.out.println(s); // uses Sorter.toString
	}

}
