package ex08class;

class FruitSeller2{
	int numOfApple = 100;
	int myMoney = 0;
	final int APPLE_PRICE = 1000;
	
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}

class FruitBuyer2{
	int myMoney = 5000;
	int numOfApple = 0;
	
	public void buyApple(FruitSeller2 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
}
public class E06FruitSalesMain2 {
	
	public static void main(String[] args) {
		FruitSeller2 seller = new FruitSeller2();
		FruitBuyer2 buyer = new FruitBuyer2();
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
		buyer.buyApple(seller, 5000);
		System.out.println("구매행위가 일어난 후의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
	}
}
