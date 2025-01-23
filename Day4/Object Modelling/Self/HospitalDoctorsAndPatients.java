import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void attendConsultation(Doctor doctor) {
        System.out.println("Patient " + this.name + " is attending a consultation with Dr. " + doctor.getName());
    }
}

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void consult(Patient patient) {
        // This method simulates the communication (consultation) between doctor and patient
        System.out.println("Dr. " + this.name + " is consulting with Patient " + patient.getName() + ".");
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public void conductConsultation(Doctor doctor, Patient patient) {
        // Communication between doctor and patient (consultation)
        doctor.consult(patient);
        patient.attendConsultation(doctor);
    }
}

public class HospitalDoctorsAndPatients {
    public static void main(String[] args) {
        // Create patients
        Patient patient1 = new Patient("Tony Stark");
        Patient patient2 = new Patient("Steve Rogers");

        // Create doctors
        Doctor doctor1 = new Doctor("Dr. Strange");
        Doctor doctor2 = new Doctor("Dr. Bruce");

        // Create hospital
        Hospital hospital = new Hospital("Niniature Hospital");

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Associate doctors and patients
        patient1.addDoctor(doctor1);
        patient1.addDoctor(doctor2);
        patient2.addDoctor(doctor1);

        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient1);

        // Conduct consultations (communication between doctor and patient)
        hospital.conductConsultation(doctor1, patient1);
        hospital.conductConsultation(doctor2, patient1);
        hospital.conductConsultation(doctor1, patient2);
    }
}
