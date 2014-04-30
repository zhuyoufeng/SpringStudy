package com.pigstyle.jpa.dao;

import com.pigstyle.jpa.entity.StudentTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<StudentTO, Long> {
}
