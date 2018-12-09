package ne.petclinic.service;

import ne.petclinic.model.Owner;
import ne.petclinic.model.Person;

public interface PersonRepo <T extends Person> extends RepoService<T, Long> {
    T findByLastName(String name);
}
