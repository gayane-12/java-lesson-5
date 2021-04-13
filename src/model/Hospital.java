package model;

public class Hospital {
    private String name;
    private Department[] departments;


    public Hospital(String name) {
        this.name = name;
        System.out.println("Hospital " + name + " was created! Now some data will be generated.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Hospital name was changed successfully to " + name +"!");
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
        System.out.println("Some departments were generated.");
    }

    private int getCountOfDepartments(){
        return this.departments.length;
    }

    public void printDepartments(){
        System.out.println("Here are all departments, with total count of " + this.getCountOfDepartments());
        for (Department department:
        departments) {
            System.out.println("- " + department.getName());
        }
    }

    public void printTheHighestPaidDoctorOfEachDepartment(){
        System.out.println("The highest paid doctors of each department:");
        for (int i = 0; i < this.departments.length; i++) {
            System.out.println("--" + this.departments[i].getName());
            System.out.println(this.departments[i].getHighestPaidDoctor().getName() + " "
                    + this.departments[i].getHighestPaidDoctor().getSurname() + ":" + this.departments[i].getHighestPaidDoctor().getSalary() + "AMD");
        }
    }







}
