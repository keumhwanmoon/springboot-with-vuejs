package jason.vue.demo.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author jason, Moon.
 * @since 2017-08-10
 */
@Controller
public class IndexController {
    @GetMapping(value = "/demo/{number}")
    public String getPagePath(@PathVariable("number") String number) {
        return "/demo" + number;
    }
}