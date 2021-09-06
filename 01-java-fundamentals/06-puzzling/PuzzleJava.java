import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PuzzleJava{
	public static int[] randomTen(){
		int[] randomArray = new int[10];
		Random r = new Random();
		for (int i=0; i < randomArray.length; i++) {
			randomArray[i] = r.nextInt(20) + 1; 
		}
		return randomArray; 
	}
	public static void alphabetScramble() {
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char i = 'a'; i <= 'z'; i++) {
            alphabet.add(i);
        }
        Collections.shuffle(alphabet);
        System.out.println(alphabet);
        System.out.println(alphabet.get(alphabet.size()-1));
        System.out.println(alphabet.get(0));
    }
    public static String passwordString() {
        ArrayList<Character> randomCharArray = new ArrayList<Character>();
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char i = 'a'; i <= 'z'; i++) {
            alphabet.add(i);
        }
        Collections.shuffle(alphabet);
        for (int i = 0; i<8; i++) {
            randomCharArray.add(alphabet.get(i));
        }
        // System.out.println(randomCharArr);
        StringBuilder randomString = new StringBuilder();
        for (char randomChar : randomCharArray) {
                randomString.append(randomChar);
            }
        return randomString.toString();
    }
}