package com.pace.app.lesson1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MyProductsController {
  // Spring Bean
  // Autowired is used to inject the bean into the class
  @Autowired
  SampleItem item;

  @GetMapping("/item")
  public SampleItem getItem() {
    item.setId(1);
    item.setName("Apple");
    item.setPrice(3.45);
    item.setDesc("Envy Apple.");
    return item;
  }

  // get products
  // path variable
  @GetMapping("/myproducts/{productId}")
  public String getProduct(@PathVariable int productId) {
      return new String("You have requested for product with id: " + productId);
  }

  // search products
  // request param
  @GetMapping("/myproducts")
  public String getMethodName(@RequestParam(required=false) String search ) {
      if(search == null){
        return new String("This is the product page.");
      } 
      // else
      return new String("You have searched for " + search);
  }
  
}
