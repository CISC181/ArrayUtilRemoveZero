package pkgTest;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;
import org.junit.Test;

public class ArrayUtilTest {

	@Test
	public void ArrayUtilTest() {

		int[] arrayBefore = { 0, 5, 6, 0, 0, 2, 5 };
		int[] arrayAfter = { 5, 6, 2, 5 };
		
		// this loop is to remove all zeros
		while (ArrayUtils.contains(arrayBefore, 0))
			arrayBefore = ArrayUtils.removeElement(arrayBefore, 0);
		assertTrue(Arrays.compare(arrayBefore, arrayAfter) == 0);
		
		// this loop will print the array elemnents
		for (int i : arrayBefore)
			System.out.println(i);
	}

}
