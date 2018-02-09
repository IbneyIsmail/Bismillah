package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@CrossOrigin("http://127.0.0.1:8999")
@Controller
@RequestMapping("/")
public class SubCalcController {
    @RequestMapping(value = "sub/{a}/{b}",method = RequestMethod.GET)
    public @ResponseBody Long sub(@PathVariable("a") Long a,@PathVariable("b") Long b) {
        return a-b;
    }

}
