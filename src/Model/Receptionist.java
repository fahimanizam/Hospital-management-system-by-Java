package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Receptionist extends Person implements Billing{

    Scanner intinput = new Scanner(System.in);
    Scanner stringinput = new Scanner(System.in);
    int input;

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public int getAge() {
        return Age;
    }

    @Override
    public void setAge(int Age) {
        this.Age = Age;
    }

    @Override
    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void GiveAppointment() {
        String Date;
        String CheckUpTime;
        String PatientId;
        Doctor d5 = new Doctor();
        List<Doctor> Doctors = new ArrayList();
        Doctors = d5.GetDoctors();
        System.out.println("Select doctor name from below:");

        for (int i = 0; i < Doctors.size(); i++) {
            System.out.println(i + 1 + " " + Doctors.get(i).getName() + " (" + Doctors.get(i).getDepartment() + ")");
        }
        input = intinput.nextInt();
        System.out.print("Enter Date: ");
        Date = stringinput.nextLine();
        System.out.print("Enter check up time: ");
        CheckUpTime = stringinput.nextLine();
        System.out.print("Enter patient ID: ");
        PatientId = stringinput.nextLine();

        System.out.println("");
        System.out.println("\t:::::Your Appoinment:::::");
        System.out.println("");
        System.out.println("\tPatient ID: " + PatientId);
        System.out.println("\tDoctor Name: " + Doctors.get(input - 1).getName() + " (" + Doctors.get(input - 1).getDepartment() + ")");
        System.out.println("\tDate: " + Date);
        System.out.println("\tTime: " + CheckUpTime);
        System.out.println("");
        System.out.println("");

    }

    @Override
    public void GenerateBill() {
        int noOfXray;
        int noOfEcg;
        int doctorBill=1000;
        int ecgBill=1000;
        int xrayBill=500;
        int otherBill=450;
        int totallBill;
        Doctor d6 = new Doctor();
        List<Doctor> Doctors = new ArrayList();
        Doctors = d6.GetDoctors();
        System.out.println("Select which doctor was appointed:");

        for (int i = 0; i < Doctors.size(); i++) {
            System.out.println(i + 1 + " " + Doctors.get(i).getName() + " (" + Doctors.get(i).getDepartment() + ")");
        }
        input = intinput.nextInt();
        System.out.print("Enter Number of X-rays:");
        noOfXray=intinput.nextInt();
        System.out.print("Enter number of ECGs:");
        noOfEcg= intinput.nextInt();
        totallBill= doctorBill +(noOfXray*xrayBill)+(noOfEcg*ecgBill)+ otherBill;
        
        System.out.println("");
        System.out.println("\t::::::Bill Generation Complete::::::");
        System.out.println("\tDoctor’s Bill: ");
        System.out.println("\t" +Doctors.get(input - 1).getName() + " (" + Doctors.get(input - 1).getDepartment() + ") ="+doctorBill+"TK");
        System.out.println("\tTest Bill:");
        System.out.println("\tX-Rays => ("+noOfXray+"*"+xrayBill+") \t\t ="+noOfXray*xrayBill);
        System.out.println("\tECGs => ("+noOfEcg+"*"+ecgBill+")\t\t ="+noOfEcg*ecgBill+"Tk");
        System.out.println("\tOther Bill: \t\t\t ="+otherBill+"Tk");
        System.out.println("\t----------------------------------------");
        System.out.println("\t\t\tTotal Bill: \t ="+totallBill+"Tk");
        System.out.println("");
        System.out.println("");
        
    }

   

}
