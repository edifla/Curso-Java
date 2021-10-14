package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	
	private Date dueDate;
	private Double amount;
	
	public Installment() {
		
	}

	public Installment( Date dueDate, Double amount) {
		this.amount = amount;
		this.dueDate = dueDate;
	}

	
	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getdueDate() {
		return dueDate;
	}

	public void setdueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	@Override
	public String toString() {
		return sdf.format(dueDate) + " - " + String.format("%.2f", amount);
	}
}
