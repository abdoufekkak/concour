package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entities.RespConcours;
import com.app.dto.DtoRequestRespo;
import com.app.dto.DtoResponseRespo;
import com.app.exception.Exception404;
import com.app.mapper.MapperRespo;
import com.app.repo.RepoRespo;



@Service
public class ServiceRespo {
	@Autowired
    private RepoRespo repoRespo;
    @Autowired
    private MapperRespo mapperRespo;
    public List <RespConcours> getRespoConcours(){
		return repoRespo.findAll();
	}
	
	public DtoResponseRespo AddRespoConcours(DtoRequestRespo dtoRequestRespo){
		RespConcours respoConcours= mapperRespo.requestRespoConcoursToRespoConcours(dtoRequestRespo);
		respoConcours=repoRespo.save(respoConcours);
		 return mapperRespo.RespoConcoursToResponseDto(respoConcours);
	}
	
	public void deleteRespoConcours(Integer Id) {
		RespConcours respoconcours2=repoRespo.findById(Id).orElse(null);
		if(respoconcours2==null) { throw new Exception404("Responsable de concours not found");}
	   repoRespo.delete(respoconcours2);
	}
	
	
	public DtoResponseRespo ModifyRespoConcours(DtoRequestRespo dtoRequestRespo,Integer Id){
		RespConcours respoconcours2=repoRespo.findById(Id).orElse(null);
		if(respoconcours2==null) { throw new Exception404("Responsable concours not found"); }
		RespConcours respoconcours= mapperRespo.requestRespoConcoursToRespoConcours(dtoRequestRespo);
	
		return mapperRespo.RespoConcoursToResponseDto(repoRespo.save(respoconcours));
	}
}
