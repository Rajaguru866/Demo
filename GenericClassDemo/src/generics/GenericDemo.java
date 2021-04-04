package generics;

import java.util.Arrays;
import java.util.List;

public class GenericDemo {

	public static void main(String[] args) {
		
		DemoClass<Integer> demo = new DemoClass<Integer>();
		demo.setValue(15);
		System.out.println("The value is " + demo.getValue());
		List<Integer> list = Arrays.asList(1, 2, 3,4);
	    System.out.println("sum = " + sum(list));
		
	}
	
	public static double sum(List<? extends Number> numberlist) {
	      double sum = 0.0;
	      for (Number n : numberlist) 
	      {
	    	  sum += n.doubleValue();
	      }
	      return sum;
	   }
	
}
