package lk.ijse.spring_boot.service;

import lk.ijse.spring_boot.DTO.ItemDTO;
import lk.ijse.spring_boot.entity.Item;
import lk.ijse.spring_boot.repo.ItemRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepos itemRepos;
    public boolean saveItem(ItemDTO itemDTO) {
        Item item = new Item(itemDTO.getItemId(),itemDTO.getItemName(),itemDTO.getItemDescription(),itemDTO.getItemPrice(),itemDTO.getItemQuantity());
         itemRepos.save(item);
         return true;
    }

    public List<ItemDTO> getAllItems() {
        List<Item> items = itemRepos.findAll();
        List<ItemDTO> itemDTOs = new ArrayList<>();
        for (Item item : items) {
            ItemDTO itemDTO = new ItemDTO(item.getId(),item.getName(),item.getDescription(),item.getPrice(),item.getQuantity());
            itemDTOs.add(itemDTO);

        }
        return itemDTOs;
    }

    public boolean updateItem(ItemDTO itemDTO) {
        if (itemRepos.existsById(itemDTO.getItemId())){
           Item item=new Item(itemDTO.getItemId(),itemDTO.getItemName(),itemDTO.getItemDescription(),itemDTO.getItemPrice(),itemDTO.getItemQuantity());
           itemRepos.save(item);
           return true;
        }
        return  false;
    }

    public boolean deleteItem(int id) {
        if(itemRepos.existsById(id)){
            itemRepos.deleteById(id);
            return true;
        }
        return false;
    }

    public ItemDTO searchItems(int id) {
       if (itemRepos.existsById(id)){
           Item item = itemRepos.findById(id).get();
           return new ItemDTO(item.getId(),item.getName(),item.getDescription(),item.getPrice(),item.getQuantity());

       }
       return null;
    }
}
