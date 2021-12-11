package ru.mirea.ikbo720.uzorov_kirill.exceptons;

import ru.mirea.ikbo720.uzorov_kirill.customers.Customer;
import ru.mirea.ikbo720.uzorov_kirill.menu.Drink;

public class AddingAlcoholForNotMatureCustomerException extends AlcoholForNotMatureCustomerException {
    public AddingAlcoholForNotMatureCustomerException(Customer c, Drink alcoholable) {
        super(c, alcoholable);
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "Элемент не добавлен в заказ.";
    }
}
