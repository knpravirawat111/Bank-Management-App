package bankingApp;
import java.util.Scanner;
public class BankingApp {
	
	public static void main(String [] args) {
		 System.out.println("========================================");
		 System.out.println("============Enter the Option============");
		 System.out.println("========================================");
		BankAccount bank1=new BankAccount();
		bank1.showMenu();
	}

}

 class BankAccount{
	 Scanner sc=new Scanner(System.in);
	 int balance;
	 int previousTransaction;
	 String costumerName="XYZ";
	 int costumerId=01;
	 
	 void deposite(int amount) {
		 previousTransaction=amount;
		 balance=balance+amount;
		 
	 }
	 void withdrow(int amount) {
		 previousTransaction=-amount;
		 balance=balance-amount;
		 
	 }
	 
	 void getPreviousTransaction() {
		 if(previousTransaction>0) {
			 System.out.println("Deposited "+previousTransaction);
		 }
		 else  if(previousTransaction>0) {
			 System.out.println("withdrow "+Math.abs(previousTransaction));
		 }
		 else { 
			 System.out.println("No Transaction");
		 }
	 }      
	 
	 void showMenu() {

//		 Scanner.sc=new Scanner(System.in);
	
		 System.out.println("Welcome to user");
		 System.out.println("Your Coustumer Name is "+costumerName);
		 System.out.println("Your Coustumer Id is "+costumerId);
		 System.out.println();
		 System.out.println("A: Check Balance");
		 System.out.println("B: Deposite");
		 System.out.println("C: Withdrow");
		 System.out.println("D: Check Previous Transaction");
		 System.out.println("E: Exit");
		 char option;
		 
		 do{
			
	         option=sc.next().charAt(0);
	       
	         
	         switch(option) {
	         
	         case 'A':
	        	 System.out.println("========================================");
	        	 System.out.println("your Balance is "+balance);
	        	 System.out.println("========================================");
	        	 break;
	         case 'B':
	        	 System.out.println("========================================");
	        	 System.out.println("Enter the Amount of Deposite");
	        	 System.out.println("========================================");
	        	 int amount2=sc.nextInt();
	        	 deposite(amount2);
	        	 System.out.println();
	        	 break;
	         
	         case 'C':
        	 System.out.println("========================================");
        	 System.out.println("Enter the Amount of Withdrow");
        	 System.out.println("========================================");
        	 int amount1=sc.nextInt();
        	 withdrow(amount1);
        	 System.out.println();
        	 break;
        
	     case 'D':
        	 System.out.println("========================================");
        	 getPreviousTransaction();
        	 System.out.println("========================================");
        	 System.out.println();
        	 break;
        	 
	     case 'E':
        	 System.out.println("========================================");
        	 System.out.println("===============Thank You================");
        	 System.out.println("========================================");
        	 System.out.println();
        	 break;
         
	         }   
			 
		 }while(option!='E');
		 
		 
	 }
	 
	 
	 
 }