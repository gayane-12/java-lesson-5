package model;

public class Client extends Person {
    private String address;
    private String diagnosis;

    public Client(String name, String surname, String phone, String address, String diagnosis) {
        super(name, surname, phone);
        this.address = address;
        this.diagnosis = diagnosis;
        System.out.println("Client " + name + " " + surname + " was created.");
    }
    public Client(String name, String surname, String phone) {
        super(name, surname, phone);
    }

     String getAddress() {
        return address;
    }

     void setAddress(String address) {
        this.address = address;
    }

     String getDiagnose() {
        return diagnosis;
    }

     void setDiagnose(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
