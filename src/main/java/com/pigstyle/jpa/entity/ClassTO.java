package com.pigstyle.jpa.entity;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "T_CLASS")
public class ClassTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="STU_ID", nullable = true)
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
