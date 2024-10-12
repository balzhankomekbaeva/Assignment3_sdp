package assignment_3_Menu_System;

public class RestaurantApp {
    public static void main(String[] args) {
        MenuComponent dinnerMenu = new Menu("Dinner assignment_3_Menu_System.Menu", "Evening meals");
        MenuComponent lunchMenu = new Menu("Lunch assignment_3_Menu_System.Menu", "Afternoon meals");

        MenuComponent allMenus = new Menu("All Menus", "All available menus");

        allMenus.add(dinnerMenu);
        allMenus.add(lunchMenu);

        dinnerMenu.add(new MenuItem("Pasta", "Spaghetti with marinara sauce", 12.99));
        lunchMenu.add(new MenuItem("Burger", "Classic cheeseburger", 8.99));

        allMenus.print();
    }
}
