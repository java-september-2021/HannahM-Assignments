public class TestFizzBuzz {
    public static void main(String[] args) {
        //Create instance of Fb class
        FizzBuzz fb = new FIzzBuzz();
        System.out.println(fb.fizzbuzz(3)); //Fizz
        System.out.println(fb.fizzbuzz(5)); //Buzz
        System.out.println(fb.fizzbuzz(15)); //FizzBuzz
        System.out.println(fb.fizzbuzz(2)); //2

        // for (int i=0; i<=15; i++){
        //     System.out.println(fb.fizzbuzz(i));
        // }

        // System.out.println(fb.fizzbuzz(6)); //Fizz
        // System.out.println(fb.fizzbuzz(25)); //Buzz
    }
}

// this is right I know it is I wrote it 4 times then followed video but my console says:  symbol:   method fizzbuzz(int)
// location: variable fb of type FizzBuzz
// TestFizzBuzz.java:8: error: cannot find symbol
//       System.out.println(fb.fizzbuzz(2)); //2 and it pointing the .

