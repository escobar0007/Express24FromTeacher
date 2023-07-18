package uz.escobar.express24.service.impl;

import uz.escobar.express24.model.User;
import uz.escobar.express24.repository.CRUDRepo;
import uz.escobar.express24.repository.UserRepo;
import uz.escobar.express24.repository.impl.UserRepoImpl;
import uz.escobar.express24.service.AuthenticationService;

public class AuthenticationsServiceImpl implements AuthenticationService {
    private final UserRepo userRepo = new UserRepoImpl();
    @Override
    public User login(String phoneNumber, String password) {
        if(!phoneNumber.substring(1).matches("[0-9]") ||
                phoneNumber.length() < 12 || password.isEmpty() ||
                password.trim().length() < 6
        ) {
            throw new IllegalArgumentException("Phone number or password invalid .");
        }
        User user = userRepo.getByPhoneNumber(phoneNumber).orElseThrow(
                IllegalArgumentException::new);

        if(user.getPassword().equals(password)) {
            return user;
        } else {
            throw new IllegalArgumentException("WrongPassword");
        }
    }

    @Override
    public User signUp(String userName, String phoneNumber, String password) {
        if(userName.isEmpty() || !phoneNumber.substring(1).matches("[0-9]") ||
                phoneNumber.length() < 12 || password.isEmpty() ||
                password.trim().length() < 6
        ) {
            throw new IllegalArgumentException("Phone number or password invalid .");
        }
        for (User user : UserRepo.USERS) {
            if(user.getPhoneNumber().equals(phoneNumber)) {
                throw new IllegalArgumentException("This user is already exist!");
            }
        }
        User user = new User();
        CRUDRepo<User, Long> crud = new UserRepoImpl();
        crud.save(user);

        return user;
    }
}
