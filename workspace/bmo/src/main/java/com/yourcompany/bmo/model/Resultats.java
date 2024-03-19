package com.yourcompany.bmo.model;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Resultats{
	@Id
    @Hidden // The property is not shown to the user. It's an internal identifier
    @GeneratedValue(generator="system-uuid") // Universally Unique Identifier (1)
    @GenericGenerator(name="system-uuid", strategy = "uuid")
	@Embedded
	Basket basket;
	
	@Embedded
	Foot foot;
	
	@Embedded
	Tennis tennis;
	
	@Embedded
	Course coursesDeChevaux;
	

	
}
