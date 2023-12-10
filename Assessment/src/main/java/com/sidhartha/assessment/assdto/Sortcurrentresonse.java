package com.sidhartha.assessment.assdto;

import java.util.*;


public class Sortcurrentresonse 
{
      private List<int[]> sorted_arrays;
	  private long time_ns;
	public Sortcurrentresonse(List<int[]> sorted_arrays, long time_ns) {
		super();
		this.sorted_arrays = sorted_arrays;
		this.time_ns = time_ns;
	}
	public List<int[]> getSorted_arrays() {
		return sorted_arrays;
	}
	public long getTime_ns() {
		return time_ns;
	}		
}