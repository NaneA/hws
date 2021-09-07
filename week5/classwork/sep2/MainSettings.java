package week5.classwork.sep2;

import java.io.*;

public class MainSettings {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final Settings settings = new Settings();
        settings.setProjectName("meh");
        settings.setHeigth(10);
        settings.setWidth(10);

        ObjectOutputStream stream = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\Nane\\Desktop\\adobe\\hws\\week5\\classwork\\file4.txt")
        );

        stream.writeObject(settings);
        stream.close();


        ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("C:\\Users\\Nane\\Desktop\\adobe\\hws\\week5\\classwork\\file4.txt")
        );
       // Cloneable

        final Settings  o = (Settings) inputStream.readObject();

        System.out.println(o.getHeigth());
        System.out.println(o.getProjectName());
       // inputStream.readObject();
    }

}
