package ru.mirea.ikbo720.uzorov_kirill.exceptons;

import ru.mirea.ikbo720.uzorov_kirill.customers.Address;

public class OrderOnAddressAlreadyExistsException extends IllegalArgumentException {
    Address address;
    public OrderOnAddressAlreadyExistsException(Address address) {
        super("Заказ на адрес "+address.toString()+" уже обрабатывается!");
    }
}
