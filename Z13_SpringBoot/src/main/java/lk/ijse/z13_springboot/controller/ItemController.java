package lk.ijse.z13_springboot.controller;


import lk.ijse.z13_springboot.dto.ItemDTO;
import lk.ijse.z13_springboot.service.ItemService;
import lk.ijse.z13_springboot.util.ResponseUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/item")
public class ItemController {


     @Autowired
     private ItemService itemService;


     @PostMapping("save")
     public ResponseUtill addItem(@RequestBody ItemDTO itemDTO) {
           itemService.saveItem(itemDTO);
           return new ResponseUtill(200,"save item",null);
     }


     @PutMapping("update")
    public ResponseUtill updateItem(@RequestBody ItemDTO itemDTO) {
         itemService.updateItem(itemDTO);
         return new ResponseUtill(200,"update item",null);
     }


     @GetMapping("getAll")
    public ResponseUtill getAllItem() {
         return new ResponseUtill(200,"load all items",itemService.getAllitems());
     }

     @DeleteMapping("delete")
    public ResponseUtill deleteItem(@PathVariable int id) {
         itemService.deleteItem(id);
         return new ResponseUtill(200,"delete item",null);
     }
}
