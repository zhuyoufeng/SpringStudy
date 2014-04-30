package com.pigstyle.jpa.dao;

import com.pigstyle.jpa.entity.TeacherTO;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeacherDAO extends JpaRepository<TeacherTO, Long> {
}
