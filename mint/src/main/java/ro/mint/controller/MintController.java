package ro.mint.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/mint")
public class MintController {


    @PostMapping
    @RequestMapping("/testReq")
    String testReq(Principal principal) {
        return "This is a response from the server.";

    }
}
