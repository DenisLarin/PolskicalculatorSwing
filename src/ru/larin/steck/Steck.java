package ru.larin.steck;

/**
 * Created by mrden on 02.11.2016.
 */
public class Steck<E> implements ISteck<E> {
    private int size;
    private Node<E> top;
    private Node<E> down;

    public Steck() {
        top = null;
        down = null;
        size = 0;
    }

    @Override
    public void push(E object) {
        Node node = new Node(object);
        if(size() == 0){
            down = node;
        }
        node.setNextElementLink(top);
        top = node;
        size++;
    }

    @Override
    public E pop() {
        E removeObj = null;
        if (!isEmpty()) {
            removeObj = (E) top.getData();
            top = top.getNextElementLink();
            size--;
        }
        return removeObj;
    }

    @Override
    public E back(){
        return top.getData();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        while (size() != 0) {
            pop();
            size--;
        }
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    public E getDown() {
        return this.down.getData();
    }
}