public class Employee {
    private String fullName;
    private int department;
    private int wage;
    private int numberId;

    public Employee (String fullName, int department, int wage) {
        this.fullName=fullName;
        this.department=department;
        this.wage=wage;
        numberId = new Counted().getId();
    }
    public int getNumberId() {
        return this.numberId;
    }
    public String getFullName() {
        return this.fullName;
    }
    public int getDepartment() {
        return this.department;
    }
    public int getWage() {
        return  this.wage;
    }
}
