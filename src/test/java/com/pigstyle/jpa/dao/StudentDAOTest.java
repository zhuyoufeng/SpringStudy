package com.pigstyle.jpa.dao;

import com.pigstyle.framework.test.BaseTest;
import com.pigstyle.jpa.entity.ClassTO;
import com.pigstyle.jpa.entity.StudentTO;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.assertEquals;

public class StudentDAOTest extends BaseTest {

    @Autowired
    private ClassDAO classDAO;
    @Autowired
    private ScoreDAO scoreDAO;
    @Autowired
    private StudentDAO studentDAO;
    @Autowired
    private TeacherDAO teacherDAO;

    @Before
    public void before() {
        for (int index = 0; index < 10; index++) {
            ClassTO classTO = new ClassTO();
            classTO.setName("Class" + index);
            classDAO.save(classTO);
        }
    }

    @Test
    public void testQuery() {
        assertEquals(10, classDAO.findAll().size());
    }

}
