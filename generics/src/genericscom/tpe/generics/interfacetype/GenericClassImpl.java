package genericscom.tpe.generics.interfacetype;

public class GenericClassImpl<T> implements GenericInterface<T>{
	
	//Eğer bir generic interface implement ederseniz, Class'da generic olmalı 

	@Override
	public void setValue(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
