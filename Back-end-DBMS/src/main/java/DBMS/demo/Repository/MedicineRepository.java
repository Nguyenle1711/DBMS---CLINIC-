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

    @Query(value="EXEC EDIT_MEDICINE @medicineID=:medicineID ,@name=:name , " +
            "@unit=:unit , @contraindication=:contraindication , " +
            "@quantity=:quantity , @expiration=:expiration , @cost=:cost ",nativeQuery = true)
    Integer editMedicine(int medicineID, String name, String unit, String contraindication, int quantity, Date expiration,int cost);

    @Query(value ="EXEC DELETE_MEDICINE @medicine_id=:medicineid",nativeQuery = true )
    String deleteMedicinee(int medicineid);
}
