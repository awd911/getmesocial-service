package repository;

import model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser(){
        User user = new User( "Tom", "River Road", 26, "Example");
        return user;
    }

}
