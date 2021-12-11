package ru.mirea.ikbo720.uzorov_kirill.exceptons;

public class IllegalTableNumberException extends IllegalArgumentException {
    private int tNum, max;

    public int gettNum() {
        return tNum;
    }

    public int getMax() {
        return max;
    }

    public IllegalTableNumberException(int tNum, int max){
        super("Стола с номером "+tNum+" не существует! Максимальный номер стола = "+max);
        this.max = max;
        this.tNum = tNum;
    }
}
