package com.miage.miaejb.entity;

import com.miage.miaejb.entity.Candidat;
import com.miage.miaejb.entity.DmdComp;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-08T20:41:39")
@StaticMetamodel(Competence.class)
public class Competence_ { 

    public static volatile CollectionAttribute<Competence, Candidat> candidats;
    public static volatile SingularAttribute<Competence, Long> id;
    public static volatile ListAttribute<Competence, DmdComp> dmdComps;
    public static volatile SingularAttribute<Competence, String> nom;

}