package lk.ijse.spring_boot.controller;

import lk.ijse.spring_boot.DTO.ItemDTO;
import lk.ijse.spring_boot.entity.Item;
import lk.ijse.spring_boot.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/item")
public class ItemController {
     @Autowired
    private ItemService itemService;

    @PostMapping("save")
    public boolean save(@RequestBody ItemDTO itemDTO) {
        return itemService.saveItem(itemDTO);
    }

    @GetMapping("getAll")
    public List<ItemDTO> getAll() {
         List<ItemDTO> itemDTOS=itemService.getAllItems();
         return itemDTOS;

    }

    @PutMapping("update")
    public boolean update(@RequestBody ItemDTO itemDTO) {
        boolean update=itemService.updateItem(itemDTO);
        return update;
    }

    @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable int id) {
        boolean delete=itemService.deleteItem(id);
        return delete;
    }

    @GetMapping("search/{id}")
   public  ItemDTO search(@PathVariable int id) {
        return itemService.searchItems(id);
    }

}
