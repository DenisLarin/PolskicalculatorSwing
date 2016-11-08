package ru.larin.steck;

import ru.larin.main.MyExeptions;

/**
 * Created by mrden on 02.11.2016.
 */
public interface ISteck<E> {
    public void push(E object);
    public E pop();
    public E back();
    public int size();
    public void clear();
    public boolean isEmpty();
}
