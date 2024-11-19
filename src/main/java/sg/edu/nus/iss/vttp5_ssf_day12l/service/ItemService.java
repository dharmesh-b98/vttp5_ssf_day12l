package sg.edu.nus.iss.vttp5_ssf_day12l.service;

import java.util.*;
import sg.edu.nus.iss.vttp5_ssf_day12l.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sg.edu.nus.iss.vttp5_ssf_day12l.repo.*;

@Service
public class ItemService {
    
    @Autowired
    ItemRepo itemrepo;

    public List<Item> getItemList(){
        return itemrepo.getItemList();
    }


}
