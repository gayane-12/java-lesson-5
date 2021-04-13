package model;

public class ChiefDoctor extends Doctor {
    private int experience;

    public ChiefDoctor(String name, String surname, String phone, int salary, Client[] clients, int experience) {
        super(name, surname, phone, salary, clients);
        this.experience = experience;
        System.out.print("CHIEF DOCTOR");
        System.out.println();
    }

     int getExperience() {
        return experience;
    }

     void setExperience(int experience) {
        this.experience = experience;
    }
}
