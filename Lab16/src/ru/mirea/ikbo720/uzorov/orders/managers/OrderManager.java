package ru.mirea.ikbo720.uzorov.orders.managers;

import ru.mirea.ikbo720.uzorov.menu.MenuItem;
import ru.mirea.ikbo720.uzorov.orders.Order;

public interface OrderManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    double ordersCostSummary();
    int ordersQuantity();
}
