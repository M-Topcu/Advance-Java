package genericscom.tpe.generics.method;

import java.awt.Point;

public class GenericMethodDemo {

	public static void main(String[] args) {
		
		GenericMethodDemo gm=new GenericMethodDemo();
		Integer[] intArray= {1,23,54,56,45};
		Double[] doubleArray= {3.4,5.6,5.5,67.5};
		
		Point [] points= {new Point(10,10),new Point(5,6),new Point(54,34)};
		
		gm.print(intArray);
		gm.print(doubleArray);
		gm.print(points);

	}
	
	public <T> void print(T[] array) {
		for (T t : array) {
			System.out.println(t);
		}
	}
	
	//Aşağıdaki metotlardaki gibi parametre tiplerini tek tek overload yapmak yerine generic yapariz
//	public void print(Integer[] arr) {
//		
//	}
//	
//	public void print(String[] arr) {
//		
//	}
}
