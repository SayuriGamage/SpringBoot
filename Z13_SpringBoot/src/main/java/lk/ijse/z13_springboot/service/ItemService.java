package lk.ijse.z13_springboot.service;

import lk.ijse.z13_springboot.dto.ItemDTO;

public interface ItemService {
    void saveItem(ItemDTO itemDTO);

    void updateItem(ItemDTO itemDTO);

    Object getAllitems();

    void deleteItem(int id);

}
