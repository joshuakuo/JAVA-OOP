package oop;

public class LoanAccount implements IRate{

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		System.out.println("Set rate in LoanAccount");
		
	}

	@Override
	public void increaseRate() {
		// TODO Auto-generated method stub
		System.out.println("Increase rate in LoanAccount");
		
	}
	
	public void setTerm(int term) {
		System.out.println("Set the term " +term+ " yaers");
	}
	
	public void setAmortSchedule() {
		System.out.println("Amortization schedule");
	}

}
