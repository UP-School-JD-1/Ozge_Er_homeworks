package Bank;

import java.util.Scanner;

public class AccountTest  {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); //try-catch blok istiyor.o yuzden uyari var.
		Accounts ac1=new Accounts(1000);
		Accounts ac2= new Accounts(1200);
		AccountClients customer1= new AccountClients("oguz","yıldırım",1671275);
		AccountClients customer2=new AccountClients("asya", "gungor", 123563);
		ac1.customer1=customer1; // hesabin sahibi,musterinin hesabi var.
		ac2.customer2=customer2;
		
		System.out.println("hesap sahibi:"+ac1.customer1.name);
		//ac1.withdrawMoney(100);
		//System.out.println("cekilen miktar:"+ac1.getDecreasing());
		System.out.println("guncel hesap bakiyesi:"+ac1.getBalance());
		
		System.out.println("\n");
		System.out.println("aktarmak istediginiz miktari giriniz:");
		int amount=input.nextInt();
		
		
		System.out.println("hesap sahibi:"+ac2.customer2.name);
		System.out.println("transferden onceki hesap bakiyesi:"+ac2.getBalance());
		ac1.transferMoney(ac1, ac2, amount); // miktari girdi olarak aldim. 21. satirda.
		System.out.println("transferden sonraki hesap bakiyesi:"+ac2.getBalance());
		
		System.out.println("\n"+ac1.customer1.name+"'un guncel hesap bakiyesi:"+ac1.getBalance());
		
		
		
	}
	

	

	
	
	

}
