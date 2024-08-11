package com.zosh.ecommerce_youtube.com.zosh.service;

import com.zosh.ecommerce_youtube.com.zosh.model.User;
import jdk.jshell.spi.ExecutionControl;

public interface UserService {
    public User findUserById(Long userId) throws UserException;
    public User findUserProfileByJwt(String jwt) throws UserException;
}
