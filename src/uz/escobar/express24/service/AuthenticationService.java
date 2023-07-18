package uz.escobar.express24.service;

import uz.escobar.express24.model.User;

public interface AuthenticationService {
    User login(String phoneNumber, String password);
    User signUp(String userName, String phoneNumber, String password);
}
