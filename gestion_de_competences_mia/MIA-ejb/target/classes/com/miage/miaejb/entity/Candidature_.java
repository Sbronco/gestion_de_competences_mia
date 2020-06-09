package com.miage.miaejb.entity;

import com.miage.miaejb.entity.Candidat;
import com.miage.miaejb.entity.FichePoste;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-09T08:44:58")
@StaticMetamodel(Candidature.class)
public class Candidature_ { 

    public static volatile SingularAttribute<Candidature, Date> dateCandidature;
    public static volatile SingularAttribute<Candidature, Candidat> candidat;
    public static volatile SingularAttribute<Candidature, Long> id;
    public static volatile SingularAttribute<Candidature, FichePoste> fichePoste;
    public static volatile SingularAttribute<Candidature, String> status;

}