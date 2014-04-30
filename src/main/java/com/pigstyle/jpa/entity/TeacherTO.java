package com.pigstyle.jpa.entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "T_TEACH")
public class TeacherTO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne(targetEntity = StudentTO.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "STU_ID")
    @NotFound(action = NotFoundAction.IGNORE)
    private Set<StudentTO> studentTOSet;

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

    public Set<StudentTO> getStudentTOSet() {
        return studentTOSet;
    }

    public void setStudentTOSet(Set<StudentTO> studentTOSet) {
        this.studentTOSet = studentTOSet;
    }
}
