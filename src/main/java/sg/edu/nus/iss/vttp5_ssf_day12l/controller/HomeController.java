package sg.edu.nus.iss.vttp5_ssf_day12l.controller;


import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/", method = RequestMethod.GET)
public class HomeController {
    
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getHomePage(Model model){

        Calendar calendar = Calendar.getInstance();

        String currentTime = calendar.getTime().toString();
        Integer currentHour = calendar.get(Calendar.HOUR_OF_DAY);

        model.addAttribute("currentTime", currentTime);
        model.addAttribute("currentHour", currentHour);

        return "homepage";
    }
}
