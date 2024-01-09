package Generics;

public class Pair<T,U> {
    T var1;
    U var2;


    public Pair(T var1, U var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public T getVar1() {
        return var1;
    }

    public void setVar1(T var1) {
        this.var1 = var1;
    }

    public U getVar2() {
        return var2;
    }

    public void setVar2(U var2) {
        this.var2 = var2;
    }

}
