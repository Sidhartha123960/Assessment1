package com.sidhartha.assessment.assdto;

import java.util.List;

public class SortResponse {

	    private List<int[]> sorted_arrays;
		
	    public SortResponse(List<int[]> sorted_arrays) 
		{
			this.sorted_arrays = sorted_arrays;
		}
		public List<int[]> getSorted_arrays() {
			return sorted_arrays;
		}
}