package com.miage.miaejb.entity;

import com.miage.miaejb.entity.Competence;
import com.miage.miaejb.entity.Equipe;
import com.miage.miaejb.entity.FichePoste;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-08T20:41:39")
@StaticMetamodel(DmdComp.class)
public class DmdComp_ { 

    public static volatile SingularAttribute<DmdComp, FichePoste> ficheposte;
    public static volatile SingularAttribute<DmdComp, Competence> competence;
    public static volatile SingularAttribute<DmdComp, Long> id;
    public static volatile SingularAttribute<DmdComp, Equipe> equipe;
    public static volatile SingularAttribute<DmdComp, String> status;

}