package com.yourcompany.bmo.model;
import javax.persistence.*;

import lombok.*;
@Embeddable
@Getter @Setter // This makes all fields below publicly accessible
public class PariAvanceCourse {
	@Column(length=32)
    String nomPremier;
	@Column(length=32)
    String nomSecond;
	@Column(length=32)
    String nomTroisième;
	@Column(length=32)
    String nomQuatrième;
}
