package sg.edu.nus.iss.vttp5_ssf_day12l.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import sg.edu.nus.iss.vttp5_ssf_day12l.model.*;

@Controller
@RequestMapping("/student")
public class StudentController {

    List<Student> studentList = new ArrayList<>();

    @RequestMapping(path = {"", "allStudents"}, method = RequestMethod.GET)
    public String getStudentList(Model model) throws ParseException{

        String dateOfBirth = "18 Dec 1975 10:25:00.000 SGT";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss.SSS zzz");
        Date dob = sdf.parse(dateOfBirth);
        Long longDob = dob.getTime();

        Student s1 = new Student(1, "Damien", "Cumming", longDob, "damient@nus.edu.sg", "25 HMKT 119615");
        studentList.add(s1);

        Student s2 = new Student(1, "Darryl", "Ng", longDob, "darrylng@nus.edu.sg", "25 HMKT 119615");
        studentList.add(s2);

        Student s3 = new Student(1, "Brandon", "Ng", longDob, "bradonng@nus.edu.sg", "25 HMKT 119615");
        studentList.add(s3);

        model.addAttribute("studentList" , studentList);
        
        return "studentlist";
    }
}
