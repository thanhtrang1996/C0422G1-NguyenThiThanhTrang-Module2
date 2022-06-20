package ss9_array_list.thuc_hanh;

import java.util.Arrays;

public class List<E> {
        private int size = 0;
       private final int DEFAULT_CAPACITY = 10;
        private  Object element [] ;
        public List(){
                element = new Object[DEFAULT_CAPACITY];
        }
        public void ensure(){
        int newSize = element.length*2;
        element = Arrays.copyOf(element,newSize);
        }

        public void add(E count){
                if (size == element.length){
                        ensure();
                }
                element[size++] = count;
        }
        public E get(int i){
                if (i >= size || i < 0){
                        throw new IndexOutOfBoundsException("Index :" + i +",size" + i);

                }
                return (E) element [i];
        }

        public static void main(String[] args) {
                List list= new List();
                list.add(1);
                list.add(2);
                list.add(3);
                System.out.println("element 2:" + list.get(2));
                System.out.println("element 1:" + list.get(1));
        }
}
