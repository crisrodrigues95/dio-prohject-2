package com.dio.diospringproject2.service;

import com.dio.diospringproject2.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}