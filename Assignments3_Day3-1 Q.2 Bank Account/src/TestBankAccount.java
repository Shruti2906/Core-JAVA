
import java.util.Scanner;

public class TestBankAccount {

	public static void main(String[] args) {
		
		bankAccount acc = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Bank Account Number : ");
		int accNo = sc.nextInt();
		
		System.out.println("Enter Customer Name : ");
		String nm = sc.next();
		
		System.out.println("Enter Account Type (1/2): ");
		System.out.println("1 : Saving\t2 : Current : ");
		int type = sc.nextInt();
		
		System.out.println("Enter Initial Balance : ");
		float bal = sc.nextFloat();
		
		boolean b = true;
		try {
			if(bal<0) {
				throw new NegativeAmountException();
			}
			if(type==1 && bal<1000) {
				
				throw new LowBalanceException();
			}
			if(type==2 && bal<5000) {
				throw new LowBalanceException();
			}
			b = false;
		}
		catch(LowBalanceException e) {
			System.out.println(e);
		}
		catch(NegativeAmountException e) {
			System.out.println(e);
		}
		
		if(!b) {
			
			if(type==1) {
				acc = new bankAccount(accNo, nm, "Saving", bal);
				
				System.out.println(acc.getBalance());
			}	
			else {
				acc = new bankAccount(accNo, nm, "Current", bal);
			}
			
			String str;
			do {
					System.out.println("1 : Deposit\n2 : Withdraw\n3 : Check Bank Balance");
					System.out.println("Enter Your choice : ");
					int ch = sc.nextInt();
					switch(ch) {
					case 1:
						System.out.println("Enter amount to deposit : ");
						int amount = sc.nextInt();
						acc.deposit(amount);
						System.out.println("Amount Deposited Successfully..");
						break;
					case 2:
						System.out.println("Enter amount to debit : ");
						int amount1 = sc.nextInt();
						acc.withdraw(amount1);
						
						break;
					case 3:
						System.out.println("Available Balance is : "+acc.getBalance());
						break;
					default:System.out.println("Invalid choice..");
					}
				
					System.out.println("want to perform transaction again(Y/N) : ");
					str = sc.next();
			}while(str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("y"));
		}
		System.out.println("Thank You for Banking with us..!!");
		
	}

}
