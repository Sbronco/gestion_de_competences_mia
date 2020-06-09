package com.miage.miaejb.entity;

import com.miage.miaejb.entity.Collaborateur;
import com.miage.miaejb.entity.DmdComp;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-09T14:53:14")
@StaticMetamodel(Equipe.class)
public class Equipe_ { 

    public static volatile SingularAttribute<Equipe, Long> id;
    public static volatile ListAttribute<Equipe, DmdComp> dmdComps;
    public static volatile CollectionAttribute<Equipe, Collaborateur> collaborateurs;
    public static volatile SingularAttribute<Equipe, String> nomEquipe;

}