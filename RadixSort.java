import java.util.Arrays;
import java.lang.*;

public class RadixSort {
	public RadixSort() {
	}
	public int getMax(int arr[], int n) 
    { 
        int mx = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
        return mx; 
    } 
    public void countSort(int arr[], int n, int exp) 
    { 
        int output[] = new int[n]; // output array 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count, 0); 
        // Guardar ocurrencias 
        for (i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++; 
        }
        // Intercambio 
        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1]; 
        }
        // Build the output array 
        for (i = n - 1; i >= 0; i--) { 
            output[count[(arr[i] / exp) % 10] - 1] = arr[i]; 
            count[(arr[i] / exp) % 10]--; 
        } 
        // Output 
        for (i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    } 
    // Funcion principal 
    public void radixSort(int arr[], int n) { 
        // Find the maximum number to know number of digits 
        int m = getMax(arr, n); 
  
        // Do counting sort for every digit. Note that 
        // instead of passing digit number, exp is passed. 
        // exp is 10^i where i is current digit number 
        for (int exp = 1; m / exp > 0; exp *= 10) 
            countSort(arr, n, exp); 
    } 
  
    // A utility function to print an array 
    public void print(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
}
