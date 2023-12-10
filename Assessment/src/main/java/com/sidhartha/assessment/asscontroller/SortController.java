package com.sidhartha.assessment.asscontroller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sidhartha.assessment.assdto.SortResponse;
import com.sidhartha.assessment.assdto.Sortcurrentresonse;



@RestController
public class SortController 
{

          
	   @GetMapping("/process-single")
	   public SortResponse sort()
	   {		   
		     int arr[] = {2, 3, 4, 1, 5, 7, 8, 6, 9};
			
			 for (int i = 0; i < arr.length; i++) {
		            for (int j = 0; j < arr.length - i - 1; j++) {
		                if (arr[j] > arr[j + 1]) {
		                    int temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                }
		            }
		        }
			
			  List<int[]> subArrays = new ArrayList<>();
			  for (int i = 0; i < arr.length; i += 3) 
		        {
		            int[] sub = Arrays.copyOfRange(arr, i, Math.min(i + 3, arr.length));
		            subArrays.add(sub);
		        }   
			  
			   SortResponse response = new SortResponse(subArrays);
			       
	 	        return response;
	   }
	   
	   
	   @GetMapping("/process-concurrent")
	   public Sortcurrentresonse sortwithtimens()
	   {
		    
		   
		   int arr[] = {2, 3, 4, 1, 5, 7, 8, 6, 9};
			
			 for (int i = 0; i < arr.length; i++) {
		            for (int j = 0; j < arr.length - i - 1; j++) {
		                if (arr[j] > arr[j + 1]) {
		                    int temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                }
		            }
		        }
			
			  List<int[]> subArrays = new ArrayList<>();
			  for (int i = 0; i < arr.length; i += 3) 
		        {
		            int[] sub = Arrays.copyOfRange(arr, i, Math.min(i + 3, arr.length));
		            subArrays.add(sub);
		        }   
			  
			     long time = System.nanoTime();
			  
			  
			    Sortcurrentresonse response = new Sortcurrentresonse(subArrays,time);
			       
                return response;		   	   
	   }
	      
}