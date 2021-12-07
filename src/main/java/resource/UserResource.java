package resource;


import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
@RequestMapping("/api")
public class UserResource {


    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User getUser(){
        return userService.getUser();

    }
}
