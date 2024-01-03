package DBMS.demo.Repository;

import DBMS.demo.Model.HealthRecord;
import DBMS.demo.Model.HealthRecordDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.List;

public interface HealthRecordRepository extends JpaRepository<HealthRecord,Long> {
    @Query(value = "EXEC INSERT_HEALTH_RECORD @patientid=:patientid,@dentistid=:dentistid,@date=:date,@service=:service," +
            "@medicine_array=:medicine_array,@quanlity_array=:quanlity_array",nativeQuery = true)
    int insertHealthRecord(int patientid , int dentistid,
                                      Date date, int service,String medicine_array, String quanlity_array);

    @Query(value="EXEC VIEW_HEALTH_RECORD",nativeQuery = true)
    List<Object[]> insertHealthRecord();
}
