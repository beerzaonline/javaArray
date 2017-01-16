package rmuti.javaArray;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ArrayOperation test = new ArrayOperation();
//		System.out.println("SumOfArray : "+test.SumArrays());
//		System.out.println("MaxOfArray : "+test.maxArrays());
		int num[]=test.copyArray(2, 8);
		for(int i=0;i<8;i++){
			System.out.println(num[i]);
		}
	}
}
