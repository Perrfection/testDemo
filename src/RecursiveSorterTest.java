
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Bare bones junit test suite for RecursiveSorter
 * To run, right click the class and select "Run As > Junit Test"
 * 
 * For more information about how to verify output is correct, see
 * http://www.junit.org/apidocs/org/junit/Assert.html
 * 
 * Complete for Debugging HW
 * 
 * @author EmilyHill
 *
 */

public class RecursiveSorterTest {

	@Test
	public void testSortDefault() {
		int[] unsorted = {0};
		int[] sorted   = {0};
		RecursiveSorter rs = new RecursiveSorter(unsorted);
		assertArrayEquals(sorted, rs.sort());
	}
	@Test
	public void testSortChange() {
		int[] unsorted = {5, 67, 12, 20};
		int[] sorted   = {5, 12, 20, 67};
		RecursiveSorter rs = new RecursiveSorter(unsorted);
		assertNotEquals(unsorted, rs.sort());
	}
	@Test
	public void testSortBasic() {
		int[] unsorted = {5, 67, 12, 20};
		int[] sorted   = {5, 12, 20, 67};
		RecursiveSorter rs = new RecursiveSorter(unsorted);
		int[] a = rs.sort();
		assertArrayEquals(rs.toString(), sorted, a);
	}
	@Test
	public void testSortBasicWithNeg() {
		int[] unsorted = {5, 67, 12, -20};
		int[] sorted   = {-20, 5, 12, 67};
		RecursiveSorter rs = new RecursiveSorter(unsorted);
		int[] a = rs.sort();
		assertArrayEquals(rs.toString(), sorted, a);
	}
	@Test
	public void testSortBasicWithDup() {
		int[] unsorted = {67, 5, 67, 12, -20};
		int[] sorted   = {-20, 5, 12, 67, 67};
		RecursiveSorter rs = new RecursiveSorter(unsorted);
		int[] a = rs.sort();
		assertArrayEquals(rs.toString(), sorted, a);
	}
	@Test
	public void testGetMaxIndexDefault() {
		int[] a = {0};
		RecursiveSorter rs = new RecursiveSorter();
		assertEquals(0, rs.getMaxIndex(a.length-1, a));
	} 
	@Test
	public void testGetMaxIndex2() {
		int[] a = {2,4,-1};
		int maxIn = 1;
		RecursiveSorter rs = new RecursiveSorter();
		assertEquals(maxIn, rs.getMaxIndex(a.length-1, a));
	} 
	@Test
	public void testGetMaxIndex3() {
		int[] a = {2,4,4};
		int maxIn = 1;
		RecursiveSorter rs = new RecursiveSorter();
		assertEquals(maxIn, rs.getMaxIndex(a.length-1, a));
	}

	@Test
	public void testSwapDefault() {
		int[] a = {0,1};
		int[] swapped = {1,0};
		RecursiveSorter rs = new RecursiveSorter();
		rs.swap(0, 1, a);
		assertArrayEquals(swapped, a);
	}
	@Test
	public void testSwap2() {
		int[] a = {8,9};
		int[] swapped = {9,8};
		RecursiveSorter rs = new RecursiveSorter();
		rs.swap(0, 1, a);
		assertArrayEquals(swapped, a);
	}
}
