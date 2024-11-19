package sg.edu.nus.iss.vttp5_ssf_day12l.repo;

import java.util.*;

import org.springframework.stereotype.Repository;
import sg.edu.nus.iss.vttp5_ssf_day12l.model.*;

@Repository
public class ItemRepo {

    //private List<Item> itemList = new ArrayList<>();


    public List<Item> getItemList(){
        List<Item> itemList = new ArrayList<>();
        Item itm = new Item("Apple M4 mini", 5);
        itemList.add(itm);
        itm = new Item("iphone 16 max pro", 15);
        itemList.add(itm);
        itm = new Item("Prada wallet", 25);
        itemList.add(itm);
        itm = new Item("Hermes Tot Bag", 10);
        itemList.add(itm);
        itm = new Item("LV suitcase", 8);
        itemList.add(itm);

        return itemList;
    }
}
