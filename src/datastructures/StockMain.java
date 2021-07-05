package datastructures;
import java.util.Scanner;

public class StockMain
{
		public static void main(String[] args) 
		{
			StockManagementImpl stockservice = new StockManagementImpl();
			Scanner sc = new Scanner(System.in);
			System.out.println("welcome to Stock management");
			System.out.println("Enter the num of shares to add: ");
			int numOfShares = sc.nextInt();
			
			for (int i = 0; i < numOfShares; i++) {
				
				Stock newItem = new Stock();
				
				System.out.println("Enter Share name: ");
				newItem.setShareName(sc.next());
				System.out.println("Enter share Price: ");
				newItem.setSharePrice(sc.nextDouble());
				System.out.println("Enter no. of share taken: ");
				newItem.setShareCount(sc.nextDouble());	
				stockservice.addStock(newItem);
			}
			stockservice.getStockDetails();
			stockservice.calculateShareValue();

		}
}
