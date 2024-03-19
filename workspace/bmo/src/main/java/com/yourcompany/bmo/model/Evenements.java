package com.yourcompany.bmo.model;
import java.time.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Evenements {
	@Id
	@Hidden // The property is not shown to the user. It's an internal identifier
    @GeneratedValue(generator="system-uuid") // Universally Unique Identifier (1)
    @GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(length=32)
    String oid;
 
    @Column(length=50)@Required
    String description;
    
    @Required
    LocalDate date;
    
    @Column(length=6)
    int montantMaximalDuPari;
    
    @Embedded
    Matchs foot;
    
    @Embedded
    Matchs basket;
    
    @Embedded
    Matchs tennis;
    
    @Embedded
    Course courseDeChevaux;
}
