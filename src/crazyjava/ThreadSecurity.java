package crazyjava;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadSecurity {

	public static void main(String[] args) {
		Account account = new Account("1234567",1000);
		new DrawThread("甲", account, 800).start();
		new DrawThread("乙", account, 800).start();

	}

}


class Account{
	
	private final ReentrantLock lock = new ReentrantLock();
	
	private String accountNo;
	private double balance;
	public Account(){}
	public Account(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public int hashCode() {
		return accountNo.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj != null && obj.getClass() == Account.class){
			Account tAccount = (Account)obj;
			return tAccount.getAccountNo().equals(accountNo);
		}
		return false;
	}
	
	public  void draw(double drawAccount){
		lock.lock();
		if (balance >= drawAccount) {
			System.out.println(Thread.currentThread().getName()+"取钱成功!吐出钞票" +drawAccount);	
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
			balance -= drawAccount;
			System.out.println("余额为:"+balance);
		}else {
			System.out.println(Thread.currentThread().getName()+"取钱失败！余额不足");
		}
		lock.unlock();
	}
}

class DrawThread extends Thread{
	private Account account;
	private double drawAccount;
	public DrawThread(String name, Account account, double drawAccount) {
		super(name);
		this.account = account;
		this.drawAccount = drawAccount;
	}
	@Override
	public void run() {
		/*
		 * 方法1
		 * */
//		synchronized (account) {
//			if (account.getBalance() >= drawAccount) {
//				System.out.println(getName()+"取钱成功!吐出钞票" +drawAccount);
//				
//				try {
//					Thread.sleep(1);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				account.setBalance(account.getBalance() - drawAccount);
//				System.out.println("余额为:"+account.getBalance());
//			}else {
//				System.out.println(getName()+"取钱失败！余额不足");
//			}
//		}
		/*
		 * 方法2
		 */
		account.draw(drawAccount);
		
	}
	
}


