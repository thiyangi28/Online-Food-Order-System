package edu.icet.service;

import edu.icet.model.dto.Item;
import edu.icet.model.entity.ItemEntity;

import edu.icet.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAllDetails() {
        List<ItemEntity> all = itemRepository.findAll();
        List<Item> items = new ArrayList<>();

        for (ItemEntity itemEntity:all){
            items.add(new Item(
                    itemEntity.getItemCode(),
                    itemEntity.getDescription(),
                    itemEntity.getPackSize(),
                    itemEntity.getUnitPrice(),
                    itemEntity.getQuantity()
                    ));
        }
        return items;
    }

    public void add(Item addItem) {
        itemRepository.save(new ItemEntity(
                addItem.getItemCode(),
                addItem.getDescription(),
                addItem.getPackSize(),
                addItem.getUnitPrice(),
                addItem.getQuantity()
        ));
    }

    public void update(Item updateItem) {
        itemRepository.save(new ItemEntity(
                updateItem.getItemCode(),
                updateItem.getDescription(),
                updateItem.getPackSize(),
                updateItem.getUnitPrice(),
                updateItem.getQuantity()
        ));
    }

    public void deleteId(String id) {
        itemRepository.deleteById(id);
    }
}
