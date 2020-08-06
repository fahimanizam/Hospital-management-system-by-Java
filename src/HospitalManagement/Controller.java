package HospitalManagement;

import Model.Doctor;
import Model.Patient;
import Model.Receptionist;
import View.View;
import java.util.Scanner;

public class Controller {

    int input;
    View view = new View();
    Scanner s1 = new Scanner(System.in);

    public void ControllerFirstView() {
        view.ShowFirsView();
        input = s1.nextInt();
        switch (input) {
            case 1:
                this.ControllerPatientView();

                break;

            case 2:
                this.ControllerReceptionistView();

                break;
            case 3:

                this.ControllerDoctorView();
                break;

            case 4:

                System.out.println("######Sucessfully Exit######");
                break;
            default:
                System.out.println("ERROR");

        }
    }

    public void ControllerPatientView() {
        view.ShowPatientView();
        Patient p1 = new Patient();
        input = s1.nextInt();

        switch (input) {
            case 1:
                p1.InsertPatientInfo();
                this.ControllerPatientView();

                break;

            case 2:
                p1.PayBill();
                this.ControllerPatientView();
                break;
            case 3:

                this.ControllerFirstView();

                break;
        }

    }

    public void ControllerReceptionistView() {

        view.ShowReceptionistView();
        Receptionist r1 = new Receptionist();
        input = s1.nextInt();

        switch (input) {
            case 1:

                r1.GiveAppointment();
                this.ControllerReceptionistView();
                break;

            case 2:
                r1.GenerateBill();
                this.ControllerReceptionistView();

                break;
            case 3:

                this.ControllerFirstView();
                break;
        }

    }

    public void ControllerDoctorView() {

        view.ShowDoctorView();

        Doctor d1 = new Doctor();
        input = s1.nextInt();

        switch (input) {
            case 1:
                d1.Prescription();
                this.ControllerDoctorView();
                break;

            case 2:

                d1.GiveTestInPatient();
                this.ControllerDoctorView();
                break;
            case 3:

                this.ControllerFirstView();

                break;
        }

    }

}
