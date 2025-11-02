package edu.icet.service;

import edu.icet.model.dto.PlaceOrder;
import edu.icet.model.dto.ViewOrder;
import edu.icet.model.entity.PlaceOrderEntity;
import edu.icet.model.entity.ViewOrderEntity;
import edu.icet.repository.PlaceOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PlaceOrderService {

    @Autowired
    PlaceOrderRepository placeOrderRepository;


    public List<PlaceOrder> getAllDetails() {
        List<PlaceOrderEntity> all = placeOrderRepository.findAll();
        List<PlaceOrder> viewOrders = new ArrayList<>();

        for (PlaceOrderEntity placeOrderEntity:all){
            placeOrderEntity.add(new PlaceOrderEntity(


                    placeOrderEntity.getPoOrderId(),
                    placeOrderEntity.getOrderId(),
                    placeOrderEntity.getDescription(),
                    placeOrderEntity.getOrderQty(),
                    placeOrderEntity.getTotal()
            ));
        }
        return viewOrders;
    }

    public void add(PlaceOrder placeOrder) {
        placeOrderRepository.save(new PlaceOrderEntity(
                placeOrder.getPoOrderId(),
                placeOrder.getOrderId(),
                placeOrder.getDescription(),
                placeOrder.getOrderQty(),
                placeOrder.getTotal()
        ));
    }

    public void update(PlaceOrder placeOrder) {
        placeOrderRepository.save(new PlaceOrderEntity(
                placeOrder.getPoOrderId(),
                placeOrder.getOrderId(),
                placeOrder.getDescription(),
                placeOrder.getOrderQty(),
                placeOrder.getTotal()
        ));
    }

    public void deleteId(String id) {
        placeOrderRepository.deleteById(id);
    }

    public ViewOrder serachId(String placeOrder_Id) {
        Optional<ViewOrderEntity> byId = placeOrderRepository.findById(placeOrder_Id);

        ViewOrderEntity viewOrderEntity = byId.orElseThrow();
        return new ViewOrder(
                viewOrderEntity.getOrderId(),
                viewOrderEntity.getOrderDate(),
                viewOrderEntity.getCustId(),
                viewOrderEntity.getItemCode()
        );
    }
    }
}
