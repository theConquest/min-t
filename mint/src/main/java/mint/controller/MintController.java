package mint.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MintController {

    @RequestMapping("/")
    public String home(){
        return "MINT Application default page.";
    }

}
