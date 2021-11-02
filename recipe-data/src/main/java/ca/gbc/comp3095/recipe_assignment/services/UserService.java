package ca.gbc.comp3095.recipe_assignment.services;

import ca.gbc.comp3095.recipe_assignment.model.User;

import java.util.Set;

public interface UserService {

    User findById(long id);

    User findByUsername(String username);

    User findByUsernamePassword(String username, String password);

    User save(User user);

    Set<User> findAll();

}
