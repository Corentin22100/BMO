package com.yourcompany.bmo.model;
import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
@Embeddable
@Getter @Setter // This makes all fields below publicly accessible
public class Matchs {
	
	@Column(length=50) @Required
	String nomEquipeOuJoueur1;
	
	@Column(length=50) @Required
	String nomEquipeOuJoueur2;
	
}
