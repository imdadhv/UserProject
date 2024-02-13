package org.example;

import org.example.domain.entity.User;
import org.example.util.FileWriterReaderUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      User user = new User();
      user.setName("Imdad");
      List<User> list = List.of(user);
      FileWriterReaderUtil.writeObject(list);
      List<?> list1 = FileWriterReaderUtil.readList();
        System.out.println(list1);
    }
}