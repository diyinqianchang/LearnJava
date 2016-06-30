package crazyjava;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadConnectionTest {
	public static void main(String[] args) {
		AccountTest accountTest =  new AccountTest("12345",0);
		
		new DepositThread("存款者甲", accountTest, 800).start();
		new DrawThreadTest("取钱者1", accountTest, 800).start();
	}
}
//取钱
class DrawThreadTest extends Thread{
	private AccountTest accountTest;
	private double drawAmount;
	public DrawThreadTest(String name, AccountTest accountTest, double drawAmount) {
		super(name);
		this.accountTest = accountTest;
		this.drawAmount = drawAmount;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			accountTest.drawTest(drawAmount);
		}
	}
}
//存钱
class DepositThread extends Thread{
	private AccountTest accountTest;
	private double depositAmount;
	public DepositThread(String name, AccountTest accountTest, double depositAmount) {
		super(name);
		this.accountTest = accountTest;
		this.depositAmount = depositAmount;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			accountTest.deposit(depositAmount);
		}
	}
}
/*
 * 线程通信
 * */
class AccountTest{
	
	private final Lock lock = new ReentrantLock();
	private final Condition condition = lock.newCondition();
	
	private String accountNo;
	private double balance;
	
	private boolean flag = false;
	
	public AccountTest(){}
	public AccountTest(String accountNo, double balance) {
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
	//取钱synchronized
	public  void drawTest(double drawAmount) {
		lock.lock();
		try {
			if (!flag) {   
//				wait();      //先等待
				condition.await();
			}
				System.out.println(Thread.currentThread().getName()+"取款"+drawAmount);
				balance -= drawAmount;
				System.out.println("账户余额："+balance);
				flag = false;
//				notifyAll();
				condition.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	//存钱synchronized
	public  void deposit(double depositAmount) {
		lock.lock();
		try {
			if (flag) {
//				wait();
				condition.await();
			}
				System.out.println(Thread.currentThread().getName()+"存款:"+depositAmount);
				balance += depositAmount;
				System.out.println("账户余额为:"+balance);
				flag = true;
//				notifyAll();
				condition.signalAll();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			lock.unlock();
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNo == null) ? 0 : accountNo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (flag ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountTest other = (AccountTest) obj;
		if (accountNo == null) {
			if (other.accountNo != null)
				return false;
		} else if (!accountNo.equals(other.accountNo))
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (flag != other.flag)
			return false;
		return true;
	}
	
	
	
}