package JavaHomework.UserRepository;

import JavaHomework.ListAndSet.User;

public interface UserRepository {
    void save(User user);
    void deleteAll();
}
