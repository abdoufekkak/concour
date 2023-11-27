package com.app.mapper;

import org.springframework.stereotype.Component;

import com.app.Entities.Inscription;
import com.app.dto.DtoRequestInscription;
import com.app.dto.DtoResponseInscription;
@Component

public class MapperInsciption {

	public DtoResponseInscription  InscriptiontoResponse(Inscription inscription)
	{
		DtoResponseInscription jh = new DtoResponseInscription();
		
		jh.setIdConcour(inscription.getConcour().getId());
		jh.setIdEtudiant(inscription.getIdEtudiant());
		jh.setId(inscription.getId());
		return jh;
	}
	
	public Inscription  requesttoInscription(DtoRequestInscription dtoRequestInscription)
	{
		Inscription jh = new Inscription();
		
		jh.getConcour().setId(dtoRequestInscription.getIdConcour());
		jh.setIdEtudiant(dtoRequestInscription.getIdEtudiant());
		return jh;
	}
}
