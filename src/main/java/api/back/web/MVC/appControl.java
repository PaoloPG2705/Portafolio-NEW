package api.back.web.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import api.back.web.Entity.email;



@Controller
@RequestMapping("/")
public class appControl {
    
    //requestMapping index 
    @GetMapping("/index")
    public ModelAndView home() {
        return new ModelAndView("index")
        .addObject("email", new email());
    }






}


