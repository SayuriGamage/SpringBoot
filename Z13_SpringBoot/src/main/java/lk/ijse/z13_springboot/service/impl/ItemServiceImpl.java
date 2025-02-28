package lk.ijse.z13_springboot.service.impl;


import lk.ijse.z13_springboot.dto.ItemDTO;
import lk.ijse.z13_springboot.entity.Item;
import lk.ijse.z13_springboot.repo.ItemRepo;
import lk.ijse.z13_springboot.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepo itemRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveItem(ItemDTO itemDTO) {
        itemRepo.save(modelMapper.map(itemDTO, Item.class));
    }

    @Override
    public void updateItem(ItemDTO itemDTO) {
        if(itemRepo.existsById(itemDTO.getCode())){
            itemRepo.save(modelMapper.map(itemDTO, Item.class));
        }
    }

    @Override
    public Object getAllitems() {
        return modelMapper.map(itemRepo.findAll(), new TypeToken<List<ItemDTO>>() {}.getType());
    }

    @Override
    public void deleteItem(int id) {
        if (itemRepo.existsById(id)){
            itemRepo.deleteById(id);
        }
    }
}
