package ru.mirea.ikbo720.uzorov.exceptons;

import ru.mirea.ikbo720.uzorov.customers.Customer;
import ru.mirea.ikbo720.uzorov.menu.Drink;

public class AddingAlcoholForNotMatureCustomerException extends AlcoholForNotMatureCustomerException {
    public AddingAlcoholForNotMatureCustomerException(Customer c, Drink alcoholable) {
        super(c, alcoholable);
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "Элемент не добавлен в заказ.";
    }
}
