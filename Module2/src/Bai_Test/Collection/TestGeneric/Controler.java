package Bai_Test.Collection.TestGeneric;

import java.util.ArrayList;

public class Controler<E> {
    ArrayList<E> list = new ArrayList<E>();

    public Controler() {
    }

    public void add(E e) {
        list.add(e);

    }

    public E get(int index) {
        return list.get(index);
    }
}
