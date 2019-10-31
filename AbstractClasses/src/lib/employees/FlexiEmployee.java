package lib.employees;


public class FlexiEmployee extends Employee {
	
	private int flexiHours;

	
	public FlexiEmployee() {
		super();
		flexiHours = 0;
	}
	
	public FlexiEmployee(int flexiHours, Name name, Date dob, Gender gender, double hourlyRate, int hoursWorked, Date paymentDate) {
		super(name, dob, gender, hourlyRate, hoursWorked, paymentDate);
		this.flexiHours = flexiHours;
	}
	
	
	@Override
	public double calculatePay() {
		return (super.getHoursWorked() + flexiHours) * super.getHourlyRate();
	}
	
	public void setFlexiHours(int flexiHours) {
		this.flexiHours = flexiHours;
	}
	
	public int getFlexiHours() {
		return flexiHours;
	}
	
	@Override
	public String toString() {
        return super.toString() + "[flexiHours=" + flexiHours + "]";
    }
	
}
