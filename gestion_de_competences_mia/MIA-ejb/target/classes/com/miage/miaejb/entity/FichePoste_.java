package com.miage.miaejb.entity;

import com.miage.miaejb.entity.Candidature;
import com.miage.miaejb.entity.DmdComp;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-09T08:44:58")
@StaticMetamodel(FichePoste.class)
public class FichePoste_ { 

    public static volatile SingularAttribute<FichePoste, String> descPost;
    public static volatile SingularAttribute<FichePoste, String> descEnt;
    public static volatile CollectionAttribute<FichePoste, Candidature> candidatures;
    public static volatile SingularAttribute<FichePoste, DmdComp> dmdComp;
    public static volatile SingularAttribute<FichePoste, Long> id;
    public static volatile SingularAttribute<FichePoste, String> status;

}