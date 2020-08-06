package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doctor extends Person {

    private String Department;
    Scanner intinput = new Scanner(System.in);
    Scanner stringinput = new Scanner(System.in);

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void Prescription() {
        int tablets, capsules;
        String[] tablet = new String[10];
        String[] capsule = new String[10];

        System.out.print("Enter Number of Tablets: ");
        tablets = intinput.nextInt();
        for (int i = 0; i < tablets; i++) {
            System.out.print("Enter Tablet " + (i + 1) + ": ");
            tablet[i] = stringinput.nextLine();
        }

        System.out.print("Enter Number of Capsule: ");
        capsules = intinput.nextInt();
        for (int i = 0; i < capsules; i++) {
            System.out.print("Enter Capsule " + (i + 1) + ": ");
            capsule[i] = stringinput.nextLine();
        }

        System.out.println("");
        System.out.println("Drug Prescription");
        System.out.println("Tablets");
        for (int i = 0; i < tablets; i++) {
            System.out.println("" + (i + 1) + " " + tablet[i]);
        }

        System.out.println("Capsules");
        for (int i = 0; i < capsules; i++) {
            System.out.println("" + (i + 1) + " " + capsule[i]);
        }
        System.out.println("");

    }

    public void GiveTestInPatient() {
        int tests;
        String[] test = new String[10];
        System.out.print("Enter Number Off Test:");
        tests = intinput.nextInt();
        for (int i = 0; i < tests; i++) {
            System.out.print("Enter Test " + (i + 1) + ": ");
            test[i] = stringinput.nextLine();
        }

        System.out.println("");
        System.out.println("Your Tests");
        for (int i = 0; i < tests; i++) {
            System.out.println("" + (i + 1) + " " + test[i]);
        }
        System.out.println("");

    }
    
    public ArrayList<Doctor> GetDoctors(){
        List<Doctor> Doctors = new ArrayList();
        Doctor d2= new Doctor();
        d2.setName("Dr. Mamunur Rashid");
        d2.setDepartment("Medicine");
        Doctors.add(d2);
        Doctor d3= new Doctor();
        d3.setName("Dr. Kartik Majumder");
        d3.setDepartment("Cardiology");
        Doctors.add(d3);
        Doctor d4= new Doctor();
        d4.setName("Dr. Selina Hosen");
        d4.setDepartment("Gynaecology");
        Doctors.add(d4);
        return (ArrayList<Doctor>) (Doctors);
    }

}
