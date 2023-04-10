package genericscom.tpe.generics.bounding;

	import java.util.ArrayList;
	import java.util.List;

	public class GenericsLowerBoundandWildCard {

		public static void main(String[] args) {
			
			List<Object> ol=new ArrayList<>();
			printElements(ol);
			
			List<Number> nl=new ArrayList<>();
			printElements(nl);
			
			//Compile Time Error
//			List<Double> dl=new ArrayList<>();
//			printElement(dl);
			
			printElements2(new ArrayList<String>());
			
			
			List<String> strList=new ArrayList<>();
			//printObj(strList); Compile Time Error
			

			List<Object> objList=new ArrayList<>();
			printObj(objList); 

		}
		
		//? Integerin superi olan sınfları temsil etmektedir.
		//? -> Wild Card
		public static void printElements(List<? super Integer> list) {
			for (int i = 1; i <=10; i++) {
				list.add(i);
			}
		}
		
		//unbound bir liste parametre alıyor.
		public static void printElements2(List<?> listOfUnknown) {
		     //listOfUnknown.add("Java"); Compile Time Error
			//listOfUnknown.add(null); // error yok
			for (Object object : listOfUnknown) {
				System.out.println(object);
			}
			
		}
		
		
		public static void printObj(List<Object> listOfObject) {
			listOfObject.add("Java");
			for (Object object : listOfObject) {
				System.out.println(object);
			}
			
		}
}
