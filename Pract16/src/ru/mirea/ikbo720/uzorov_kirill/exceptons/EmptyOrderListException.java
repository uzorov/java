package ru.mirea.ikbo720.uzorov_kirill.exceptons;

public class EmptyOrderListException extends NullPointerException {
    public EmptyOrderListException(){
        super("Нет ни одного заказа!");
    }
}
