package org.example;

// ✨ Этот класс был создан Николасом
// 📅 Дата создания: 09.09.2024
// ⏰ Время создания: 20:51
// 🏢 Корпорация: ɴɪɢʜᴛᴡɪꜱᴇᴅᴇᴠ

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InventoryManager {
    private static Map<String,Integer> inventory = new HashMap<>();

    public void addItem(String itemName,int amount){
        inventory.put(itemName,amount);
    }
    public void removeItem(String itemName, int amount){
        Iterator<Map.Entry<String, Integer>> iterator = inventory.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> inventory = iterator.next();
            int currentAmount = inventory.getValue();
            if(currentAmount > amount){
                inventory.setValue(currentAmount - amount);
                System.out.println("Количество уменьшено у предмета: " + itemName);
            } else {
                System.out.println("Был удален предмет: " + itemName);
                iterator.remove();
            }
            return;
        }
        System.out.println("Предмет " + itemName + " не найден в инвентаре");
    }
    public void clearInventory(){
        inventory.clear();
        System.out.println("Инвентарь полностью очищен");
        }
    public void viewInventory(){
        for(Map.Entry<String,Integer> entry : inventory.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Предмет: " + key + " Количество: " + value);
        }
    }
}
