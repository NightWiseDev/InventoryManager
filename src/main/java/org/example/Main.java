package org.example;

// ✨ Этот класс был создан Николасом
// 📅 Дата создания: 27.08.2024
// ⏰ Время создания: 19:57
// 🏢 Корпорация: ɴɪɢʜᴛᴡɪꜱᴇᴅᴇᴠ


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        InventoryManager  manager = new InventoryManager();
        System.out.println("Добавляем предмет..");
        manager.addItem("Алмаз", 2);
        System.out.println("Просматриваем список предметов...");
        manager.viewInventory();
        System.out.println("Удаляем предмет.... (1)");
        manager.removeItem("Алмаз",1);
        System.out.println("Просматриваем список предметов...");
        manager.viewInventory();
    }
}