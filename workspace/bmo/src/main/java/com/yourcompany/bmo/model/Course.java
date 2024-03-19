package com.yourcompany.bmo.model;
import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
@Embeddable
@Getter @Setter // This makes all fields below publicly accessible
public class Course {
	@Column(length=50) @Required
	String nomParticipant1;
	
	@Column(length=50) @Required
	String nomParticipant2;
	
	@Column(length=50) @Required
	String nomParticipant3;
	
	@Column(length=50) @Required
	String nomParticipant4;
	
	@Column(length=50) @Required
	String nomParticipant5;
	
	@Column(length=50) @Required
	String nomParticipant6;
	
	@Column(length=50) @Required
	String nomParticipant7;
	
	@Column(length=50) @Required
	String nomParticipant8;
}
