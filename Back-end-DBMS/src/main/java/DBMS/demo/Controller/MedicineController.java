package DBMS.demo.Controller;

import DBMS.demo.Repository.MedicineRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/medicine")

public class MedicineController {
    @Autowired
    MedicineRepository medicineRepository;
    @GetMapping("/MedicineList")
    public ResponseEntity<String> MedicineList(){
        List<Object[]> result=medicineRepository.viewMedicineList();
        List<Map<String,Object>> jsonDataList=new ArrayList<>();
        for (Object[] row : result) {
            Map<String, Object> rowData = new LinkedHashMap<>();
            rowData.put("medicineid", row[0]);
            rowData.put("m_name", row[1]);
            rowData.put("m_unit", row[2]);
            rowData.put("contraindication",row[3]);
            rowData.put("quantity",row[4]);
            rowData.put("expiration_date",row[5]);
            rowData.put("cost",row[6]);
            jsonDataList.add(rowData);
        }
        Gson gson = new Gson();
        String jsonData = gson.toJson(jsonDataList);
        return ResponseEntity.ok(jsonData);
    }

    @GetMapping("/MedicineListDetail")
    public ResponseEntity<String> MedicineDetail(@RequestParam("medicineID") int medicineID){
        List<Object[]> result=medicineRepository.viewMedicine(medicineID);
        List<Map<String,Object>> jsonDataList=new ArrayList<>();
        for (Object[] row : result) {
            Map<String, Object> rowData = new LinkedHashMap<>();
            rowData.put("medicineid", row[0]);
            rowData.put("m_name", row[1]);
            rowData.put("m_unit", row[2]);
            rowData.put("contraindication",row[3]);
            rowData.put("quantity",row[4]);
            rowData.put("expiration_date",row[5]);
            rowData.put("cost",row[6]);
            jsonDataList.add(rowData);
        }
        Gson gson = new Gson();
        String jsonData = gson.toJson(jsonDataList);
        return ResponseEntity.ok(jsonData);
    }

}
