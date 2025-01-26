interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}


abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Concrete method to get patient details
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    // Abstract method to calculate the bill
    public abstract double calculateBill();

    // Getters and Setters for encapsulation
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
// InPatient implements MedicalRecord
class InPatient extends Patient implements MedicalRecord {
    private int daysOfStay;
    private double dailyRoomCharge;
    private String medicalHistory = "";

    public InPatient(String patientId, String name, int age, int daysOfStay, double dailyRoomCharge) {
        super(patientId, name, age);
        this.daysOfStay = daysOfStay;
        this.dailyRoomCharge = dailyRoomCharge;
    }

    @Override
    public double calculateBill() {
        // Inpatient bill calculation
        return daysOfStay * dailyRoomCharge;
    }

    @Override
    public void addRecord(String record) {
        this.medicalHistory += record + "\n";
    }

    @Override
    public String viewRecords() {
        return "Medical History: \n" + medicalHistory;
    }

    // Getters and Setters for encapsulation
    public int getDaysOfStay() {
        return daysOfStay;
    }

    public void setDaysOfStay(int daysOfStay) {
        this.daysOfStay = daysOfStay;
    }

    public double getDailyRoomCharge() {
        return dailyRoomCharge;
    }

    public void setDailyRoomCharge(double dailyRoomCharge) {
        this.dailyRoomCharge = dailyRoomCharge;
    }
}

// OutPatient implements MedicalRecord
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private double testCharges;
    private String medicalHistory = "";

    public OutPatient(String patientId, String name, int age, double consultationFee, double testCharges) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.testCharges = testCharges;
    }

    @Override
    public double calculateBill() {
        // Outpatient bill calculation
        return consultationFee + testCharges;
    }

    @Override
    public void addRecord(String record) {
        this.medicalHistory += record + "\n";
    }

    @Override
    public String viewRecords() {
        return "Medical History: \n" + medicalHistory;
    }

    // Getters and Setters for encapsulation
    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public double getTestCharges() {
        return testCharges;
    }

    public void setTestCharges(double testCharges) {
        this.testCharges = testCharges;
    }
}

public class HospitalPatientManagement {

    // Method to process patient and display billing information
    public static void processPatient(Patient patient) {
        System.out.println(patient.getPatientDetails());
        System.out.println("Total Bill: " + patient.calculateBill());

        // If the patient has medical records, display them
        if (patient instanceof MedicalRecord) {
            MedicalRecord record = (MedicalRecord) patient;
            System.out.println(record.viewRecords());
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Create patient objects
        InPatient inPatient = new InPatient("IP001", "John Doe", 30, 5, 200.00);
        OutPatient outPatient = new OutPatient("OP001", "Jane Smith", 40, 150.00, 50.00);

        // Add medical records
        inPatient.addRecord("Admitted for surgery on 10th Jan.");
        outPatient.addRecord("Consultation for cold and flu.");

        // Process patients
        processPatient(inPatient);
        processPatient(outPatient);
    }
}

