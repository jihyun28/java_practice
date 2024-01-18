package exception.custom;

public class Account {
	private long balance;
	
	public long getBalance() {
		return this.balance;
	}
	
	// 음수로 입금할 경우 강제 예외처리
	public void deposit(int money) throws DepositMinusMoneyException {
		if (money < 0) {
			throw new DepositMinusMoneyException("음수로 입금할 수 없습니다.");
		}
		this.balance += money;
	}
	
	// 인출 시 잔액이 부족한 경우 강제 예외처리
	public void withdraw(int money) throws BalanceInsufficientException {
		if(this.balance < money) {
			throw new BalanceInsufficientException("잔고가 부족합니다.");
		}
		this.balance -= money;
	}
}