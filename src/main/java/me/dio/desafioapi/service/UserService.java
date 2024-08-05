package me.dio.desafioapi.service;

import me.dio.desafioapi.domain.model.User;

public interface UserService {

    User findById (Long id);

    User create(User userToCreate);
}
