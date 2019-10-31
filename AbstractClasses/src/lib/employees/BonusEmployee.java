package lib.employees;


public class BonusEmployee extends Employee {

	private double bonusAmount;

	
	public BonusEmployee() {
		super();
		bonusAmount = 0;
	}
	
	public BonusEmployee(double bonusAmount, Name name, Date dob, Gender gender, double hourlyRate, int hoursWorked, Date paymentDate) {
		super(name, dob, gender, hourlyRate, hoursWorked, paymentDate);
		this.bonusAmount = bonusAmount;
	}
	
	
	@Override
	public double calculatePay() {
		return (super.getHoursWorked() * super.getHourlyRate()) + bonusAmount;
	}
	
	public void setBonusAmount(double bonusAmount) {
		this.bonusAmount = bonusAmount;
	}
	
	public double getBonusAmount() {
		return bonusAmount;
	}
	
	@Override
	public String toString() {
        return super.toString() + "[bonusAmount=" + bonusAmount + "]";
    }
	
}
