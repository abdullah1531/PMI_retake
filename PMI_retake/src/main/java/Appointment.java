public class Appointment {
    private String patientName;
    private int  appointment;

    public Appointment(String patientName, int appointment) {
        this.patientName = patientName;
        this.appointment = appointment;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAppointment() {
        return appointment;
    }

    public void setAppointment(int appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "patientName='" + patientName + '\'' +
                ", appointment=" + appointment +
                '}';
    }
}
