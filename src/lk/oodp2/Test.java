package lk.oodp2;

class patient {
    String name;
    String symtom;

}

class GeneralDoctor{
    Specialist specialist;
}

class Specialist{
    Consultant consultant;
}

class Consultant{

}


public class Test {
    public static void main(String[] args) {

        patient patient = new patient();
        patient.name ="Saman";
        patient.symtom ="Fever";

        GeneralDoctor generalDoctor = new GeneralDoctor();
        Specialist specialist = new Specialist();
        Consultant consultant = new Consultant();

        generalDoctor.specialist = specialist;
        specialist.consultant = consultant;
    }
}
