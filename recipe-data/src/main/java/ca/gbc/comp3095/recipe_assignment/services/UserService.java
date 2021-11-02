package ca.gbc.comp3095.recipe_assignment.services;

import ca.gbc.comp3095.recipe_assignment.model.User;

import java.util.Set;

public interface UserService extends CrudService<User, Long>{

    User findByUsername(String username);

    User findByUsernamePassword(String username, String password);

}
