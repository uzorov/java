package ru.mirea.ikbo720.uzorov.exceptons;

public class NoFreeTablesException extends Exception {
    private int count;

    public NoFreeTablesException(int count){
        super("Все столики заняты! Всего столов: "+count);
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
