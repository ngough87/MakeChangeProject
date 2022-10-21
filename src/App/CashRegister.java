package App;
import java.util.Scanner;

public class CashRegister {

	

		
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			//User Story #1 The user is prompted asking for the price of the item.
			
			System.out.println("What is the price of the item? ");
			System.out.println("Enter amount in dollars and cents: ");
			double itemPrice = sc.nextDouble();
			sc.nextLine();
			
			
			
			//User Story #2 The user is then prompted asking how much money was 
			//tendered by the customer.

			System.out.println("How much money was given by customer? ");
			System.out.println("Enter in dollars and cents: ");
			double moneyGiven = sc.nextDouble();
			sc.nextLine();
			
			
			//Currency returned to the customer
			
			//double makeChange = itemPrice - moneyGiven;
			
			
			//System.out.println("Amount to be returned to customer " + makeChange);
			
			int difference = (int)(moneyGiven * 100);
			
			int dollDolla = (int)(difference /100);
			System.out.println("Amount returned in dollars " + dollaDolla);
			
			//User Story #3 Display an appropriate message if the customer 
			//provided too little money or the exact amount.
		
	
		
			
			
			//User Story #4
			//If the amount tendered is more than the cost of the item, display 
			//the number of bills and coins that should be given to the customer.
			
		
			sc.close();
		}
		

	}


