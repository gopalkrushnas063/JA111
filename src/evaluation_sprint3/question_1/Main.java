package evaluation_sprint3.question_1;

public class Main {

}
abstract class Employee{
    int employeeId;
    String employeeName;
    double salary;

    public Employee(int employeeId, String employeeName, double basicPay) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }


    public Employee(Employee employeeObj) {
    }

    abstract double calculateSalary();
}


class PermanentEmployee extends Employee{
    private double basicPay;

    public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
        super(employeeId, employeeName, basicPay);
    }

    int PF = (int) (basicPay * 0.12);
    double calculateSalary() {
        return basicPay-PF;
    }

}

class TemporaryEmployee extends Employee{
    private int hoursWorked;
    private int hourlyWages;

    public TemporaryEmployee(int employeeId, String employeeName, double basicPay, int hoursWorked, int hourlyWages) {
        super(employeeId, employeeName, basicPay);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
    }

    int salary = hourlyWages * hoursWorked;
    @Override
    double calculateSalary() {
        return salary;
    }
}

class Loan{
    public double calculateLoanAmount(Employee employeeObj){
        Employee employee = new Employee(employeeObj) {
            @Override
            double calculateSalary() {
                return 0;
            }
        };


        return 0;
    }
}