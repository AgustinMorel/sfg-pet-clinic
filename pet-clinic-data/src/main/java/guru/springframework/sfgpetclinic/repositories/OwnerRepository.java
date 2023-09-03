package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface OwnerRepository extends CrudRepository<Owner,Long> {
    Owner findByLastName (String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}
