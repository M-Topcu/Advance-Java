package genericscom.tpe.generics.example;

import java.util.List;

public interface IRepository <T extends BaseClass>{

	//CRUD Operations
	
	void save(T t);
	
	T find(T t);
	
	void update (T t);
	
	void delete(T t);
	
	List<T> getAll();
	
}
