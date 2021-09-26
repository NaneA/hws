package JavaHomework.CustomSafeListImplementation;

public class UnsafeSimpleList<T> implements SimpleList{
    private Object[] list = new Object[10000];
    private int size = 0;
    @Override
    public synchronized void add(Object item) {
        if(size+1 >= 10000){
            throw new IllegalArgumentException();
        }

        list[size] = item;
        size++;

    }

    @Override
    public synchronized int getSize() {
        return size;
    }

    @Override
    public synchronized Object get(int index) {
        if(index<0 || index>10000){
            throw new IndexOutOfBoundsException();
        }
        return list[index];
    }
}
