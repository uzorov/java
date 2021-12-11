package ru.mirea.ikbo720.uzorov_kirill.exceptons;

import ru.mirea.ikbo720.uzorov_kirill.customers.Customer;
import ru.mirea.ikbo720.uzorov_kirill.menu.Drink;

public class CustomerChangedToNotMatureException extends AlcoholForNotMatureCustomerException{

    public CustomerChangedToNotMatureException(Customer c, Drink[] alcoholables) {
        super(c, alcoholables);
    }

    @Override
    public String getMessage() {
        return super.getMessage()+"Вся алкогольная продукция удалена из заказа.";
    }
}
