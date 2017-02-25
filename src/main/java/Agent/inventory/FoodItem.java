package Agent.inventory;

public class FoodItem extends InventoryItem {
    int daysLeft = 10;
    int foodValue = 10;
    
    //Load the values from the static class.
    public FoodItem() {
        
        
    }
    
    public FoodItem(String name) {
        this.itemName = name;
        
        setup();
    }
    
    public void setup() {
        ItemStats stats = AllItems.getItem(this.itemName);
         //Load values
        this.daysLeft = stats.getFoodValue();
       
    }
    
    @Override
    public void simTick() {
        daysLeft--;
        
        
    }
}
