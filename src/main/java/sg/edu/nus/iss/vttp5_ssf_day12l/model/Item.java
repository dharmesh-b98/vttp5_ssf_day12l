package sg.edu.nus.iss.vttp5_ssf_day12l.model;

public class Item {
    
    private String itemName;
    private Integer itemQuantity;

    public Item() {
    }

    public Item(String itemName, Integer itemQuantity) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
    
    
}
