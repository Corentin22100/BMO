package com.yourcompany.bmo.model;
import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
@Embeddable
@Getter @Setter // This makes all fields below publicly accessible
public class PariAvanceTennis {
	@Column(length=1)@Required
	int scoreJoueur1PremierSet;
	@Column(length=1)@Required
	int scoreJoueur2PremierSet;
	@Column(length=32)@Required
    String vainqueurPremierSet; // nom du vainqueur ou égalité
	@Column(length=1)
	int scoreJoueur1DeuxièmeSet;
	@Column(length=1)
	int scoreJoueur2DeuxièmeSet;
	@Column(length=32)
    String vainqueurDeuxièmeSet; 
	@Column(length=1)
	int scoreJoueur1TroisièmeSet;
	@Column(length=1)
	int scoreJoueur2TroisièmeSet;
	@Column(length=32)
    String vainqueurTroisièmeSet; 
	

}
