package week5.homework;

import java.util.Comparator;

public class CustomArrayList<T>{
    private Object[] genarr;
    int capacity = 13;
    private int size = 0;
    private final int maxcap = 1000;

    public CustomArrayList () {
        this.genarr = new Object[capacity];
    }

    public void addFront(Object val){
        addAtIndex(val,0);
     }

    public void addEnd(Object val){
        addAtIndex(val,size);
     }

    public void addAtIndex(Object val, int ind){
        if(this.capacity < this.size+1){
            makeArrBigger();
        }
       // IndexOutOfRange(ind);
        for(int i=this.size+1; i>ind; i--){
              this.genarr[i] = this.genarr[i-1];
        }
        this.genarr[ind] = val;
        this.size++;

    }

    public int indexOf(Object val){ //return the first element that satisfies the condition
        for (int i = 0; i < this.size ; i++) {
            if(this.genarr[i] == val){
                return i;
            }
        }
        return -1;
    }

    public void deleteVal(Object val){
        int ind = indexOf(val);
        if(ind == -1){
            try {
                throw new Exception("No such element found");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//        deleteAt(ind);
        else {
            for (int i = ind; i < size; i++) {
                this.genarr[i] = this.genarr[i + 1];
            }
            this.size--;
        }
    }

   public void deleteAt(int ind){
       IndexOutOfRange(ind);
       for(int i=ind; i<size; i++){
           this.genarr[i] = this.genarr[i+1];
       }
       this.size--;
   }


   public void bubbleSort(){
        //Object[] temp = new Object[size];
       final long nano = System.nanoTime();
        Object temp;
       System.out.println(size);
       for (int i = 0; i < size; i++) {
           for (int j = 0; j <size-i-1 ; j++) {
               if(compare((T) this.genarr[j], (T) this.genarr[j+1])>0){
//               if((Integer) this.genarr[j]>(Integer) this.genarr[j+1]){
                    temp =  this.genarr[j];
                    this.genarr[j] = this.genarr[j+1];
                    this.genarr[j+1] = temp;

               }
           }
       }
       System.out.println("Bubble Sort :" +(System.nanoTime()-nano));
   }


    int partition(int low, int high)
    {
       T pivot = (T) this.genarr[high];

        // index of smaller element
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (compare((T) this.genarr[j], pivot)<=0) {
                i++;

                // swap this.genarr[i] and this.genarr[j]
                T temp =  (T) this.genarr[i];
                this.genarr[i] = this.genarr[j];
                this.genarr[j] = temp;
            }
        }

        // swap this.genarr[i+1] and this.genarr[high] (or pivot)
         T temp =  (T) this.genarr[i + 1];
        this.genarr[i + 1] = this.genarr[high];
        this.genarr[high] = temp;

        return i + 1;
    }

    /* A[] --> Array to be sorted,
   l  --> Starting index,
   h  --> Ending index */
    void quickSortIterative(int l, int h) {
        // Create an auxiliary stack
        final long nano = System.nanoTime();
        int[] stack = new int[h - l + 1];

        // initialize top of stack
        int top = -1;

        // push initial values of l and h to stack
        stack[++top] = l;
        stack[++top] = h;

        // Keep popping from stack while is not empty
        while (top >= 0) {
            // Pop h and l
            h = stack[top--];
            l = stack[top--];

            // Set pivot element at its correct position
            // in sorted array
            int p = partition(l, h);

            // If there are elements on left side of pivot,
            // then push left side to stack
            if (p - 1 > l) {
                stack[++top] = l;
                stack[++top] = p - 1;
            }

            // If there are elements on right side of pivot,
            // then push right side to stack
            if (p + 1 < h) {
                stack[++top] = p + 1;
                stack[++top] = h;
            }
        }
        System.out.println("Quick Sort :" + (System.nanoTime()-nano));
    }
private int compare(T a, T b){ //compare works only for String values and int values
       if(a instanceof String){
           return ((String) a).compareTo((String) b);
       }
       else{
           if((Integer) a>(Integer) b){
               return 1;
           }
           else{
               return -1;
           }
       }
}


    //helper functions
 private void makeArrBigger(){
        if(this.size == maxcap){
            try {
                throw new Exception("Cannot add more elements");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else{
            Object[] temp = new Object[Math.min(this.size*2,maxcap)];

            for (int i = 0; i < this.size ; i++) {
                temp[i] = genarr[i];
            }
            this.genarr = temp;
            this.capacity = Math.min(this.size*2,maxcap);

        }
 }


    private void IndexOutOfRange(int ind){
        if(ind>size || ind<0){
            try {
                throw new Exception("Index Out of Bounds");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void getGenarr() {
        for(int i = 0; i<size; i++)
            System.out.println(genarr[i]);
    }


    public int size(){
        return this.size;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < this.size - 1; i++) {
            sb.append(this.genarr[i].toString()).append(", ");
        }
        sb.append(this.genarr[this.size - 1].toString()).append(" ]");
        return sb.toString();
    }

}
