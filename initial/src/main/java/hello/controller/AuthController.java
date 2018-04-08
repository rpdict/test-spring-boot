package hello.controller;

import hello.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author zhaoruipeng
 * @ClassName AuthController
 * @Package hello.controller
 * @date 2018/4/3 15:57
 */
@RestController    // This means that this class is a Controller
public class AuthController {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login(@RequestParam(value = "userName", required = true) String userName, @RequestParam(value = "password", required = true) String password) {
        User user = new User(userName, password);
        System.out.println(userName);
        System.out.println(password);
        System.out.println(user.getPassword());
        HashMap<String, String> response = new HashMap<>();
        response.put("results", "success");
        return response;
    }
}
