package edu.icet.controller;

import edu.icet.model.dto.Item;
import edu.icet.model.dto.PlaceOrder;
import edu.icet.model.dto.ViewOrder;
import edu.icet.service.ItemService;
import edu.icet.service.PlaceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("placeOrder")
public class PlaceOrderController {

    @Autowired
    PlaceOrderService placeOrderService;

    //get all details of customer
    @GetMapping("/all")
    public List<PlaceOrder> getAllDetail(){
        return placeOrderService.getAllDetails();
    }

    //add customer
    @PostMapping("/add")
    public  void add(@RequestBody PlaceOrder placeOrder){
        placeOrderService.add(placeOrder);
    }

    @PutMapping("/update")
    public void update(@RequestBody PlaceOrder placeOrder){
        placeOrderService.update(placeOrder);
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable String id){
        placeOrderService.deleteId(id);
    }

    @GetMapping("/{orderId}")
    public ViewOrder seachById(@PathVariable String placeOrder_Id){
        return  placeOrderService.serachId(placeOrder_Id);
    }


}
