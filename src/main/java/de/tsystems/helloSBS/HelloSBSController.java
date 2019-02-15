package de.tsystems.helloSBS;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSBSController
{

    @RequestMapping("/")
    public String index()
    {
        return "Hello SBS!";
    }

}
