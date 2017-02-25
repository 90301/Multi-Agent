package Agent.inventory;

import Agent.Simulateable;

public class InventoryItem implements Simulateable {
    String itemName = "";
    int quantity = 1;
    
    //Item stats can be found through a static lookup
    
    public InventoryItem() {
    }
    
    public InventoryItem(String itemName) {
        this.itemName = itemName;
    }
    
    public void simTick() {
        
    }
    
    
    public String getName() {
        return itemName;
    }
    
    public void setName(String name) {
        this.itemName = name;
    }
    
    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
