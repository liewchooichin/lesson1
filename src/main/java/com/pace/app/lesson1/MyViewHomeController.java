package com.pace.app.lesson1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * For server side rendered HTML pages. Useful when we do not want
 * users to load large JavaScript pages.
 * Rendered faster.
 */

@Controller
public class MyViewHomeController {
  @GetMapping("/my-view-home")
  public String home(Model model) {
      String message = "Hello World.";
      model.addAttribute("message", message);
      return "home"; // in resources/templates
  }
  
}
