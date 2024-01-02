package app;

import ents.Adress;
import ents.Department;
import ents.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        System.out.print("Dia do pagamento: ");
        int diaDoPagamento = sc.nextInt();
        System.out.print("Email: ");
        sc.nextLine();
        String email = sc.nextLine();
        System.out.print("Telefone: ");
        String telefone = sc.nextLine();
        Adress adress = new Adress(email,telefone);
        System.out.print("Quantos funcionários tem o departamento? ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Employee> employees = new ArrayList<>();
        for (int i=0; i<n; i++) {
            System.out.println("Dados do funcionário " +(i+1)+": ");
            System.out.print("Nome: ");
            String nomeFuncionario = sc.nextLine();
            System.out.print("Salário: ");
            double salarioFuncionario = sc.nextDouble();
            sc.nextLine();
            Employee employee = new Employee(nomeFuncionario, salarioFuncionario);
            employees.add(employee);
        }
        System.out.println();
        Department department = new Department(nomeDepartamento, diaDoPagamento, adress, employees);
        showReport(department);
        sc.close();
    }

    private static void showReport(Department dept) {
        System.out.println("FOLHA DE PAGAMENTO");
        double totalPayroll = dept.payroll();

        System.out.println("Departamento " + dept.getName() + " = R$ " + totalPayroll);
        System.out.println("Pagamento realizado no dia " + dept.getPayDay());
        System.out.println("Funcionários:");
        for (Employee employee : dept.getEmployees()) {
            System.out.println(employee.getName());
        }
        System.out.println("Para dúvidas favor entrar em contato: " + dept.getAdress().getEmail());
    }
}