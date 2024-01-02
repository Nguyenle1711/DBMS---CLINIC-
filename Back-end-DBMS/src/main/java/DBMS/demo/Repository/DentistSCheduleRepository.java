package DBMS.demo.Repository;

import DBMS.demo.Model.DentistSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

public interface DentistSCheduleRepository extends JpaRepository<DentistSchedule,Long> {
    @Query(value = "EXEC DENTIST_FREE @date:=date, @time=:time",nativeQuery = true)
    List<Object[]> dentistfree(Date date, Time time);
}
