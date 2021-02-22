
public class QuickSort {
	public QuickSort() {
	}
	
	
	public void quickSort(int[] arr, int low, int high) {
        int i = low, j = high;
        int pivot = arr[low + (high-low)/2];
        //Dividir en 2
        while (i <= j) {
            // Si el valor es menor al pivote, tomar el elemento
            while (arr[i] < pivot) {
                i++;
            }
         // Si el valor es mayor al pivote, tomar el elemento
            while (arr[j] > pivot) {
                j--;
            }

            // Caso contrario, intercambiamos valores
            // De esta forma recorremos la lista
            if (i <= j) {
                exchange(arr, i, j);
                i++;
                j--;
            }
        }
        // Recursividad
        if (low < j)
            quickSort(arr, low, j);
        if (i < high)
            quickSort(arr, i, high);
        
    }
    //Metodo para intercambiar
	public void exchange(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
