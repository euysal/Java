package homework6;

public class hm9_2 {
	public static void main (String[] args){
		
			Stock stock = new Stock("ORCL", "Oracle Corporation"); stock.setPreviousClosingPrice(34.5);
			 
			stock.setCurrentPrice(36.56);
			System.out.println("Previous closing price was  :" + stock.getPreviousClosingPrice());
			System.out.println("Current price is : " + stock.getCurrentPrice());
			System.out.printf("Price change: %f %%", stock.getChangePercent() * 100);
			} 
	}