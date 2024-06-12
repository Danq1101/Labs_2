package org.example.service;

import org.example.model.TradeItem;

import java.util.List;

public interface TradeItemsService {

    List<TradeItem> getAll();

    List<TradeItem> getByName(String name);

    List<TradeItem> getByUserEmail(String email);

    void createItem(TradeItem tradeItem);

    void deleteItemById(Integer id);

    void updateTradeItemByName(String name, Integer cost, String img);


}
