package javaguides.springboot.service;

import javaguides.springboot.model.User;
import javaguides.springboot.web.dto.UserRegistrationDto;

public interface UserService {

    User save(UserRegistrationDto registrationDto);

}
