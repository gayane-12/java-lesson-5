package main;

import model.*;

import javax.print.Doc;
import java.util.Scanner;

public class Init {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        dynamic creation of hospital
        System.out.println("To create new hospital, just write the name of hospital and press enter");
        String hospitalName = scan.nextLine();
        Hospital newHospital = new Hospital(hospitalName);

//        changing name of hospital
//        System.out.println("To change the name of hospital just write the new name and press enter");
//        String newHospitalName = scan.nextLine();
//        newHospital.setName(newHospitalName);

//        creating one client just for example
//        System.out.println("Create a client with heart decease!");
//        System.out.println("Enter client name:");
//        String clientName = scan.nextLine();
//        System.out.println("Enter client surname:");
//        String clientSurname = scan.nextLine();
//        System.out.println("Enter client phone:");
//        String clientPhone = scan.nextLine();
//        System.out.println("Enter client address:");
//        String clientAddress = scan.nextLine();
//        System.out.println("Enter a diagnosis:");
//        String clientDiagnosis = scan.nextLine();
//        Client newClient = new Client(clientName, clientSurname, clientPhone, clientAddress, clientDiagnosis );


//        creating clients
        System.out.println();
        Client[] clientOfCardiologyOfDoctorOne = {new Client("Ani", "Sargsyan", "123435456","Manandyan 30", "Arrhythmia"),};
        Client[] clientOfCardiologyOfDoctorTwo = {new Client("Varsenik", "Davtyan", "123435456","Melqonyan 30", "Death"),};
        Client[] clientOfSurgery = {new Client("Lusine", "Kirakosyan", "2133225456","Qochar 20", "Death"), new Client("Vahan", "Muradyan", "2133464562", "Mashtots 56", "Nose rhynoplasty")};

//        creating doctors
        System.out.println();
        Doctor[] doctorsOfCardiology = {new Doctor("Vardan","Sargsyan","041234567",300000, clientOfCardiologyOfDoctorOne),
                new Doctor("Anna","Danielyan","055345677",200000,clientOfCardiologyOfDoctorTwo)};
        Doctor[] doctorsOfSurgery = {new Doctor("Sahak","Davtyan","3545656768",350000, clientOfSurgery)};

//        creating chiefDoctors
        System.out.println();
        ChiefDoctor chiefOfCardiology = new ChiefDoctor("Gagik", "Sahakyan", "023456789",
                500000, new Client[]{new Client("Vagr", "Vagrik", "233334444444")}, 10);
        ChiefDoctor chiefOfSurgery = new ChiefDoctor("Anahit", "Sirunyan", "0829456242", 60000,
                new Client[]{new Client("Vaspur", "Gulyanc", "224344")}, 15);

//        creating departments of hospital
        Department[] departments = {new Department("Cardiology", chiefOfCardiology, doctorsOfCardiology),
                new Department("Surgery", chiefOfSurgery, doctorsOfSurgery)};

//        adding departments to hospital
        System.out.println();
        newHospital.setDepartments(departments);

//        print all departments
        System.out.println();
        newHospital.printDepartments();

//        print highest paid doctors
        System.out.println();
        newHospital.printTheHighestPaidDoctorOfEachDepartment();




    }
}
