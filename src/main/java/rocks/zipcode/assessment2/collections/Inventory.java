package rocks.zipcode.assessment2.collections;

import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    TreeMap<String, Integer> inventoryTM;
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        inventoryTM = new TreeMap<>();
        for (String item: strings) {
            inventoryTM.put(item, 0);
        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        inventoryTM = new TreeMap<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        Integer current = getItemQuantity(item);
        inventoryTM.put(item, ++current);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        Integer current = inventoryTM.get(item);
        inventoryTM.put(item, --current);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        Set<String> keys = inventoryTM.keySet();
        if (keys.contains(item)) {
            return inventoryTM.get(item);
        }
        else {
            return 0;
        }
    }
}
