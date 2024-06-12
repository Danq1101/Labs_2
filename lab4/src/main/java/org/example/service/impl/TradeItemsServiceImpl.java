package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.model.TradeItem;
import org.example.repository.TradeItemsRepository;
import org.example.service.TradeItemsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TradeItemsServiceImpl implements TradeItemsService {

    private final TradeItemsRepository tradeItemsRepository;

    @Override
    public List<TradeItem> getAll() {
        return tradeItemsRepository.findAll();
    }

    @Override
    public List<TradeItem> getByName(String name) {
        return tradeItemsRepository.findByNameContaining(name);
    }

    @Override
    public List<TradeItem> getByUserEmail(String email){
        return tradeItemsRepository.findAllByUserEmail(email);
    }

    @Override
    public void createItem(TradeItem tradeItem){
        tradeItemsRepository.save(tradeItem);
    }

    @Override
    public void deleteItemById(Integer id){
        tradeItemsRepository.deleteById(id);
    }

    @Override
    public void updateTradeItemByName(String name, Integer cost, String img) {
        TradeItem tradeItem = tradeItemsRepository.findByName(name);
        tradeItem.setCost(cost);
        tradeItem.setImage(img);
    }


}
