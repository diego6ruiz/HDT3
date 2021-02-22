import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


public class SortTests {
	int n = 3000;

	
	private GnomeSort gs;
	private MergeSort ms;
	private QuickSort qs;
	private RadixSort rs;
	private BubbleSort bs;
	
	private ArrayFromTXT at;
	private ConvertIntegers ci;
	private TXTGenerator tg;
	
	private	ArrayList<Integer> arrayGnome = new ArrayList<Integer>();
	private int[] intArrayGnome = {};
	private ArrayList<Integer> arrayMerge = new ArrayList<Integer>();
	private int[] intArrayMerge = {};
	private ArrayList<Integer> arrayQuick = new ArrayList<Integer>();
	private int[] intArrayQuick = {};
	private ArrayList<Integer> arrayRadix = new ArrayList<Integer>();
	private int[] intArrayRadix = {};
	private ArrayList<Integer> arrayBubble = new ArrayList<Integer>();
	private int[] intArrayBubble = {};
	
	@BeforeEach
	public void setUp() throws Exception {	
		
		//Array para comparaciones
		
		gs = new GnomeSort();
		ms = new MergeSort();
		qs = new QuickSort();
		rs = new RadixSort();
		bs = new BubbleSort();
		
		at = new ArrayFromTXT();
		ci = new ConvertIntegers();
		tg = new TXTGenerator();
		
		tg.generateRandomTXT(n);
		
	}
	
	@Test 
	@DisplayName ("Gnome Sort")
	public void testGnomeSort() {
		int[] array = IntStream.range(1, n+1).toArray();
		arrayGnome = at.generateArray("random.txt");
		intArrayGnome = ci.convertIntegers(arrayGnome);
		long startTime = System.nanoTime();
		gs.gnomeSort(intArrayGnome, n);
		long estimatedTime = System.nanoTime() - startTime;
        double timeInSeconds = estimatedTime / 1E9;
        System.out.println("Gnome Sort: "+estimatedTime+" nanosegundoss.\n: "+timeInSeconds+" segundos.");
		assertArrayEquals(intArrayGnome, array);
	}
	
	@Test 
	@DisplayName ("Gnome Sort Ordenado")
	public void testGnomeSort2() {
		int[] array = IntStream.range(1, n+1).toArray();
		long startTime = System.nanoTime();
		gs.gnomeSort(array, n);
		long estimatedTime = System.nanoTime() - startTime;
        double timeInSeconds = estimatedTime / 1E9;
        System.out.println("Gnome Ordenado: "+estimatedTime+" nanosegundoss.\n: "+timeInSeconds+" segundos.");
		assertArrayEquals(array, array);
	}
	
	@Test 
	@DisplayName ("Merge Sort")
	public void testMergeSort() {
		int[] array = IntStream.range(1, n+1).toArray();
		arrayMerge = at.generateArray("random.txt");
		intArrayMerge = ci.convertIntegers(arrayMerge);
		long startTime = System.nanoTime();
		ms.mergeSort(intArrayMerge, 0, intArrayMerge.length-1);
		long estimatedTime = System.nanoTime() - startTime;
        double timeInSeconds = estimatedTime / 1E9;
        System.out.println("Merge Sort: "+estimatedTime+" nanosegundoss.\n: "+timeInSeconds+" segundos.");
		assertArrayEquals(intArrayMerge, array);
	}
	
	@Test 
	@DisplayName ("Merge Sort Ordenado")
	public void testMergeSort2() {
		int[] array = IntStream.range(1, n+1).toArray();
		long startTime = System.nanoTime();
		ms.mergeSort(array, 0, array.length-1);
		long estimatedTime = System.nanoTime() - startTime;
        double timeInSeconds = estimatedTime / 1E9;
        System.out.println("Merge Ordenado: "+estimatedTime+" nanosegundoss.\n: "+timeInSeconds+" segundos.");
		assertArrayEquals(array, array);
	}
	
	@Test 
	@DisplayName ("Quick Sort")
	public void testQuickSort() {
		int[] array = IntStream.range(1, n+1).toArray();
		arrayQuick = at.generateArray("random.txt");
		intArrayQuick = ci.convertIntegers(arrayQuick);
		long startTime = System.nanoTime();
		qs.quickSort(intArrayQuick, 0, intArrayQuick.length-1);
		long estimatedTime = System.nanoTime() - startTime;
        double timeInSeconds = estimatedTime / 1E9;
        System.out.println("Quick Sort: "+estimatedTime+" nanosegundoss.\n: "+timeInSeconds+" segundos.");
		assertArrayEquals(intArrayQuick, array);
	}
	
	@Test 
	@DisplayName ("Quick Sort Ordenado")
	public void testQuickSort2() {
		int[] array = IntStream.range(1, n+1).toArray();
		long startTime = System.nanoTime();
		qs.quickSort(array, 0, array.length-1);
		long estimatedTime = System.nanoTime() - startTime;
        double timeInSeconds = estimatedTime / 1E9;
        System.out.println("Quick Ordenado: "+estimatedTime+" nanosegundoss.\n: "+timeInSeconds+" segundos.");
		assertArrayEquals(array, array);
	}
	
	@Test 
	@DisplayName ("Radix Sort")
	public void testRadixSort() {
		int[] array = IntStream.range(1, n+1).toArray();
		arrayRadix = at.generateArray("random.txt");
		intArrayRadix = ci.convertIntegers(arrayRadix);
		long startTime = System.nanoTime();
		rs.radixSort(intArrayRadix, n);
		long estimatedTime = System.nanoTime() - startTime;
        double timeInSeconds = estimatedTime / 1E9;
        System.out.println("Radix Sort: "+estimatedTime+" nanosegundoss.\n: "+timeInSeconds+" segundos.");
		assertArrayEquals(intArrayRadix, array);
	}
	
	@Test 
	@DisplayName ("Radix Sort Odenado")
	public void testRadixSort2() {
		int[] array = IntStream.range(1, n+1).toArray();
		long startTime = System.nanoTime();
		rs.radixSort(array, n);
		long estimatedTime = System.nanoTime() - startTime;
        double timeInSeconds = estimatedTime / 1E9;
        System.out.println("Radix Odenado: "+estimatedTime+" nanosegundoss.\n: "+timeInSeconds+" segundos.");
		assertArrayEquals(array, array);
	}
	
	@Test 
	@DisplayName ("Bubble Sort")
	public void testBubbleSort() {
		int[] array = IntStream.range(1, n+1).toArray();
		arrayBubble = at.generateArray("random.txt");
		intArrayBubble = ci.convertIntegers(arrayBubble);
		long startTime = System.nanoTime();
		bs.bubbleSort(intArrayBubble);
        long estimatedTime = System.nanoTime() - startTime;
        double timeInSeconds = estimatedTime / 1E9;
        System.out.println("Bubble Sort: "+estimatedTime+" nanosegundoss.\n: "+timeInSeconds+" segundos.");
		assertArrayEquals(intArrayBubble, array);
	}
	
	@Test 
	@DisplayName ("Bubble Sort Ordenado")
	public void testBubbleSort2() {
		int[] array = IntStream.range(1, n+1).toArray();
		long startTime = System.nanoTime();
		bs.bubbleSort(array);
        long estimatedTime = System.nanoTime() - startTime;
        double timeInSeconds = estimatedTime / 1E9;
        System.out.println("Bubble Ordenado: "+estimatedTime+" nanosegundoss.\n: "+timeInSeconds+" segundos.");
		assertArrayEquals(array, array);
	}
	
	
	
	
	

}