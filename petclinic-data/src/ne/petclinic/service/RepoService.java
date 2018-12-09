package ne.petclinic.service;

import ne.petclinic.model.Owner;

import java.util.Set;

public interface RepoService<T, ID> {
    T findById(ID id);
    T save(T object);
    Set<T> findAll();

}
