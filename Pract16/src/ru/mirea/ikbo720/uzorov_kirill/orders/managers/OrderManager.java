package ru.mirea.ikbo720.uzorov_kirill.orders.managers;

import ru.mirea.ikbo720.uzorov_kirill.menu.MenuItem;
import ru.mirea.ikbo720.uzorov_kirill.orders.Order;

public interface OrderManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    double ordersCostSummary();
    int ordersQuantity();
}
