package DBMS.demo.Controller;

import DBMS.demo.Repository.AppointmentRepository;
import DBMS.demo.Repository.DentistSCheduleRepository;
import com.google.gson.Gson;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/appointment")
public class AppointmentController {
    AppointmentRepository appointmentRepository;
    DentistSCheduleRepository  dentistSCheduleRepository;
    AppointmentController(AppointmentRepository appointmentRepository,DentistSCheduleRepository dentistSCheduleRepository){
        this.appointmentRepository=appointmentRepository;
        this.dentistSCheduleRepository=dentistSCheduleRepository;
    }

    @GetMapping("/dentistFree")
    public ResponseEntity<String> dentistFree(@RequestParam("date") Date date,
                                              @RequestParam("time") Time time){
        List<Object[]> result=dentistSCheduleRepository.dentistfree(date, time);
        List<Map<String,Object>> jsonDataList=new ArrayList<>();
        for (Object[] row : result) {
            Map<String, Object> rowData = new LinkedHashMap<>();
            rowData.put("user_id", row[0]);
            rowData.put("phone", row[1]);
            rowData.put("password",row[2]);
            rowData.put("email",row[3]);
            rowData.put("name",row[4]);
            rowData.put("dob",row[5]);
            rowData.put("role",row[6]);
            jsonDataList.add(rowData);
        }
        Gson gson = new Gson();
        String jsonData = gson.toJson(jsonDataList);
        return ResponseEntity.ok(jsonData);

    }
    @PostMapping("/addAppointment")
    public ResponseEntity<Integer> addAppointment(@RequestParam("patient_id") int patient_id,
                                                  @RequestParam("dentist_id") int dentist_id,
                                                  @RequestParam("date") Date date,
                                                  @RequestParam("time") Time time){
        int result= appointmentRepository.insertAppointment(patient_id,dentist_id,date,time);
        return ResponseEntity.ok(result);

    }

}
