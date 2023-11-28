package com.app.mapper;

import org.springframework.stereotype.Component;

import com.app.Entities.RespConcours;
import com.app.dto.DtoRequestRespo;
import com.app.dto.DtoResponseRespo;
@Component

public class MapperRespo {
	public RespConcours requestRespoConcoursToRespoConcours(DtoRequestRespo dtoRequestRespoConcours) {
		   RespConcours respoConcours=new RespConcours();
		   respoConcours.setNom(dtoRequestRespoConcours.getNom());
		   respoConcours.setPrenom(dtoRequestRespoConcours.getPrenom());
		   respoConcours.setEmail(dtoRequestRespoConcours.getEmail());
		   respoConcours.setMdp(dtoRequestRespoConcours.getMdp());
		  
		   return respoConcours;
	}
	 public DtoResponseRespo RespoConcoursToResponseDto(RespConcours respoconcours) {
		   DtoResponseRespo	dtoResponseRespo =new DtoResponseRespo();
		   dtoResponseRespo.setId(respoconcours.getId());
		   dtoResponseRespo.setNom(respoconcours.getNom());
		   dtoResponseRespo.setPrenom(respoconcours.getPrenom());
		   dtoResponseRespo.setEmail(respoconcours.getEmail());
		   dtoResponseRespo.setMdp(respoconcours.getMdp());
		  


			return dtoResponseRespo;
		} 
}
