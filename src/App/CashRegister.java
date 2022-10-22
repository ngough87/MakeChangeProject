package App;
import java.util.Scanner;

public class CashRegister {

	

		
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			//User Story #1 The user is prompted asking for the price of the item.
			
			System.out.println("What is the price of the item? ");
			System.out.println("Enter amount in dollars and cents: ");
			double itemPrice = sc.nextDouble();
		
			
			
			
			//User Story #2 The user is then prompted asking how much money was 
			//tendered by the customer.

			System.out.println("How much money was given by customer? ");
			System.out.println("Enter in dollars and cents: ");
			double moneyGiven = sc.nextDouble();
		
			
			
			double difference = moneyGiven-itemPrice;
			double changeTen = 0.0;
			double changeFive = 0.0;
			double changeDolla = 0.0;
			double changeQuarters = 0.0;
			double changeDime =0.0;
			double changeNickel = 0.0;
			double changePenny = 0.0;
			double remainder = 0.0;
			
			
			int dollaTen = (int)(difference / 10.0);
			changeFive = difference % 10.0;
			
			int dollaFive = (int)(changeFive/ 5.0);
			changeDolla = changeFive % 5.0;
			
			int dollaDolla = (int)(changeDolla / 1.0);
			changeQuarters = changeDolla % 1.0;
			
			int getQuartered = (int)(changeQuarters / 0.250);
			changeDime = changeQuarters % 0.250;
			
			int dimePiece = (int)(changeDime / 0.100);
			changeNickel = changeDime % 0.100;
			
			int nickelBack =(int)(changeNickel/ 0.050);
			changePenny = changeNickel % 0.050;
			
			int pennyWise = (int)((changePenny / 0.010) + .5);
			remainder = changePenny % 0.010;
			
			
			
			//User Story #3 Display an appropriate message if the customer 
			//provided too little money or the exact amount.
			
			if (itemPrice > moneyGiven) {
					System.out.println("Error too little money given. Money please! " );
					
				}
				
			//User Story #4
			//If the amount tendered is more than the cost of the item, display 
			//the number of bills and coins that should be given to the customer.
				if (dollaTen > 1) {
				System.out.println("Amount returned: " + dollaTen + " ten dollar bills");
				}  if(dollaTen == 1) {
					System.out.println("Amount returned: " + dollaTen + " ten dollar bill");
				} 
			
				if (dollaFive > 1) {
				System.out.println("Amount returned: " + dollaFive + " five dollar bills");
				} else if (dollaFive == 1) {System.out.println("Amount returned: " + dollaFive + " five dollar bill");
				}
				
				if (dollaDolla > 1) {
				System.out.println("Amount returned: " + dollaDolla + " dollar bills");
				} else if(dollaDolla == 1) {
					System.out.println("Amount returned: " + dollaDolla + " dollar bill");
				} 
			 	
				if (getQuartered > 1) {
				System.out.println("Amount returned: " + getQuartered + " quarters");
			 	}else if(getQuartered == 1) {
					System.out.println("Amount returned: " + getQuartered + " quarter");
				} 
				
				if (dimePiece > 1) {
				System.out.println("Amount returned: " + dimePiece + " dimes");
				 } else if(dimePiece == 1) { 
					 System.out.println("Amount returned: " + dimePiece + " dime");
				 }
				
				if (nickelBack > 1) { System.out.println("Amount returned: " + nickelBack +  " nickels");
				  } else if(nickelBack == 1) { 
						 System.out.println("Amount returned: " + nickelBack+ " nickel");
					 }
				 
				 if (pennyWise > 1) { System.out.println("Amount returned: " + pennyWise + " pennies");
				 	}else if(pennyWise == 1) { 
						 System.out.println("Amount returned: " + pennyWise + " penny");
					 }
				 
			
		
			sc.close();
		}
		

	}


