package com.yourcompany.bmo.model;
import javax.persistence.*;

import lombok.*;
@Embeddable
@Getter @Setter // This makes all fields below publicly accessible
public class PariAvanceFoot {
	
	@Column(length=2)
	int scoreEquipe1MiTemps;
	@Column(length=2)
	int scoreEquipe2MiTemps;
	@Column(length=32)
    String vainqueurMiTemps; // nom du vainqueur ou égalité
	@Column(length=2)
	int scoreEquipe1Final;
	@Column(length=2)
	int scoreEquipe2Final;
}
