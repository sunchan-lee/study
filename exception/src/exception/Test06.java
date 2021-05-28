package exception;

class Account{
	private long balance;
	
	public long getBalance() {
		return balance;
	}
	public void deposit(long money) {
		balance +=money;
	}
	public void withdraw(long money) {
		if(balance < money) {
			//잔액 부족
			throw new BalanceInsufficientException("잔액 부족 / 현재잔액 : " + getBalance());
		}
		balance -=money;
	}
}



public class Test06 {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.deposit(1000);
		account.deposit(1000);
		account.withdraw(3000);
		try {
			
		}catch (BalanceInsufficientException e) {
			// TODO: handle exception
		}{
			
		}
		

	}

}
