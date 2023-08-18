package in.sakshi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoController {
	
	
	
	@GetMapping("/greet")
	 public String getGreetMsg(Model model) {
		 String msgTxt = "Welcome";
		 model.addAttribute("msg", msgTxt);
		 return "index";
	 }

	@GetMapping("/wish")
	 public String getWishMsg(Model model) {
		 String msgTxt = "Good Evening";
		 int i =10/0;
		 model.addAttribute("msg", msgTxt);
		 return "index";
	}
	
}
