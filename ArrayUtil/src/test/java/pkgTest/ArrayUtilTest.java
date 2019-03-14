package pkgTest;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;
import org.junit.Test;

public class ArrayUtilTest {

	@Test
	public void ArrayUtilTest() {

		int[] arrayBefore = { 1, 2, 0, 4, 5, 6, 7, 0, 0 };
		int[] arrayAfter = { 1, 2, 4, 5, 6, 7 };
		
		
		
		
		
		
		
		
		
		// this loop is to remove all zeros
		while (ArrayUtils.contains(arrayBefore, 0))
			arrayBefore = ArrayUtils.removeElement(arrayBefore, 0);
		
		
		assertTrue(Arrays.equals(arrayBefore,  arrayAfter));

		
		// this loop will print the array elemnents
		for (int i : arrayBefore)
			System.out.println(i);
	}

}
