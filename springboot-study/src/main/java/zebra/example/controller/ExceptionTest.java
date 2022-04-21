package zebra.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/4/21
 * Time: 14:01
 * Description: No Description
 */
@RestController
public class ExceptionTest {
    @GetMapping("/exception")
    public Object exception(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Zebra");
        map.put(2, "Pig");
        int i = 1/0;
        return map;
    }
}
