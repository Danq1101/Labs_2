package org.example.repository;

import org.example.model.TradeItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TradeItemsRepository extends JpaRepository<TradeItem, Integer> {

    List<TradeItem> findByNameContaining(String name);

    TradeItem findByName(String name);

    List<TradeItem> findAllByUserEmail(String email);
}
