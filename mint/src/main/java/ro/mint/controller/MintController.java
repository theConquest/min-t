package ro.mint.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.mint.model.User;
import ro.mint.service.MintServiceImpl;

import javax.annotation.Resource;
import java.security.Principal;

@RestController
@RequestMapping("/mint")
public class MintController {

    @Resource
    MintServiceImpl service;

    @PostMapping
    @RequestMapping("/testReq")
    String testReq(Principal principal) {
        User u = new User();
        u.setLastName("Florescu");
        u.setFirstName("Mircea");
        u.setUserName("i_mircea");
        u.setUserPass("1234");

        service.saveUser(u);

        return "This is a response from the server.";
    }
}
