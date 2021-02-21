

public class MergeSort {
	public MergeSort() {
		System.out.println("Merge Sort:");
	}
	 
	
	void merge(int arr[], int l, int m, int r)
    {
        //Hallar tamanos de subarrays
        int n1 = m - l + 1;
        int n2 = r - m;
 
        // Crear arrays temporales
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        //Anadir datos a arrays temporales
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        //Se realiza el merge
        int i = 0, j = 0;
        
        //Se define el index
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        // Copiar elementoss de L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        // Copiar elementoss de R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
	
	
	// Funcion principal para sort que hace uso del metodo para juntar subarrays
    // merge()
	void mergeSort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
 
            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

}
