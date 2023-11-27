package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entities.Inscription;
import com.app.dto.DtoRequestInscription;
import com.app.dto.DtoResponseInscription;
import com.app.exception.Exception404;
import com.app.mapper.MapperInsciption;
import com.app.repo.RepoInscription;

@Service
public class ServiceInscription {
	@Autowired
	MapperInsciption mapperInsciption;
	@Autowired 
	RepoInscription repoInscription;
	
	public void deleteEtudiant(Integer id ){
		 Inscription kk = repoInscription.findById(id).orElse(null); 
		if(kk==null) { throw new Exception404("etudiant not found");}
		repoInscription.delete(kk);	
		}
	public List<Inscription> getAll(){
		return repoInscription.findAll();
	}
	public  DtoResponseInscription addInscription(DtoRequestInscription dtoRequestInscription) {	
		 Inscription kk=	mapperInsciption.requesttoInscription(dtoRequestInscription);
		 kk=repoInscription.save(kk);
		 return mapperInsciption.InscriptiontoResponse(kk);
		}
}
