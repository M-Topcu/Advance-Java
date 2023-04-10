package genericscom.tpe.generics;

import java.awt.Point;

public class GenericTypeTwoParam <S,U>{
	
	private S s;
	
	private U u;

	public GenericTypeTwoParam(S s, U u) {
		super();
		this.s = s;
		this.u = u;
	}

	public S getS() {
		return s;
	}

	public void setS(S s) {
		this.s = s;
	}

	public U getU() {
		return u;
	}

	public void setU(U u) {
		this.u = u;
	}

	public static void main(String[] args) {
		
		GenericTypeTwoParam<String,Integer> gt = new GenericTypeTwoParam<>("Java",1);
		GenericTypeTwoParam<Integer, Point> gt2 = new GenericTypeTwoParam<>(1,new Point(10,50));
		
		System.out.println(gt.getS());
		System.out.println(gt2.getU());
		
		
		
	}

}
