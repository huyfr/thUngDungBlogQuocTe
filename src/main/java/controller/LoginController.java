package controller;

import model.Credentials;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("user")
public class LoginController {


    @ModelAttribute("credentials")
    public Credentials credentials() {
        return new Credentials();
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView dashboard(@ModelAttribute("credentials") Credentials credentials) {
        User user = new User();
        user.setUserName(credentials.getUsername());
        ModelAndView dashboard = new ModelAndView("dashboard");
        dashboard.addObject("user", user);
        return dashboard;
    }
}
