package sg.edu.nus.iss.vttp5_ssf_day12l.controller;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import sg.edu.nus.iss.vttp5_ssf_day12l.model.*;
import sg.edu.nus.iss.vttp5_ssf_day12l.service.ItemService;


@Controller
@RequestMapping(path = "/item", method = RequestMethod.GET)
public class ItemController {
    
    @Autowired
    private ItemService itemservice;

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public String getItemList(Model model){
        List<Item> itemList = itemservice.getItemList();
        model.addAttribute("itemList",itemList);
        return "itemlist";
    }


    @RequestMapping(path = "/sortedlist", method = RequestMethod.GET)
    public String getSortedItemList(Model model){
        List<Item> itemList = itemservice.getItemList();
        List<Item> sortedItemList = new ArrayList<>();

        Comparator<Item> comparator = Comparator.comparing(a -> a.getItemQuantity());
        sortedItemList = itemList.stream().sorted(comparator).collect(Collectors.toList());

        model.addAttribute("itemList",sortedItemList); //passing under the same variable name

        return "itemlist";
    }


    @RequestMapping(path = "/filteredlist", method = RequestMethod.GET)  //http://localhost:8080/item/filteredlist?limit=10
    public String getfilteredItemList(Model model, @RequestParam(required = true, name = "limit") String limit){
        List<Item> itemList = itemservice.getItemList();
        List<Item> filteredItemList = new ArrayList<>();

        filteredItemList = itemList.stream().filter(a -> a.getItemQuantity() >= Integer.parseInt(limit)).collect(Collectors.toList());

        model.addAttribute("itemList",filteredItemList); //passing under the same variable name

        return "itemlist";
    }
}
