package homeWork_7.utilts;

import java.io.*;

public class SaveMethod {
    public static String forSave(File file, String course) {
        try(FileOutputStream fis = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fis)) {
             oos.writeObject(course);
             oos.writeObject(course);
             oos.writeObject(course);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return course;
    }
}
