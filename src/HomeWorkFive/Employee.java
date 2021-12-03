package HomeWorkFive;

public class Employee {
    private String name;
    private String position;
    private String email;

    private int salary;
    private int phone;
    private int age;

    public Employee(String FIO, String position, String email, int phone, int salary, int age){
        this.name = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printFullInfo(){
        System.out.println("FIO" + name + "position" + position + "email" + email + "salary" + salary + "age" + age);
    }

    int getAge(){
        return age;
    }
}
