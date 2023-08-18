package in.sakshi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/user")
	 public String getUserMsg(Model model) {
		 String msgTxt = "Hello User";
		 int i = 10/0;
		 model.addAttribute("msg", msgTxt);
		 return "index";
	 }

}
