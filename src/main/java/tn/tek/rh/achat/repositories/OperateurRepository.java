package tn.tek.rh.achat.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.tek.rh.achat.entities.Operateur;

@Repository
public interface OperateurRepository extends CrudRepository<Operateur, Long> {

}
