package com.yourcompany.bmo.model;
import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Pari {
	@Id
	
	@ManyToOne( // The reference is persisted as a database relationship
			fetch=FetchType.LAZY, // The reference is loaded on demand
	        optional=true) // The reference can have no value
	@DescriptionsList // Thus the reference is displayed using a combo
    Resultats sports; // A regular Java reference
}
