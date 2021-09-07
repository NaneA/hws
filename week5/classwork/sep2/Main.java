package week5.classwork.sep2;

import java.io.*;
import java.util.*;

public class Main {
//
//    public static void main(String[] args) throws IOException {
//        Settings settings = new Settings();
//        settings.setHeigth(1);
//        settings.setWidth(2);
//        settings.setProjectName("blaah");
////        Formatter formatter = new Formatter("C:\\Users\\Nane\\Desktop\\adobe\\hws\\week5\\classwork\\file.txt");
////        formatter.format("%s","content");
////        formatter.flush();
////        formatter.close();
//       final Main main = new Main();
//        main.save(settings);
//
//       final Settings read = main.read();
//        System.out.println(read);
//
//
//        File file = new File("C:\\Users\\Nane\\Desktop\\adobe\\hws\\week5\\classwork\\file2.txt");
//        FileOutputStream fos = new FileOutputStream(file);
//
//        byte[] bytes = {0x28, 0x30, 0x29, 0x10, 0x01};
//        fos.write(bytes);
//        fos.close();
//
//        ObjectOutputStream objoutst = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\Nane\\Desktop\\adobe\\hws\\week5\\classwork\\file3.txt")));
//        objoutst.writeInt(10);
//    }
//    public  void save(Settings s) throws FileNotFoundException {
//        Formatter formatter = new Formatter("C:\\Users\\Nane\\Desktop\\adobe\\hws\\week5\\classwork\\file.txt");
//        formatter.format("%d %d %s", s.getHeigth(), s.getWidth(),s.getProjectName());
//        formatter.flush();
//        formatter.close();
//    }
//
//    public Settings read() throws FileNotFoundException {
//        File file = new File("C:\\Users\\Nane\\Desktop\\adobe\\hws\\week5\\classwork\\file.txt");
//        Scanner scanner = new Scanner(file);
//        final Settings settings = new Settings();
//        settings.setHeigth(scanner.nextInt());
//        settings.setWidth(scanner.nextInt());
//
//        settings.setProjectName(scanner.next());
//
//        scanner.close();
//        return settings;
//
//    }
//    public static void main(String[] args) {
//        Map<User, Integer> map = new HashMap();
//        final User key = new User("First Name", "Last Name");
//        final Integer value = 25;
//        map.put(new User("First Name", "Last Name"),25);
//        map.put(new User("First Name", "Last Name"),25);
//
//        map.put(key,value);
//
//
//        System.out.println(
//                map.get(key)
//        );
//
//        Set<User> set = new HashSet<>();
//        set.add(new User("First Name", "Last Name"));
//        set.add(new User("First Name", "Last Name"));
//        set.add(new User("First Name", "Last Name"));
//
////        System.out.println(
////                map.get(key)
////        );
//      Set<User>  users = new TreeSet<>();
//      users.add(new User("First Name", "Last Name"));
//      users.add(new User("First", "Last Name"));
//
////      users.add(new User("First Name", "Last Name"));
//
//        Map<User, Integer> usersMap = new HashMap<>();
//        usersMap.put(new User("First name", "Last name"),45);
//        usersMap.put(new User("First name2", "Last name"),54);
//        usersMap.put(new User("First name3", "Last name"),54);
//        usersMap.put(new User("First name4", "Last name"),54);
//
//
//        final Set<User>  users1 = usersMap.keySet();
//
//    }
//
//    public void printSet(Set<User> userSet){
//
//    }
//
//
//
//    private static class User implements Comparable<User>{
//
//
//        private final String firstname;
//        private final String lastname;
//
////        @Override
////        public int hashCode() {
////            return Objects.hash(firstname, lastname);
////        }
////
////        @Override
////        public boolean equals(Object o) {
////            if (this == o) return true;
////            if (o == null || getClass() != o.getClass()) return false;
////            User user = (User) o;
////            return Objects.equals(firstname, user.firstname) && Objects.equals(lastname, user.lastname);
////        }
//
//       private User(String firstname, String lastname) {
//            this.firstname = firstname;
//            this.lastname = lastname;
//        }
//
//
//
//        @Override
//        public int compareTo(User o) {
//            return 0;
//        }
//    }
}
