package com.workshop.day23.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.InvalidResultSetAccessException;
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
@RequestMapping(path="/order")
public class OrderController {

    @Autowired
    OrderRepo orderRepo;

    @GetMapping
    public String getNewIndex() {
        return "index";
    }

    
    @PostMapping(path="/total/{orderId}")
    public String getOrderById(Model model, 
    @PathVariable("orderId") Integer orderId
    ) throws InvalidResultSetAccessException, ParseException {
        // run query to retrieve key details for order
        Order o = orderRepo.getOrderDetails(orderId);
        System.out.println("Created Order: " + o);
        
        // pass created object to model
        model.addAttribute("order", o);
        
        // System.out.println("Model: " + model);
        return "details";
    }
}
