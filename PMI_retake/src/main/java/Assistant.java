
public class Assistant extends Dentist {
    public void refreshAppointment (String patientName, int appointment){
        if(super.existAppointment(patientName)){
            int index = super.getIndexOfAppointment(patientName);
            getAppointmentArrayList().get(index).setAppointment(appointment);
        }
    }
}
