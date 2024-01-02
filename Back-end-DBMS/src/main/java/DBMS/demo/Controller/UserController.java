package DBMS.demo.Controller;

import DBMS.demo.Model.Userinfo;
import DBMS.demo.Repository.UserRepository;
import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    UserRepository userRepository;
    UserController(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @GetMapping("/listuser")
    private ResponseEntity<List<Userinfo>> listUser(){
        List<Userinfo> result= userRepository.findAll();
        return ResponseEntity.ok(result);
    }
    @PostMapping("/addAccount")
    private ResponseEntity<Integer> addAccount(@RequestParam(name = "name")String NAME,
                                              @RequestParam(name = "password")String PASSWORD,
                                              @RequestParam(name = "phone")String PHONE){
        int result= userRepository.insertAccount(NAME, PASSWORD, PHONE);
        return ResponseEntity.ok(result );
    }
    @GetMapping("view")
    private ResponseEntity<String> view(){
        List<Object[]> result=userRepository.view();
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
    @GetMapping("viewDetail")
    private ResponseEntity<String> viewDetailUser(@RequestParam("phone")String phone){
        List<Object[]> result=userRepository.viewDetail(phone);
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
}
