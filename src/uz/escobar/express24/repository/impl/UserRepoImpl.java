package uz.escobar.express24.repository.impl;

import uz.escobar.express24.model.User;
import uz.escobar.express24.repository.CRUDRepo;
import uz.escobar.express24.repository.UserRepo;

import java.util.Optional;

public class UserRepoImpl implements UserRepo, CRUDRepo<User,Long> {
    @Override
    public boolean save(User user) {
        for(User user1 : USERS) {
            if(user1.getID().equals(user.getID())) {
                return false;
            }
        }
        USERS.add(user);
        return true;
    }

    @Override
    public User getById(Long ID) {

        return null;
    }

    @Override
    public boolean update(User user, Long Id) {
        return false;
    }

    @Override
    public boolean delete(Long ID) {
        for (User user : USERS) {
            if(user.getID().equals(ID)) {
                USERS.remove(user);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<User> getByPhoneNumber(String phoneNumber) {
        return Optional.empty();
    }
}
