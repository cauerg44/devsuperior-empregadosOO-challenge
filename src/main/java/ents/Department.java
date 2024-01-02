package ents;

import java.util.List;

public class Department {

    private String name;
    private int payDay;

    private Adress adress;
    private List<Employee> employees;

    public Department() {
    }

    public Department(String name, int payDay, Adress adress, List<Employee> employees) {
        this.name = name;
        this.payDay = payDay;
        this.adress = adress;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayDay() {
        return payDay;
    }

    public void setPayDay(int payDay) {
        this.payDay = payDay;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public double payroll() {
        double sum = 0.0;
        for (Employee emp : employees) {
            sum+= emp.getSalary();
        }
        return sum;
    }
}
