package ca.gbc.comp3095.recipe_assignment.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
