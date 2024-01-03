package DBMS.demo.Repository;

import DBMS.demo.Model.Appointment;
import DBMS.demo.Model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

public interface MedicineRepository  extends JpaRepository<Medicine, Integer> {
    @Query(value = "EXEC VIEW_MEDICINE_LIST", nativeQuery = true)
    List<Object[]> viewMedicineList();
    @Query(value="EXEC VIEW_MEDICINE_DETAIL @medicineID=:medicineID ",nativeQuery = true)
    List<Object[]> viewMedicine(int medicineID);
}
