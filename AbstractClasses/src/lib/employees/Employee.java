package lib.employees;


public abstract class Employee extends Person {

	private double hourlyRate;
	private int hoursWorked;
	private Date paymentDate;
	
	
	public Employee() {
		super();
		hourlyRate = 0;
		hoursWorked = 0;
		paymentDate = new Date();
	}
	
	public Employee(Name name, Date dob, Gender gender, double hourlyRate, int hoursWorked, Date paymentDate) {
		super(name, dob, gender);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.paymentDate = paymentDate;
	}


	public abstract double calculatePay();
	
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}
	
	public Date getPaymentDate() {
		return paymentDate;
	}

	@Override
	public String toString() {
        return super.toString() + "[hourlyRate=" + hourlyRate 
                + ", hoursWorked=" + hoursWorked
                + ", paymentDate=" + paymentDate + "]";
    }
	
}
