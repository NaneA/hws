package JavaHomework.CustomSafeListImplementation;

public class SafeSimpleList<T> implements SimpleList{
    private Object[] list = new Object[10000];
    private int size = 0;
    @Override
    public void add(Object item) {
        if(size+1 >= 10000){
            throw new IllegalArgumentException();
        }

        list[size] = item;
        size++;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Object get(int index) {
        if(index<0 || index>10000){
            throw new IndexOutOfBoundsException();
        }
        return list[index];
    }
}
