package hello;


import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LadderController {
    //private static final String template = "Hello, %s!";
    //private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/Ladder")
    public String ladder1(@RequestParam(name = "w1") String beginw,
                          @RequestParam(name = "w2") String endw) {
        Ladder A = new Ladder();
        return A.ss(beginw,endw);
    }
    @RequestMapping("/Ladder/{beginword}/{endword}")
    public String ladder2(@PathVariable String beginword, @PathVariable String endword){
        Ladder A = new Ladder();
        return A.ss(beginword,endword);
    }
}