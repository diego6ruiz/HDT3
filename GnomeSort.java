/*
 * Diego Ruiz
 * Javier Alvarez
 * 
*/

import java.util.ArrayList;
import java.lang.*;

public class GnomeSort {
	ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	public GnomeSort() {
	}
	
	public void gnomeSort(int arr[], int n){
        int i = 0; 
  
        while (i < n) { 
            if (i == 0) 
                i++; 
            if (arr[i] >= arr[i - 1]) 
                i++; 
            else { 
                int temp = 0; 
                temp = arr[i]; 
                arr[i] = arr[i - 1]; 
                arr[i - 1] = temp; 
                i--; 
            } 
        } 
    } 

}
