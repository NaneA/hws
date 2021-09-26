package JavaHomework.SafeAndUnsafeCar;

import java.util.ArrayList;
import java.util.List;

public class SafeCar implements Car{
    final private int MaxSize =6;

    private int takenPlaces = 0;
    List<String> namesList = new ArrayList<>();
    @Override
    public synchronized void add(String passengerName) {
//        if(takenPlaces>MaxSize){
//            try {
//                throw new Exception("The are no avaliable seats");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
        namesList.add(passengerName);
        takenPlaces++;
    }

    @Override
    public void printPassangerNames() {
        System.out.println(namesList);
    }
}
