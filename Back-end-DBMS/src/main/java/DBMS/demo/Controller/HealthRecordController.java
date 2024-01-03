package DBMS.demo.Controller;

import DBMS.demo.Model.HealthRecord;
import DBMS.demo.Model.HealthRecordDTO;
import DBMS.demo.Repository.HealthRecordRepository;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/health-record")
@AllArgsConstructor
public class HealthRecordController {
    private HealthRecordRepository healthRecordRepository;
    @PostMapping("")
    public ResponseEntity<Integer> insertHR(@RequestBody HealthRecordDTO healthRecordDTO){
        int patientid =healthRecordDTO.getPatientid();
        int dentistid =healthRecordDTO.getDentistid();
        Date date =healthRecordDTO.getDate();
        int service =healthRecordDTO.getService();
        String medicine_array =healthRecordDTO.getMedicine_array();
        String quanlity_array=healthRecordDTO.getQuanlity_array();

        int result=healthRecordRepository.insertHealthRecord(patientid,dentistid,date,service,medicine_array,quanlity_array);
       return ResponseEntity.ok(result );
    }
    @GetMapping("list-health-record")
    public ResponseEntity<String> listHealthRecord(){
        List<Object[]> result=healthRecordRepository.insertHealthRecord();
        List<Map<String,Object>> jsonDataList=new ArrayList<>();
        for (Object[] row : result) {
            Map<String, Object> rowData = new LinkedHashMap<>();
            rowData.put("hr_id", row[0]);
            rowData.put("patientid", row[1]);
            rowData.put("date",row[2]);
            rowData.put("dentistid",row[3]);
            rowData.put("serviceid",row[4]);
            jsonDataList.add(rowData);
        }
        Gson gson = new Gson();
        String jsonData = gson.toJson(jsonDataList);
        return ResponseEntity.ok(jsonData);

    }
}
