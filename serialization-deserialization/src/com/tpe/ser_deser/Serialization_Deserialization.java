package com.tpe.ser_deser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization_Deserialization {

	public static void main(String[] args) {
		
		//writeObjects();
		readObjects();
			
}

	public static void writeObjects() {
		System.out.println("User objeleri oluşturuluyor....");
		
		User user1 = new User(1L, "John Coffee", "345-34-344");
		User user2 = new User(2L, "James Bond", "676-34-344");
		User user3 = new User(3L, "John Coffee", "676-55-599");

		try(FileOutputStream fos = new FileOutputStream("user.dat")){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(user1);
				oos.writeObject(user2);
				oos.writeObject(user3);
			}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("User objeleri serialized yapıldı");
	}
	
	
	private static void readObjects() {
		try(FileInputStream fis=new FileInputStream("user.dat")){
			try(ObjectInputStream ois=new ObjectInputStream(fis)){
				
				User user1= (User) ois.readObject();
				User user2= (User) ois.readObject();
				User user3= (User) ois.readObject();
				
				System.out.println(user1);
				System.out.println(user2);
				System.out.println(user3);
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		

}


class User implements Serializable{
	/**
	 * Deserialization yapan taraf serialVersionUID numaralarını karşılaştırıyor farklı ise
	 * aşağıdaki exceptionu fırlatıyor. 
	 * java.io.InvalidClassException: com.tpe.ser_deser.User; local class incompatible:
	 */
//	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String ssn;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public User(Long id, String name, String ssn) {
		this.id = id;
		this.name = name;
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", ssn=" + ssn + "]";
	}
	
	
}
