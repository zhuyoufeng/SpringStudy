package com.pigstyle.jpa.dao;

import com.pigstyle.jpa.entity.ScoreTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreDAO extends JpaRepository<ScoreTO, Long> {
}
