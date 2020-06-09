package com.miage.miaejb.entity;

import com.miage.miaejb.entity.Candidature;
import com.miage.miaejb.entity.Collaborateur;
import com.miage.miaejb.entity.Competence;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-09T14:53:14")
@StaticMetamodel(Candidat.class)
public class Candidat_ { 

    public static volatile CollectionAttribute<Candidat, Candidature> candidatures;
    public static volatile SingularAttribute<Candidat, Long> id;
    public static volatile CollectionAttribute<Candidat, Competence> listCompetences;
    public static volatile SingularAttribute<Candidat, Collaborateur> collaborateur;
    public static volatile SingularAttribute<Candidat, String> nom;
    public static volatile SingularAttribute<Candidat, String> prenom;

}