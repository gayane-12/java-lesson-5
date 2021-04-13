package model;

public class Department {
    private String name;
    private ChiefDoctor chiefDoctor;
    private Doctor[] doctors;


    public Department(String name, ChiefDoctor chiefDoctor, Doctor[] doctors) {
        this.name = name;
        this.chiefDoctor = chiefDoctor;
        this.doctors = doctors;
    }

     String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

     Doctor getChiefDoctor() {
        return chiefDoctor;
    }

     void setChiefDoctor(ChiefDoctor chiefDoctor) {
        this.chiefDoctor = chiefDoctor;
    }

     Doctor[] getDoctors() {
        return doctors;
    }

     Doctor getHighestPaidDoctor(){
        Doctor highestPaid = this.doctors[0];
        for (int i = 1; i <this.doctors.length ; i++) {
            if(highestPaid.getSalary()<this.doctors[i].getSalary()){
                highestPaid = this.doctors[i];
            }
        }
        return highestPaid.getSalary()>chiefDoctor.getSalary()?highestPaid:chiefDoctor;
    }


}
