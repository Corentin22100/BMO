package com.yourcompany.bmo.model;
import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
@Embeddable
@Getter @Setter // This makes all fields below publicly accessible
public class PariAvanceBasket {
	@Column(length=3)@Required
	int scoreEquipe1PremierQuart;
	@Column(length=3)@Required
	int scoreEquipe2PremierQuart;
	@Column(length=32)@Required
    String vainqueurPremierQuart; // nom du vainqueur ou égalité
	@Column(length=3)
	int scoreEquipe1SecondQuart;
	@Column(length=3)
	int scoreEquipe2SecondQuart;
	@Column(length=32)
    String vainqueurSecondQuart; 
	@Column(length=3)
	int scoreEquipe1TroisièmeQuart;
	@Column(length=3)
	int scoreEquipe2TroisièmeQuart;
	@Column(length=32)
    String vainqueurTroisièmeQuart; 
	@Column(length=3)
	int scoreEquipe1DernierQuart;
	@Column(length=3)
	int scoreEquipe2DernierQuart;
}
