package task2;

public class AssertionUtils {

    public static <E> void assertEquals(E val1, E val2){

        if (!val1.equals(val2)) {
                  throw new RuntimeException("values are not equal");
              }
    }
    public static void assertNotNull(Object obj){
        if(obj == null) throw new RuntimeException("Null value");
    }


    public static void main(String[] args) {
      //assertEquals(Integer 1, Integer 0b10);
        int i = 1;
        int b = 2;
        assertEquals(i,b);
        assertEquals(1,1);
        assertNotNull("blah");
    }




}
