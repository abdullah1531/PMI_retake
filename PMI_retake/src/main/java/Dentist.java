import java.util.ArrayList;

public class Dentist {
    private ArrayList<Appointment> appointmentArrayList;

    public Dentist() {
        this.appointmentArrayList = new ArrayList<>();
    }

    public int getAppointmentsSize() {
        return appointmentArrayList.size();
    }

    public void newAppointment(String patientName, int appointment){
        if(!existAppointment(patientName)){
            appointmentArrayList.add(new Appointment(patientName, appointment));
        }
    }

    public void resign(String patientName){
        if(existAppointment(patientName)) {
            int index = getIndexOfAppointment(patientName);
            appointmentArrayList.remove(index);
        }
    }

    public ArrayList<Appointment> getAppointmentArrayList() {
        return appointmentArrayList;
    }

    public void getAppointments(){
        for(Appointment a: appointmentArrayList){
            System.out.println(a);
        }
    }


    public boolean existAppointment(String name){
        for (Appointment a : appointmentArrayList){
            if(a.getPatientName().equals(name)){
                return true;
            }
        }
        return false;
    }

    public int getIndexOfAppointment(String name){
        for (int i = 0; i<appointmentArrayList.size(); i++){
            if(appointmentArrayList.get(i).getPatientName().equals(name)){
                return i;
            }
        }
        return -1;
    }

}
