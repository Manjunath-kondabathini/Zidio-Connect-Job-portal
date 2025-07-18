package controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobController {

    @GetMapping("/jobs")
    public String jobs() {
        return "jobs"; // templates/jobs.html
    }
}