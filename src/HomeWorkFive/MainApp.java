package HomeWorkFive;

public class MainApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ivan", "Front-end", "ivan@gmail.com", 894313001, 100000, 24);
        employees[1] = new Employee("Dany", "Back-end", "dany@gmail.com", 894377771, 170000, 67);
        employees[2] = new Employee("Bob", "Cooker", "bobn@gmail.com", 811113001, 50000, 49);
        employees[3] = new Employee("Victor", "Data-scientist", "victor@gmail.com", 899993001, 70000, 20);
        employees[4] = new Employee("John", "Courier", "john@gmail.com", 895565001, 10000, 18);

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge()>40){
                employees[i].printFullInfo();
            }
        }
    }
}
