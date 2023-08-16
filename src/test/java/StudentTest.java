import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    private Student emptystudent;
    private Student createdStudent;


    @Before
    public void startUp() {
        createdStudent = new Student("ty oneal", 1);

        createdStudent.addGrade(45);
        createdStudent.addGrade(88);
        createdStudent.addGrade(75);
    }

    @Test
    public void testStudentConstructor() {
        assertNotNull(createdStudent);
        assertNotNull(createdStudent.getName());
    }

    @Test
    public void testStudentGetters() {
        assertEquals(createdStudent.getName(), "ty oneal");
        assertEquals(createdStudent.getId(), 1);
    }

    @Test
    public void testStudentGrades() {
        assertNotNull(createdStudent.getGrades());
        assertEquals(createdStudent.getGradeAverage(), 69.33333333333333, .00000001);
    }

}
