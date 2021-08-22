package com.company.collections;

/**
 * Description: Design your own ArrayList and Singly LinkedList. Implement methods get,
 *              add, remove, contains, size. Creating more methods is additional.
 *              Extra:: Try to make your structures Iterable.
 *
 * @author Argishti_Tigranyan
 */

public class CustomArrayList <T>{

    private int index;
    private int size;
    private Object[] array = new Object[10];

    public CustomArrayList(){

    }

    public void add(T element){
        array[index++] = element;
        size++;
    }

    public void remove(int index){
        if (index == 0){
            for (int i = 0; i < array.length; i++){
                if (i == array.length - 1){
                    size--;
                    return;
                }
                    array[i] = array[i+1];
            }
        }
        else if (index == array.length-1){
            for (int i = array.length-1; i >= 0; i--){
                if (i == 0){
                    size--;
                    return;
                }
                array[i] = array[i-1];
            }
        }
        else {
            for (int i = index; i < array.length; i++){
                if (i == array.length-1){
                    size--;
                    return;
                }
                array[i] = array[i+1];
            }
        }
    }

    public T get(int index){
        return (T) array[index];
    }

    public int size(){
        return size;
    }

}
