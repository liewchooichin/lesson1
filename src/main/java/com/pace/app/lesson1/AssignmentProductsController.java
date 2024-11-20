package com.pace.app.lesson1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class AssignmentProductsController {
  private Map<Integer, String> productList = Map.ofEntries(
      Map.entry(1, "Apple"),
      Map.entry(2, "Banana"),
      Map.entry(3, "Carrot"));

  @GetMapping("/products/{productId}")
  public String getProducts(@PathVariable String productId) {
    int pid = 0;
    StringBuilder result = new StringBuilder("This is detail for ID: " 
      + productId + ". ");
    try{
      pid = Integer.parseInt(productId);
    } catch(NumberFormatException exception) {
      System.out.println("Not a proper integer. An integer is expected.");
    }
    
    if(pid>=1 && pid<=3){
      result.append("Product Name: ");
      result.append(productList.getOrDefault(pid, "Unknown"));
    } else{
      result.append("No product found.");
    }

    return result.toString();
  }
}
