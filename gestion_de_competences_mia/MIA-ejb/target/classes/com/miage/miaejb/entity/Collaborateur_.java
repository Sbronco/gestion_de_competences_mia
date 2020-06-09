package com.miage.miaejb.entity;

import com.miage.miaejb.entity.Candidat;
import com.miage.miaejb.entity.Equipe;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-09T14:53:14")
@StaticMetamodel(Collaborateur.class)
public class Collaborateur_ { 

    public static volatile SingularAttribute<Collaborateur, String> flag;
    public static volatile SingularAttribute<Collaborateur, Candidat> candidat;
    public static volatile SingularAttribute<Collaborateur, Long> id;
    public static volatile SingularAttribute<Collaborateur, Equipe> equipe;

}