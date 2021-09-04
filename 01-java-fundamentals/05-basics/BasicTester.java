import java.util.Arrays;
public class BasicTester {
	public static void main (String[] args ) {
		Basic basic = new Basic();
		// basic.count();
		// basic.odd();
		// basic.sum();
		int [] arr = {1,3,5,7,9,13};
		int [] arr1 = {1,7,-1,0};
		int [] arr2 = {-1,-3,-5,-7,-9,-13};
		int [] arr3 = {2,10,3};
		int [] arr4 = {1,5,10,-2};
		// basic.iterate(arr);
		// basic.max(arr2);
		// basic.arrOdd();
		// basic.avg(arr3);
		// basic.greatest(arr1, 0);
		// basic.squared(arr4);
		// basic.neg(arr4);
		// int[] all = basic.all(arr4);
		// System.out.println(Arrays.toString(all));
		basic.shift(arr4);
	}
}