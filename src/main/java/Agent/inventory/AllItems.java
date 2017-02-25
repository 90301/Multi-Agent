package Agent.inventory;

import java.util.HashMap;

import java.util.Map;

public class AllItems {
    //Static class that holds all item stats.
    //it's intended to serve as a reference to cut down on duplicate data.
    
    private static Map<String,ItemStats> items = new HashMap<String,ItemStats>();
    
    
    public static void storeItem(ItemStats stats) {
        items.put(stats.getName(),stats);
    }
    
    public static ItemStats getItem(String name) {
        return items.get(name);
    }
}
