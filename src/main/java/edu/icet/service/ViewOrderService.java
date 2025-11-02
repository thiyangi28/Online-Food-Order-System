package edu.icet.service;

import edu.icet.model.dto.Item;
import edu.icet.model.dto.ViewOrder;
import edu.icet.model.entity.ItemEntity;
import edu.icet.model.entity.ViewOrderEntity;
import edu.icet.repository.ViewOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ViewOrderService {

    @Autowired
    ViewOrderRepository viewOrderRepository;

    public List<ViewOrder> getAllDetails() {
        List<ViewOrderEntity> all = viewOrderRepository.findAll();
        List<ViewOrder> viewOrders = new ArrayList<>();

        for (ViewOrderEntity viewOrderEntity:all){
            viewOrders.add(new ViewOrder(
                    viewOrderEntity.getOrderId(),
                    viewOrderEntity.getOrderDate(),
                    viewOrderEntity.getCustId(),
                    viewOrderEntity.getItemCode()
            ));
        }
        return viewOrders;

    }

    public void add(ViewOrder addViewOrder) {
        viewOrderRepository.save(new ViewOrderEntity(
                addViewOrder.setOrderId(ViewOrder.getOrderId()),
                addViewOrder.getOrderDate(),
                addViewOrder.getCustId(),
                addViewOrder.setOrderId(dto.getOrderId())
        ));

    }

    public void update(ViewOrder updateViewOrder) {
        viewOrderRepository.save(new ViewOrderEntity(
                updateViewOrder.getOrderId(),
                updateViewOrder.getOrderDate(),
                updateViewOrder.getCustId(),
                updateViewOrder.getItemCode()
        ));
    }

    public void deleteId(String id) {
        viewOrderRepository.deleteById(id);
    }

    public ViewOrder serachId(String orderId) {

        Optional<ViewOrderEntity> byId = viewOrderRepository.findById(orderId);

        ViewOrderEntity viewOrderEntity = byId.orElseThrow();
        return new ViewOrder(
                viewOrderEntity.getOrderId(),
                viewOrderEntity.getOrderDate(),
                viewOrderEntity.getCustId(),
                viewOrderEntity.getItemCode()
        );
    }

}
