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
            @AttributeOverride( name = "practicalPhase", column = @Column(name = "practicalphase")),
            @AttributeOverride( name = "teamName", column = @Column(name = "teamname")),
            @AttributeOverride( name = "lob", column = @Column(name = "lob")),
            @AttributeOverride( name = "managerName", column = @Column(name = "managername")),
            @AttributeOverride( name = "managerInumber", column = @Column(name = "managerinumber")),
            @AttributeOverride( name = "techStack", column = @Column(name = "techstack"))
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
