package ca.gbc.comp3095.recipe_assignment.services;

import ca.gbc.comp3095.recipe_assignment.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Recipe findById(long id);

    Recipe findByName(String recipe_name);

    Recipe findByIngredient(String ingredient);

    Set<Recipe> findAll();

}
