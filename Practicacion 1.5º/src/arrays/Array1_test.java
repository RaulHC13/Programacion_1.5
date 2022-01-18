package arrays;
import java.util.Arrays;

public class Array1_test {

	public static void main(String[] args) {
		
		int[] arrayInt = {4,3,2,2,4,5,6,7,1,1,10};
		
		System.out.println(arrayInt[0]);
		
		System.out.println(arrayInt[(int)Math.round(Math.random()*10)]);
		
		System.out.println(arrayInt.length);
		
		Arrays.sort(arrayInt);
		
		System.out.println(arrayInt[0]);
		
	}

}
