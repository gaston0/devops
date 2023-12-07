package tn.tek.rh.achat.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.tek.rh.achat.entities.SecteurActivite;

@Repository
public interface SecteurActiviteRepository extends CrudRepository<SecteurActivite, Long> {

}
