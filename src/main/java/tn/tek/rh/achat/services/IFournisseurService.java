package tn.tek.rh.achat.services;

import tn.tek.rh.achat.entities.Fournisseur;

import java.util.List;

public interface IFournisseurService {

	List<Fournisseur> retrieveAllFournisseurs();

	Fournisseur addFournisseur(Fournisseur f);

	void deleteFournisseur(Long id);

	Fournisseur updateFournisseur(Fournisseur f);

	Fournisseur retrieveFournisseur(Long id);
	
	void assignSecteurActiviteToFournisseur(Long idSecteurActivite, Long idFournisseur);

}
