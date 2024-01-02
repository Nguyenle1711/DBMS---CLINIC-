package DBMS.demo.Repository;

import DBMS.demo.Model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.sql.Time;
import java.util.List;


public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
    @Query(value = "EXEC INSERT_APPOINTMENT @patientid=:patient_id,@dentistid=:dentist_id,@date=:date,@time=:time", nativeQuery = true)
    int insertAppointment(int patient_id, int dentist_id, Date date, Time time);
    @Query(value="EXEC VIEW_APPOINTMENT_DETAIL @appointmentid=:appointmentid ",nativeQuery = true)
    List<Object[]> viewappointment(int appointmentid);
}