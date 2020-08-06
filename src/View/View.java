package View;

public class View {

    public void ShowFirsView() {
        System.out.println("1. As Patient");
        System.out.println("2. As Receptionist ");
        System.out.println("3. As Doctor");
        System.out.println("4. Exit ");
    }

    public void ShowPatientView() {
        System.out.println("1. Insert info ");
        System.out.println("2. Pay bill ");
        System.out.println("3. Return ");
    }

    public void ShowReceptionistView() {
        System.out.println("1. Give Appointment ");
        System.out.println("2. Generate Bill ");
        System.out.println("3. Return ");
    }

    public void ShowDoctorView() {
        System.out.println("1. Give Drugs Prescription");
        System.out.println("2. Give Test");
        System.out.println("3. Return ");
    }
}
