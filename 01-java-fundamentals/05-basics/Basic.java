import java.util.ArrayList;
import java.util.Arrays;
public class Basic{
	// print 1 - 255
	public void count(){
		for (int j = 1; j<= 255; j++){
			System.out.println(j); 
		}
	}
	// odd 1 - 255
	public static void odd(){
		for (int j = 1; j<= 255; j++){
			if( j % 2 != 0){
				System.out.println(j);
			} 
		}
	}
	// sum 255
	public static void sum(){
		int i = 0;
		for (int j = 0; j<= 255; j++){
			i = i + j;
			System.out.println("New number: "+j+ " Sum: "+i);
		}
	}
	// itarating an Array
	public static void iterate(int[] x){
		for(int j = 0; j <= x.length-1; j++){
			System.out.println(x[j]);
		}
	}
	// find max
	public static void max(int[] x){
		int i = x[0];
		for(int j = 0; j <= x.length-1; j++){
			if(x[j]>i){
				i = x[j];
			}
		}
		System.out.println(i);
	}
	// arr w odd
	public static void arrOdd(){
		ArrayList<Object> y = new ArrayList<Object>();
		for (int j = 1; j<= 255; j++){
			if( j % 2 != 0){
				y.add(j);
			} 
		}
		System.out.println(y);
	}
	// average
	public static void avg(int[] x){
		int avg = 0;
		int i = 0;
		for (int j = 0; j< x.length; j++){
			i = x[j] + i;
		}
		avg = i/x.length;
		System.out.println(avg);
	}
	//greater than Y
	public static void greatest(int[] arr, int y){
		int counter = 0;
		for(int j=0; j<=arr.length-1; j++){
			if( arr[j] > y ){
				counter++;
			}
		}
		System.out.println(counter);
	}
	// squared
	public static void squared(int[] x){
		for(int j=0; j <= x.length-1;j++){
			x[j] = x[j]*x[j];
		}
		System.out.println(Arrays.toString(x));
	}
	// No Negatives
	public static void neg(int [] x){
		for(int j=0; j<= x.length-1;j++){
			if(x[j] < 0){
				x[j] = 0;
			}
		}
		System.out.println(Arrays.toString(x));
	}
	//IDK WHAT IS WRONG W IT BUT HERE I STAND!!!!!!!!!!!!!!!!
	// max min avg
	// public static int all(int[] x){
	// 	int[] newArray = new int[3];
	// 	//MAX
	// 	int max = x[0];
	// 	for(int j = 0; j <= x.length-1; j++){
	// 		if(x[j]>max){
	// 			max = x[j];
	// 		}
	// 	}
	// 	newArray[0] = max;
	// 	//MIN
	// 	int min = x[0];
	// 	for(int j = 0; j <= x.length-1; j++){
	// 		if(x[j]<min){
	// 			min = x[j];
	// 		}
	// 	}
	// 	newArray[1] = min;
	// 	//AVG
	// 	int avg = 0;
	// 	int i = 0;
	// 	for (int j = 0; j< x.length; j++){
	// 		i = x[j] + i;
	// 	}
	// 	avg = i/x.length;
	// 	newArray[2] = avg;
	// 	return newArray;
		// System.out.println(Arrays.toString(newArray));

	//}
	public static void shift(int[] x){
		for (int i = 0; i <= x.length-1; i++) {
            if(i == x.length-1) {
                x[i] = 0;
                break;
            }
            x[i] = x[i+1];
        }
        System.out.println(Arrays.toString(x));
    }

}