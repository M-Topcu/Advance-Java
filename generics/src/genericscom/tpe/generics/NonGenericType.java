package genericscom.tpe.generics;

public class NonGenericType {
	
	private Object o;

	public Object getO() {
		return o;
	}

	public void setO(Object o) {
		this.o = o;
	}

	public static void main(String[] args) {
		
		NonGenericType obj1=new NonGenericType();
		NonGenericType obj2=new NonGenericType();
		
		obj1.setO("John");
		obj2.setO(65);;
		
		String str1 = (String) obj1.getO();
		System.out.println(str1);
		
		String str2 = (String) obj2.getO();
//		System.out.println(str2); //java.lang.ClassCastException

	}

}
