package ca.gbc.comp3095.recipe_assignment.model;


import javax.persistence.*;

@Entity
@Table
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column
    private String recipe_name;

    @Column
    private int prep_time;

    @Column
    private int cook_time;

    @Column
    private int total_time;

    @Lob
    @Column
    private String ingredients;

    @Lob
    @Column
    private String steps;

}
