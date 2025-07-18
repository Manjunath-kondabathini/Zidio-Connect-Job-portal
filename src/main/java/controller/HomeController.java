package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
	    return "index";
	}

	@GetMapping("/home")
	public String home() {
	    return "home";
	}

    @GetMapping("/career-advice")
    public String careerAdvice() {
        return "career-advice";
    }

    @GetMapping("/highlights")
    public String highlights() {
        return "highlights";
    }

    @GetMapping("/jobs")
    public String jobs() {
        return "jobs";
    }

    @GetMapping("/learn")
    public String learn() {
        return "learn";
    }

    @GetMapping("/preparation")
    public String preparation() {
        return "preparation";
    }
}