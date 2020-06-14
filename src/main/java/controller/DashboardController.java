package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("user")
public class DashboardController {

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public ModelAndView login() {
        return new ModelAndView("dashboard");
    }
}
