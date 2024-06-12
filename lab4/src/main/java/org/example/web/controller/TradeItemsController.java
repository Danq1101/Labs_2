package org.example.web.controller;


import lombok.RequiredArgsConstructor;
import org.example.model.TradeItem;
import org.example.service.TradeItemsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/home/tradeitems")
@RequiredArgsConstructor
public class TradeItemsController {

    private final TradeItemsService tradeItemsService;

    @GetMapping()
    public String home(Model model){
        List<TradeItem> tradeItems = tradeItemsService.getAll();
        model.addAttribute("tradeitems", tradeItems);
        return "searchitems";
    }

    @GetMapping("/find")
    public String findByName(@RequestParam(name = "name") String name, Model model){
        List<TradeItem> tradeItems = tradeItemsService.getByName(name);
        model.addAttribute("tradeitems", tradeItems);
        return "serchitems";
    }
}
