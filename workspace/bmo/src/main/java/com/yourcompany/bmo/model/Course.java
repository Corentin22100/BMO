package com.yourcompany.bmo.model;
import javax.persistence.*;

import lombok.*;
@Embeddable
@Getter @Setter // This makes all fields below publicly accessible
public class Course {
	@Embedded
	PariSimple pariSimple;
	
	@Embedded
	PariAvanceCourse pariAvancés;
}
