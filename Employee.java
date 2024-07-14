public class Employee {
    private String id;
    private String name;
    private int salary;


    public Employee(String id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }
    public int raisedSalary(int percent){
        if(salary >= 1000){
            salary =  salary*percent /100;
            System.out.println("your raised salary is percent "+percent+"% ="+salary);
        }else {
            System.out.println("sorry you are not supported for raised salary " );
        }

        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public int getAnnualSalary(int AnnualSalary){
        System.out.println("your annual salary is: ");
        AnnualSalary = salary*12;
        return AnnualSalary;
    }

    @Override
    public String toString() {
        return "Hello Employee Here is Your Information{" +
                "1- id='" + id + '\'' +
                "2- name='" + name + '\'' +
                "3- salary=" + salary +
                '}';
    }
}
