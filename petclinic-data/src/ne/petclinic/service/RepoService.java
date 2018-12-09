package ne.petclinic.service;

import ne.petclinic.model.Owner;

import java.util.Set;

public interface RepoService<T> {
    T findById(long id);
    T findByName(String name);
    T save(T owner);
    Set<T> findAll();

}
