package Agent.inventory;

public class ItemStats {
    
    private String itemName;
    
    //Food Stats
    int foodValue = 0;
    int maxFreshDays = 10;
    
    
    //Subsidy Value
    //Minimum value the item can be sold for. This mechanic is to insure over-production doesn't drop prices below this level.
    //A good simulation won't need to use this mecahnic.
    int subsidyValue = 1;
    
    public void setName(String name) {
        this.itemName = name;
    }
    
    public String getName() {
        return this.itemName;
    }
    
    public int getFoodValue() {
        return this.foodValue;
    }
    
    public int getMaxFreshDays() {
        return this.maxFreshDays;
    }
    
    public int getSubsidyValue() {
        return this.subsidyValue;
    }
    
}
