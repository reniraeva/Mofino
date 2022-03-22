package com.mofino.springboot.mofino.service;

import com.mofino.springboot.mofino.entities.models.service.UserServiceModel;

public interface UserService {

    boolean registerUser(UserServiceModel userServiceModel);

    UserServiceModel loginUser(UserServiceModel userServiceModel);

}
