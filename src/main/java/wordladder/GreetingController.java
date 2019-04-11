package wordladder;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class GreetingController {
        //private static final String template = "Hello, %s!";
        //private final AtomicLong counter = new AtomicLong();

        @RequestMapping("/Ladder")
        public String ladder1(@RequestParam(name = "bc") String beginw,
                              @RequestParam(name = "ec") String endw) {
            Greeting A = new Greeting();
            return A.ss(beginw,endw);
        }
        @RequestMapping("/Ladder/{beginword}/{endword}")
        public String ladder2(@PathVariable String beginword, @PathVariable String endword){
            Greeting A = new Greeting();
            return A.ss(beginword,endword);
        }
    }