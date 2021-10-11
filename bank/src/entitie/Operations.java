package entitie;

public class Operations {
	private int numberOfAccount;
	private String nameOfAccount;	
	private double balance;
	
	/* Construtores */
	public Operations(int numberOfAccount, String nameOfAccount, double initialDeposit){
		this.numberOfAccount = numberOfAccount;
		this.nameOfAccount = nameOfAccount;
		deposit(initialDeposit);
	}
	public Operations(int numberOfAccount, String nameOfAccount){
		this.numberOfAccount = numberOfAccount;
		this.nameOfAccount = nameOfAccount;
	}
	
	/* Getters e Setters */
	public String getNameOfAccount() {
		return nameOfAccount;
	}
	public void setNameOfAccount(String nameOfAccount) {
		this.nameOfAccount = nameOfAccount;
	}
	
	public int getNumberOfAccount() {
		return numberOfAccount;
	}
	
	public double getAccountbalance() {
		return balance;
	}
	
    /* Metodos */
	public double deposit(double value) {
		return balance = balance + value;
	}
	
	public double withdraw(double value) {
		return balance = balance - (value + 5.00) ;
	}
	
	public String toString() {
		return "Account: " + getNumberOfAccount() 
		 + ", Holder: " + getNameOfAccount()
		 + ", Balance: R$" + String.format("%.2f", getAccountbalance());
	}
	
}
