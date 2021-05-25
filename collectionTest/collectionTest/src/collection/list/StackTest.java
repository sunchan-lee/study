package collection.list;

import java.util.Stack;

class Coin{
	private int value;
	public int getValue() {
		return value;
	}
	public Coin(int value) {
		this.value=value;
	}
}

public class StackTest {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<>();
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(50));
		
		for(Coin coin:coinBox) {
			System.out.println(coin.getValue());
		}
		System.out.println();
		
		while(!coinBox.isEmpty()) {
			Coin coin=coinBox.pop();		//꺼내올때.. 마지막 데이터 부터 뽑아온다.
			System.out.println(coin.getValue());
			System.out.println("남은개수: "+ coinBox.size());
		}

	}

}
