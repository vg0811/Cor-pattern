package lk.oodp2;

class Patient {
    String name;
    String symtom;

}

class GeneralDoctor {
    Specialist specialist;

    public void handle(Patient patient) {

        if (patient.symtom.equalsIgnoreCase("fever"))
            System.out.println("General Doctor Treating...");
        else {
            specialist.handle(patient);
        }
    }
}

class Specialist{
    Consultant consultant;
    public void handle(Patient patient){
        if(patient.symtom.equalsIgnoreCase("Chest-pain"))
            System.out.println("Specialist Doctor Treating...");
        else{
            consultant.handle(patient);
        }
    }
}

class Consultant{
    public void handle(Patient patient){
        if(patient.symtom.equalsIgnoreCase("Heart-Problem"))
            System.out.println("Consultant Treating...");
        else{
            System.out.println("...");        }
    }
}


public class Test {
    public static void main(String[] args) {

        Patient patient = new Patient();
        patient.name ="Saman";
        patient.symtom ="Fever";

        GeneralDoctor generalDoctor = new GeneralDoctor();
        Specialist specialist = new Specialist();
        Consultant consultant = new Consultant();

        generalDoctor.specialist = specialist;
        specialist.consultant = consultant;
    }
}
