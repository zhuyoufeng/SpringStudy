package com.pigstyle.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "T_SCORE")
public class ScoreTO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer score;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="STU_ID")
    private StudentTO studentTO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public StudentTO getStudentTO() {
        return studentTO;
    }

    public void setStudentTO(StudentTO studentTO) {
        this.studentTO = studentTO;
    }
}
