package edu.icet.controller;


import edu.icet.model.dto.Item;
import edu.icet.model.dto.ViewOrder;
import edu.icet.service.ItemService;
import edu.icet.service.ViewOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class ViewOrderController {

    @Autowired
    ViewOrderService viewOrderService;

    //get all details of customer
    @GetMapping("/all")
    public List<ViewOrder> getAllDetail(){
        return viewOrderService.getAllDetails();
    }

    //add customer
    @PostMapping("/add")
    public  void add(@RequestBody ViewOrder viewOrder){
        viewOrderService.add(viewOrder);
    }

    @PutMapping("/update")
    public void update(@RequestBody ViewOrder viewOrder){
        viewOrderService.update(viewOrder);
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable String id){
        viewOrderService.deleteId(id);
    }

    @GetMapping("/{orderId}")
    public ViewOrder seachById(@PathVariable String orderId){
        return  viewOrderService.serachId(orderId);
    }

}
