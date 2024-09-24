package model;

public class Counter {
    private int k=0;

    public Counter(int k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "Количество кликов: " +
                k;
    }

    public int getK() {
        return k;
    }

    public int Plus() {

        return k++;
    }

    public int Minus() {

        return k--;
    }

}