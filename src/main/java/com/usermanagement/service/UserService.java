package com.usermanagement.service;

import com.usermanagement.model.dto.response.UserResponse;
<<<<<<< Updated upstream
import com.usermanagement.model.entity.User;
=======
import com.usermanagement.model.enitity.User;
>>>>>>> Stashed changes

import java.util.List;

public interface UserService {
    public UserResponse addUser(User userDto);

//    public UserResponse updateUser(UserUpdate userDto);

    public List<UserResponse> getAllUsers();

    public UserResponse getUserById(Integer id);

    public String deleteUserById(Integer id);

}
