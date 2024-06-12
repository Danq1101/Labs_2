package org.example.web.controller;


import lombok.RequiredArgsConstructor;
import org.example.config.MyUserDetails;
import org.example.model.TradeItem;
import org.example.model.User;
import org.example.service.TradeItemsService;
import org.example.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/home/profile")
@RequiredArgsConstructor
public class UserProfileController {

    private final TradeItemsService tradeItemsService;

    private final UserService userService;

    @GetMapping
    public String home(Authentication authentication, Model model){
        MyUserDetails myUserDetails = (MyUserDetails) authentication.getPrincipal();
        User user = userService.findUser(myUserDetails.getUsername());
        List<TradeItem> tradeItems = tradeItemsService.getByUserEmail(user.getEmail());
        model.addAttribute("tradeitems", tradeItems);
        model.addAttribute("user", user);
        return "profile";
    }

    @GetMapping("/logout")
    public String logout(){
        return "logout";
    }

    @PostMapping("/update-user")
    public void updateUser(Authentication authentication,
                           @RequestParam(name = "phoneNumber") String phoneNumber,
                           @RequestParam(name = "city") String city){
        MyUserDetails myUserDetails = (MyUserDetails) authentication.getPrincipal();
        String email = myUserDetails.getUsername();
        userService.updateUser(email, phoneNumber, city);
    }

    @PostMapping("/create")
    public String create(Authentication authentication, TradeItem tradeItem, Model model){
        MyUserDetails myUserDetails = (MyUserDetails) authentication.getPrincipal();
        String email = myUserDetails.getUsername();
        User user = userService.findUser(email);
        tradeItem.setUser(user);
        tradeItemsService.createItem(tradeItem);
        return "redirect:/home/profile";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam(name = "id") Integer id, Model model){
        tradeItemsService.deleteItemById(id);
        return "redirect:/home/profile";
    }

    @PostMapping("/update-item")
    public String updateItem(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "cost") Integer cost,
            @RequestParam(name = "img") String img){
        tradeItemsService.updateTradeItemByName(name, cost, img);
        return "redirect:/home/profile";
    }



}
