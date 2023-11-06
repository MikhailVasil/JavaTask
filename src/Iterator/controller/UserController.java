package Iterator.controller;

import Iterator.data.Student;
import Iterator.data.User;

public interface UserController<T extends User>{
    T create(String firstName, String secondName, String lastName);

}