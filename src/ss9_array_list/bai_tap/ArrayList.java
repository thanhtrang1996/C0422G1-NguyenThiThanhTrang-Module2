package ss9_array_list.bai_tap;

import java.util.Arrays;

public class ArrayList<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public ArrayList() {
        elements = new ArrayList[DEFAULT_CAPACITY];
    }

    public ArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            System.out.println("capacity :" + capacity);
        }
    }

    private int size() {
        return this.size;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity" + minCapacity);
        }
    }

    private void add(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("Index :" + index);
        } else if (size == elements.length) {
            this.ensureCapacity(10);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }
    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Index " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;

    }
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }
    private boolean add(E element) {
        if (size == elements.length) {
            this.ensureCapacity(10);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public ArrayList<E> clone() {
        ArrayList<E> v = new ArrayList<>();
        v.elements = Arrays.copyOf(elements, size);
        v.size = this.size;
        return v;
    }

    public boolean contain(E element) {
        return this.indexOf(element) >= 0;
    }

    public E get(int index) {
        return (E) elements[index];
    }

    private void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

}