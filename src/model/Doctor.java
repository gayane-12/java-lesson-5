package model;

public class Doctor extends Person {
    private int salary;
    private Client[] clients;


    public Doctor(String name, String surname, String phone, int salary, Client[] clients) {
        super(name, surname, phone);
        this.salary = salary;
        this.clients = clients;
        System.out.println("Doctor " + name + " " + surname + " with " + salary + " salary was created! Phone: " + phone + ".");
    }


     int getSalary() {
        return salary;
    }

     void setSalary(int salary) {
        this.salary = salary;
    }

     Client[] getClients() {
        return clients;
    }

}
