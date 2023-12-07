package tn.tek.rh.achat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.tek.rh.achat.entities.DetailFacture;

@Repository
public interface DetailFactureRepository extends JpaRepository<DetailFacture, Long> {

}
