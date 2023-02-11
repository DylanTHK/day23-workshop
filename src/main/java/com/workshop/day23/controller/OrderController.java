package com.workshop.day23.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.workshop.day23.repo.OrderRepo;
import com.workshop.day23.model.Order;


@Controller
@RequestMapping
public class OrderController {

    @Autowired
    OrderRepo orderRepo;

    @GetMapping(path="/details")
    public String getNewIndex(Model model) {
        model.addAttribute("order", new Order());
        return "new";
    }

    
    @PostMapping(path="/details/{orderId}")
    public String getOrderById(Model model, 
    @PathVariable("orderId") String orderIdString,
    BindingResult bs) {
        System.out.println(model);
        // run methods to retrieve order details
        System.out.println();
        
        return "details";
    }
}
