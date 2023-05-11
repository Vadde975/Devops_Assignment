package com.example.scholardevopstest.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Scholar {
    @Id
    @Column(name = "I_number")
    private String I_number;

    @Column(name = "Scholar_Name")
    private String name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "cgpa", column = @Column(name = "cgpa")),
            @AttributeOverride( name = "stream", column = @Column(name = "stream")),
            @AttributeOverride( name = "batch", column = @Column(name = "batch"))
    })
    private Academics academics;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "PracticalPhase", column = @Column(name = "practicalphase")),
            @AttributeOverride( name = "TeamName", column = @Column(name = "teamname")),
            @AttributeOverride( name = "Lob", column = @Column(name = "lob")),
            @AttributeOverride( name = "ManagerName", column = @Column(name = "managername")),
            @AttributeOverride( name = "ManagerInumber", column = @Column(name = "managerinumber")),
            @AttributeOverride( name = "TechStack", column = @Column(name = "techstack"))
    })
    private CurrentPracticalPhase currentPracticalPhase;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "vtName", column = @Column(name = "vtname")),
            @AttributeOverride( name = "vtInumber", column = @Column(name = "vtinumber"))
    })
    private VTManger vtManger;

    @Column(name = "vtproject")
    private String vtproject;

}
