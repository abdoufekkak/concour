package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoResponseRespo {
	private Integer Id;
	private String Email;
	private String mdp;
	private String Nom;
	private String Prenom;
	
}
