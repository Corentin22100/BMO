package com.yourcompany.bmo.model;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Parier{
	@Id
	@ManyToOne( // The reference is persisted as a database relationship
			fetch=FetchType.LAZY, // The reference is loaded on demand
	        optional=false) // The reference can have no value
	@DescriptionsList // Thus the reference is displayed using a combo
    Evenements sports; // A regular Java reference
	
	@Money@Required
	BigDecimal montantDuPari;
	
	@Embedded
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