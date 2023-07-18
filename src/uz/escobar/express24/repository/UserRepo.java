package uz.escobar.express24.repository;

import uz.escobar.express24.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface UserRepo {
    List<User> USERS = new ArrayList<>();

   Optional<User> getByPhoneNumber(String phoneNumber);
}
