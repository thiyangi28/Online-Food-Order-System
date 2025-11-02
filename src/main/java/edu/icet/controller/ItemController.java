package edu.icet.controller;

import edu.icet.model.dto.Customer;
import edu.icet.model.dto.Item;
import edu.icet.service.CustomerService;
import edu.icet.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    ItemService itemService;

    //get all details of customer
    @GetMapping("/all")
    public List<Item> getAllDetail(){
        return itemService.getAllDetails();
    }

    //add customer
    @PostMapping("/add")
    public  void add(@RequestBody Item item){
        itemService.add(item);
    }

    @PutMapping("/update")
    public void update(@RequestBody Item item){
        itemService.update(item);
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable String id){
        itemService.deleteId(id);
    }


}
