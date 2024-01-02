package DBMS.demo.Controller;

import DBMS.demo.Model.Userinfo;
import DBMS.demo.Repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    private ResponseEntity<List<Object[]>> view(){
        List<Object[]> result=userRepository.view();
        return ResponseEntity.ok(result);
    }
}
