package com.app.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entities.RespConcours;
import com.app.dto.DtoRequestRespo;
import com.app.dto.DtoResponseRespo;
import com.app.service.ServiceRespo;

@RestController
@RequestMapping("respo/")
public class WebRespo {
	@Autowired
	ServiceRespo serviceRespo ;
	


	@GetMapping("")
	public ResponseEntity<List<RespConcours>> getRespoConcours() {
	    List<RespConcours > respoconcours = serviceRespo.getRespoConcours(); 
	    return new ResponseEntity<>(respoconcours, HttpStatus.OK);
	}

	@PostMapping("")
	public ResponseEntity<DtoResponseRespo > addRespoConcours(@RequestBody DtoRequestRespo dtoRequestRespo) {
		DtoResponseRespo dtoResponseRespo=	serviceRespo.AddRespoConcours(dtoRequestRespo);
		return  new ResponseEntity<>(dtoResponseRespo,HttpStatus.CREATED);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<DtoResponseRespo > modProf(@RequestBody DtoRequestRespo dtoRequestRespo,@PathVariable Integer id) {
		DtoResponseRespo dtoResponseRespo=	serviceRespo.ModifyRespoConcours( dtoRequestRespo,id);
		return  new ResponseEntity<>(dtoResponseRespo,HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<?> deletConcours(@PathVariable Integer id) {
			serviceRespo.deleteRespoConcours(id);
	        return ResponseEntity.noContent().build();
	}

}
