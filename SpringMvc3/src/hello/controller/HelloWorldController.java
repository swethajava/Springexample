package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
 @RequestMapping("/hello")
 public ModelAndView helloWorld()
 {
	 String message = "I love you . HAPPY VALENTIENS DAY";
	 return new ModelAndView("hello", "message",message);
 }
}

