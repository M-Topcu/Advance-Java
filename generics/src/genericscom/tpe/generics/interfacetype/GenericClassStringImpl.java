package genericscom.tpe.generics.interfacetype;

//Normal bir sınıf oluşturmak için generic bir interface implement edilirse, interface implment
//edilirken tipini belirlemek zorundayız
public class GenericClassStringImpl implements GenericInterface<String> {

	@Override
	public void setValue(String t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}
	//methodlar override ederken de o tipe(String) gore ediyor otomatik

}
