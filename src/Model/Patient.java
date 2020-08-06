
package Model;

import java.util.Scanner;


public class Patient extends Person{
    private String Disease;
    public static float PatientBill=1050;
    Scanner intscan = new Scanner(System.in);
    Scanner stringscan = new Scanner(System.in);

    public String getDisease() {
        return Disease;
    }

    public void setDisease(String Disease) {
        this.Disease = Disease;
    }

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

    @Override
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
    
    public void InsertPatientInfo(){
        Patient p2 = new Patient();
        System.out.print("Enter name: ");
        p2.setName(stringscan.nextLine());
        System.out.print("Enter Age: ");
        p2.Age = intscan.nextInt();
        System.out.print("Enter Disease: ");
        p2.Disease= stringscan.nextLine();
        p2.PrintPatientInformation(p2);
        
        
    }
    public void PrintPatientInformation(Patient p){
        System.out.println("");
        System.out.println("\tPatient Name: "+p.getName());
        System.out.println("\tPatient Age: "+p.getAge());
        System.out.println("\tPatient Disease: "+p.getDisease());
        System.out.println("");
    }
    
    public void PayBill(){
        
        System.out.println("\tYour bill is: "+PatientBill);
        
    }
    
    
}
