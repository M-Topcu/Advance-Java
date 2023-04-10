package genericscom.tpe.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericType <T>{
	
	private T type;

	public T getType() {
		return type;
	}
	
//	public static T getType2() {
//		return type;
//	}
// Generic Type methodlarda static kullanilamaz

	public void setType(T type) {
		this.type = type;
	}

	public static void main(String[] args) {
		
		GenericType<String> obj1=new GenericType<>();
		
		obj1.setType("Generic types in JAVA");
		
		GenericType<String> obj2=new GenericType<>();
		//obj2.setType(65); //CTE
		
		GenericType<Integer> obj3=new GenericType<>();
		obj3.setType(65);

		List<String> list=new ArrayList<>();
		list.add("Java");
		list.add("Generic");
		//list.add(new Point()); Compile Time Error
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "Java");
	//	map.put("Java",1); Compile Time Error
		
		
	}

}
