package com.yourcompany.bmo.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Resultats{
	@Id
	@ManyToOne( // The reference is persisted as a database relationship
			fetch=FetchType.LAZY, // The reference is loaded on demand
	        optional=false) // The reference can have no value
    Evenements sports; // A regular Java reference
	
	@Embedded@NoFrame
	PariSimple pariSimple;
	
	@Embedded
	PariAvanceFoot parisAvancésFoot;
	
	@Embedded
	PariAvanceBasket parisAvancésBasket;
	
	@Embedded
	PariAvanceTennis parisAvancésTennis;
	
	@Embedded
	PariAvanceCourse parisAvancésCoursesDeChevaux;
	
	
	

	
}
