package net.toeye.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * Created by song on 2017-03-08.
 */

@RestController
public class SongController {

    @RequestMapping("/api/")
    public User Hello(){
        User user = new User();
        user.user = "song";
        user.sex = "man";
        return user;
    }

    class  User{
        public String user;
        public String sex;
    }


}
