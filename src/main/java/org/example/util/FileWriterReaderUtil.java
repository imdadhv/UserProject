package org.example.util;

import org.example.domain.entity.User;

import java.io.*;
import java.util.List;

import static org.example.util.FileDirectory.FILE_PATH;

public class FileWriterReader {
    private static final String path = FILE_PATH;

    public static <T> boolean writeObject(T object) {
        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(object);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static List<User> readObject() {
        try (FileInputStream fis = new FileInputStream(path);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (List<User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
