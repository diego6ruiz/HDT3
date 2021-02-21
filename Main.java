

public class Main {  
	public static void main(String[] args) {
		int[] array = {5, 4, 2, 9, 1, 6, 3, 8, 10, 7};
		
		GnomeSort gs = new GnomeSort();
		
		for (int i: gs.gnomeSort(array, array.length)) {
            System.out.println(i);
        }
		
		
		int[] arra = {5, 4, 2, 9, 1, 6, 3, 8, 10, 7};
		
		MergeSort ms = new MergeSort();
		ms.mergeSort(arra, 0, arra.length-1);
		
		
        for (int i: arra) {
            System.out.println(i);
        }
        
        int[] arr = {5, 4, 2, 9, 1, 6, 3, 8, 10, 7};
        
        QuickSort qs = new QuickSort();
		qs.quickSort(arr, 0, array.length-1);
		
		
        for (int i: arr) {
            System.out.println(i);
        }
        
        int[] ar = {5, 4, 2, 9, 1, 6, 3, 8, 10, 7};
        
        RadixSort rs = new RadixSort();
		rs.radixSort(ar);
		
		
        for (int i: ar) {
            System.out.println(i);
        }
        
        int[] a = {5, 4, 2, 9, 1, 6, 3, 8, 10, 7};
        
        BubbleSort bs = new BubbleSort();
		bs.bubbleSort(a);
		
		
        for (int i: a) {
            System.out.println(i);
        }
		
	}
}