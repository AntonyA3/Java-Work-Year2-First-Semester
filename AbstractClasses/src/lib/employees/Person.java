package lib.employees;


public abstract class Person {
    
    private Name name;
    private Date dob;
    private Gender gender;
    
    
    public Person() {
        name = new Name();
        dob = new Date();
        gender = Gender.FEMALE;
    }
    
    public Person(Name name, Date dob, Gender gender) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }
 
    
    public void setName(Name name) {
        this.name = name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Name getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public Gender getGender() {
        return gender;
    }
    
    @Override
    public String toString() {
        return this.getClass().getName() + ":[name=" + name 
                + ", dob=" + dob
                + ", gender=" + gender + "]";
    }
    
}
