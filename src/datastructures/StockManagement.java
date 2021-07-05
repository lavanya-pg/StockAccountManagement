package datastructures;

import java.util.Scanner;

public class StockManagement
{
	public static void main(String[] args) {
		StockManagementImpl stockservice = new StockManagementImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.println("welcome to Stock management");
		System.out.println("Enter the num of shares to add: ");
		int numOfShares = scanner.nextInt();
		
		for (int index = 0; index < numOfShares; index++) {
			
			Stock newItem = new Stock();
			
			System.out.println("Enter Share name: ");
			newItem.setShareName(scanner.next());
			System.out.println("Enter share Price: ");
			newItem.setSharePrice(scanner.nextDouble());
			System.out.println("Enter no. of share taken: ");
			newItem.setShareCount(scanner.nextDouble());	
			stockservice.addStock(newItem);
		}
		stockservice.getStockDetails();
		stockservice.calculateShareValue();

	}
}
