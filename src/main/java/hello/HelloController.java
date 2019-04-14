package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/index")
    public String index(){
        return "hello guys, http://localhost:9000/Ladder?a=dog&b=cat";
    }

    @RequestMapping("/index1")
    public String index1(){
        return "hello world index1";
    }
}