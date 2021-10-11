package entities;

public class Student {
	public double n1,n2,n3,end;
	
	public double media() {
		return end = n1 + n2 + n3;		
	}
	 
	public String approved() {
		
		if (end >= 60) {
			return "You pass";
		}else {
			double missing = 60 - end;
			return "You don't pass\n"
					+ "Missing " + String.format("%.2f", missing) + " points";
		}
	}
	
	public String toString() {
		return "Final grade = " 
				+ String.format("%.2f", media())
				+ "\n"
				+ approved();
	}
	
}
