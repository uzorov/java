package ru.mirea.ikbo720.uzorov_kirill.exceptons;

public class NoOrderForTableException extends IllegalArgumentException {
    private int tNum;

    public int gettNum() {
        return tNum;
    }
    public NoOrderForTableException(int tNum){
        super("Для столика №"+(tNum+1)+" нет заказа!");
        this.tNum = tNum;
    }
}
