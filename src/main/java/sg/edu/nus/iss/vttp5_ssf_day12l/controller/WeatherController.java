package sg.edu.nus.iss.vttp5_ssf_day12l.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import sg.edu.nus.iss.vttp5_ssf_day12l.model.Country;
import sg.edu.nus.iss.vttp5_ssf_day12l.service.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping(path = "/weather")
public class WeatherController {

    @Autowired
    CountryService countryService;
   
    @GetMapping(path = "") //query string
    public String weather1 (Model model, @RequestParam(required = true, name = "country") String country, @RequestParam(name = "metrics", defaultValue = "Inches") String metrics ){

        model.addAttribute("country", country);
        model.addAttribute("metrics", metrics);

        return "weather";
    }


    @GetMapping(path = {"/country/{country}/metrics/{metrics}", "/{country}/{metrics}"}) //path variable
    public String weather2(Model model, @PathVariable(name = "country", required = true) String country, @PathVariable(name = "metrics") String metrics){

        model.addAttribute("country", country);
        model.addAttribute("metrics", metrics);
        return "weather";
    }


    @GetMapping("/pageA")
    public String pageA(Model model) {
        String [] units = {"millimeter", "centimeter", "meter", "kilometer"};
        List<Country> countryList = countryService.getCountries();

        model.addAttribute("countryList", countryList);
        model.addAttribute("metricList", units);

        return "pageA";
    }


    @GetMapping("/formA")
    public String showForm(Model model) {
        return "formA";
    }
    
    @PostMapping("/formA")
    public String handlePageA(@RequestBody MultiValueMap<String, String> form) {

        // Map<String, String> formData = new HashMap<>();
        
        for(String str: form.keySet()) {
            System.out.println(str + ">>> " + form.getFirst(str));
        }
        
        return "formA";
    }


}   
