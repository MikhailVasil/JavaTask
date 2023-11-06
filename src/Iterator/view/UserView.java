package Iterator.view;

import Iterator.data.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnconsole(List<T> list);
}