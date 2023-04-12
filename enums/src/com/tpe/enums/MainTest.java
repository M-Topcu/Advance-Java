package com.tpe.enums;

public class MainTest {

	public static void main(String[] args) {
		
		//Constanr degerler verirken herhangi bir deger verebiliriz sinirlama yok
		//eger kod duzgun dizayn edilmediyse runtime hatalar olusabilir
		useConstantMethod(1);
		useConstantMethod(2);
		useConstantMethod(3);
		useConstantMethod(4);
		useConstantMethod(5);
		
		System.out.println("----------------------------------------------");
		
		//Enum tipinde var olan herhangi bir deger secilebilir 
		//olmayan bir deger secilirse cte alinacaktir
		useEnumMethod(TransactionType.DEPOSIT);
		useEnumMethod(TransactionType.WITHDRAW);
		useEnumMethod(TransactionType.TRANSFER);
		useEnumMethod(TransactionType.PAYMENT);
		useEnumMethod(TransactionType.OTHER);
		
		
		//ransactionType.values() o enumdaki tum type`lari veriyor
		for (TransactionType tt : TransactionType.values()) {
			System.out.println("TransactionType: " +tt.name());
		}

	}
	
	private static void useConstantMethod(int i) {
		if(i==TransactionTypeConstant.DEPOSIT) {
			System.out.println("Money is depositing");
		}else if(i==TransactionTypeConstant.WITHDRAW) {
			System.out.println("Money is withdrawing");
		}else if(i==TransactionTypeConstant.TRANSFER) {
			System.out.println("Money is transfering");
		}else if(i==TransactionTypeConstant.WITHDRAW) {
			System.out.println("Money is withdrawing");
		}else if(i==TransactionTypeConstant.PAYMENT) {
			System.out.println("Money is being made");
		}else System.out.println("Other transaction");
		
	}
	
	private static void useEnumMethod(TransactionType transactionType) {
//		if(transactionType==TransactionType.DEPOSIT) {
//			System.out.println("Money is depositing");
//		}else if(transactionType==TransactionType.WITHDRAW) {
//			System.out.println("Money is withdrawing");
//		}else if(transactionType==TransactionType.TRANSFER) {
//			System.out.println("Money is transfering");
//		}else if(transactionType==TransactionType.PAYMENT) {
//			System.out.println("Money is being made");
//		}else System.out.println("Other transaction");
//		
		
		switch (transactionType) {
		case DEPOSIT:
			System.out.println("Money is depositing");
			break;
		case WITHDRAW:
			System.out.println("Money is withdrawing");
			break;
		case TRANSFER:
			System.out.println("Money is transfering");
			break;
		case PAYMENT:
			System.out.println("Money is being made");
			break;

		default:
			System.out.println("Other transaction");
			break;
		}
		
		//ordinal degerini kullanarak calismak riskli cunku yeni bir enum araya eklenirse ordinaller degisebilir
		System.out.println("Enum name: "+transactionType.name());
		System.out.println("Enum name: "+transactionType.name().toString());//usttekiyle ayni
		System.out.println("Enum ordinal: "+transactionType.ordinal());
		System.out.println("Enum code: "+transactionType.getTransactionCode());
		
	}

}
