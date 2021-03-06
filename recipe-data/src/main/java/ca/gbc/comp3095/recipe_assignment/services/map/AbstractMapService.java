package ca.gbc.comp3095.recipe_assignment.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID>{

    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

}
