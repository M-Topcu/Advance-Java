package genericscom.tpe.generics.bounding;

//Üstten sınırlama
//Sınıftan obje oluşturabilmek için Number'ı extend eden Wrapper tiplerden vermem gerekir.
public class GenericUpperBound <T extends Number>{

private T[] numberArray;
	
	public GenericUpperBound(T [] pNumberArray) {
		this.numberArray=pNumberArray;
	}
	
	public double getAverage() {
		double sum=0;
		
		for (T t : numberArray) {
			sum+=t.doubleValue();
		}
		
		double avg=sum/numberArray.length;
		return avg;
	}
	
	public static void main(String[] args) {
		 Integer [] intArr= {2,5,6,34};
		 GenericUpperBound<Integer> gub1=new GenericUpperBound<>(intArr);
		 System.out.println(gub1.getAverage());
		 
		 
		 Double [] doubleArr= {2.5,5.54,6.34,34.34};
		 GenericUpperBound<Double> gub2=new GenericUpperBound<>(doubleArr);
		 System.out.println(gub2.getAverage());
		
		 //Compile Time Error
//		 String [] strArray= {"Java","Kolay","Bir","Dil midir?"};
//		 GenericUpperBound<String> gub3=new GenericUpperBound<>();
		 
	}
}
