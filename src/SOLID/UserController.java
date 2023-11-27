package SOLID;

public interface UserController<T extends User>{
    T create(String firstName, String secondName, String lastName);

}