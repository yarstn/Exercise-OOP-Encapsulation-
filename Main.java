import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // ***CLASS ACCOUNT***
        Account account1 = new Account("1102021455", "yara mohammed", 500);
        Account account2 = new Account("1024868422", "nasser Alhula", 500);
        Scanner input = new Scanner(System.in);
        System.out.println("choose an account number to print its last transactions: \n 1- account1 \n 2- account2 \n 3- account3");
       int no = input.nextInt();
       if (no == 1) {
           System.out.println(account1);
           System.out.println("+++++++++++++++++Add Money to acc1+++++++++++++++++++++++++++");
           account1.credit(150);
           System.out.println(account1);
           System.out.println("++++++++++++++++++Transfer Money from acc1 to acc2++++++++++++++++++++++++++");
           account1.transferTo(account2, 300);
           System.out.println(account1);
       } else if ( no ==2) {
           System.out.println(account2);
           System.out.println("+++++++++++++++++Debit money from acc2 +++++++++++++++++++++++++++");
           account2.debit(220);
           System.out.println(account2);
           System.out.println("+++++++++++++++++Credit money to acc2 +++++++++++++++++++++++++++");
account2.credit(100);
           System.out.println(account2);
           System.out.println("++++++++++++++++++Transfer Money from acc2 to acc3++++++++++++++++++++++++++");
           account2.transferTo(account1, 500);
       } else if (no ==3) {
           Account account3 = new Account("1335485699", "Abdullah Khalid Alhula", 1500);
           System.out.println(account3);
           System.out.println("++++++++++++++++++Transfer Money from acc2 to acc3++++++++++++++++++++++++++");
           account2.transferTo(account3, 150);
           System.out.println(account2);
           System.out.println(account3);
       }

//***CLASS EMPLOYEE***
//                System.out.println("++++++++++++++++++Print annual salary and raised salary for emp1+++++++++++++++++++");
//        Employee emp1 = new Employee("1102021511","yara mohammed",1100);
//        System.out.println(emp1);
//        System.out.println(emp1.getAnnualSalary(1100));
//        emp1.raisedSalary(15);
//        System.out.println("++++++++++++++++++Print annual salary and raised salary for emp2+++++++++++++++++++");
//        Employee emp2 = new Employee("1142425877","Nawaf Alajmi",500);
//        System.out.println(emp2);
//        System.out.println(emp2.getAnnualSalary(1000));
//        emp1.raisedSalary(15);
//        System.out.println("++++++++++++++++++Print annual salary and raised salary for emp3+++++++++++++++++++");
//        Employee emp3 = new Employee("1147878955","najd nasser",950);
//        System.out.println(emp3);
//        System.out.println(emp3.getAnnualSalary(950));
//        emp1.raisedSalary(15);
    }
}