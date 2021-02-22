/*
 * Diego Ruiz
 * Javier Alvarez
 * 
 * Driver program
 * Hoja de Trabajo 3
 * Sort con metodos Gnome, Merge, Radix, Quick y Bubble.
 * 
*/

import java.util.ArrayList;

public class Main {  
	public static void main(String[] args) {
		//n define el numero de elementos con los que se trabaja
		int n = 10;
		//Listas para Gnome Sort
		ArrayList<Integer> arrayGnome = new ArrayList<Integer>();
		int[] intArrayGnome = {};
		//Listas para Merge Sort
		ArrayList<Integer> arrayMerge = new ArrayList<Integer>();
		int[] intArrayMerge = {};
		//Listas para Quick Sort
		ArrayList<Integer> arrayQuick = new ArrayList<Integer>();
		int[] intArrayQuick = {};
		//Listas para Radix Sort
		ArrayList<Integer> arrayRadix = new ArrayList<Integer>();
		int[] intArrayRadix = {};
		//Listas para Bubble Sort
		ArrayList<Integer> arrayBubble = new ArrayList<Integer>();
		int[] intArrayBubble = {};
		
		ArrayFromTXT at = new ArrayFromTXT();
		ConvertIntegers ci = new ConvertIntegers();
		
		TXTGenerator ag = new TXTGenerator();
		ag.generateRandomTXT(n);
        
        //Proceso de ordenamiento Gnome Sort
		//retorno de txt ordenado
		arrayGnome = at.generateArray("random.txt");
		intArrayGnome = ci.convertIntegers(arrayGnome);
        GnomeSort gs = new GnomeSort();
		gs.gnomeSort(intArrayGnome, n);
		for (int i: intArrayGnome) {
            System.out.println(i);
        }
        //Ordenamiento de txt previamente Ordenado
        gs.gnomeSort(intArrayGnome, n);
        for (int i: intArrayGnome) {
            System.out.println(i);
        }
         
		//Proceso de ordenamiento Merge Sort
		//retorno de txt ordenado
        arrayMerge = at.generateArray("random.txt");
        intArrayMerge = ci.convertIntegers(arrayMerge);
        MergeSort ms = new MergeSort();
        ms.mergeSort(intArrayMerge, 0, intArrayMerge.length-1);
        for (int i: intArrayMerge) {
            System.out.println(i);
        }
        //Ordenamiento de txt previamente Ordenado
        ms.mergeSort(intArrayMerge, 0, intArrayMerge.length-1);
        for (int i: intArrayMerge) {
            System.out.println(i);
        }
        
		//Proceso de ordenamiento Quick Sort
		//retorno de txt ordenado
        arrayQuick = at.generateArray("random.txt");
        intArrayQuick = ci.convertIntegers(arrayQuick);
        QuickSort qs = new QuickSort();
		qs.quickSort(intArrayQuick, 0, intArrayQuick.length-1);
        for (int i: intArrayQuick) {
            System.out.println(i);
        }
        //Ordenamiento de txt previamente Ordenado
        qs.quickSort(intArrayQuick, 0, intArrayQuick.length-1);
        for (int i: intArrayQuick) {
            System.out.println(i);
        }
        
		//Proceso de ordenamiento Radix Sort
		//retorno de txt ordenado
        arrayRadix = at.generateArray("random.txt");
        intArrayRadix = ci.convertIntegers(arrayRadix);
        RadixSort rs = new RadixSort();
		rs.radixSort(intArrayRadix, n);
        for (int i: intArrayRadix) {
            System.out.println(i);
        }
        //Ordenamiento de txt previamente Ordenado
        rs.radixSort(intArrayRadix, n);
        for (int i: intArrayRadix) {
            System.out.println(i);
        }
        
		//Proceso de ordenamiento Bubble Sort
		//retorno de txt ordenado
        arrayBubble = at.generateArray("random.txt");
        intArrayBubble = ci.convertIntegers(arrayBubble);
        BubbleSort bs = new BubbleSort();
		bs.bubbleSort(intArrayBubble);
        for (int i: intArrayBubble) {
            System.out.println(i);
        }
        //Ordenamiento de txt previamente Ordenado
        bs.bubbleSort(intArrayBubble);
        for (int i: intArrayBubble) {
            System.out.println(i);
        }
		
	}
}
