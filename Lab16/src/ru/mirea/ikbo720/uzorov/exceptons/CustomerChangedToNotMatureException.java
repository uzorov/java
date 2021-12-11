package ru.mirea.ikbo720.uzorov.exceptons;

import ru.mirea.ikbo720.uzorov.customers.Customer;
import ru.mirea.ikbo720.uzorov.menu.Drink;

public class CustomerChangedToNotMatureException extends AlcoholForNotMatureCustomerException{

    public CustomerChangedToNotMatureException(Customer c, Drink[] alcoholables) {
        super(c, alcoholables);
    }

    @Override
    public String getMessage() {
        return super.getMessage()+"Вся алкогольная продукция удалена из заказа.";
    }
}
