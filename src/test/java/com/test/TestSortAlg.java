package com.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import com.pages.SortAlgorith;

public class TestSortAlg {

SortAlgorith sort; 
	

	@Test
	public void testSumArray() {
		
		sort= new SortAlgorith();
		int[] a ={5,9,2,0,6};
		int result = sort.addArrayVal(a);
	    assertEquals(22, result);
	    
	}

	@Test
	public void testIsSorted() {
		sort= new SortAlgorith();
	     
		int[] a ={5,9,2,0,6};
		int[] result = sort.sortArray(a);
		int[] expexctedResult ={0,2,5,6,9};
		assertThat(result, is(expexctedResult));
	}

	@Test
	public void testIndex() {
		sort= new SortAlgorith();
		assertEquals(4, sort.getIndex());
	}
}
