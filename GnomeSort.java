
public class GnomeSort {
	public GnomeSort() {
		System.out.println("Gnome Sort:");
	}
	
	static int[] gnomeSort(int arr[], int n){ 
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
        return arr; 
    } 

}
