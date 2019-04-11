package wordladder;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
@RestController
public class HellojavaController{
    @RequestMapping("/")
    public String printtest(){
        Hellojava demo = new Hellojava();
        return demo.print();
    }
}