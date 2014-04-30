package com.pigstyle.jpa.entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "T_STU")
public class StudentTO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="CLASS_ID")
    private ClassTO classTO;

    @ManyToMany(targetEntity = TeacherTO.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "TEACH_ID")
    @NotFound(action = NotFoundAction.IGNORE)
    private Set<TeacherTO> teacherTOSet;

    @ManyToOne(targetEntity = ScoreTO.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "SCORE_ID")
    @NotFound(action = NotFoundAction.IGNORE)
    private Set<ScoreTO> scoreTOSet;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ClassTO getClassTO() {
        return classTO;
    }

    public void setClassTO(ClassTO classTO) {
        this.classTO = classTO;
    }

    public Set<TeacherTO> getTeacherTOSet() {
        return teacherTOSet;
    }

    public void setTeacherTOSet(Set<TeacherTO> teacherTOSet) {
        this.teacherTOSet = teacherTOSet;
    }

    public Set<ScoreTO> getScoreTOSet() {
        return scoreTOSet;
    }

    public void setScoreTOSet(Set<ScoreTO> scoreTOSet) {
        this.scoreTOSet = scoreTOSet;
    }
}
