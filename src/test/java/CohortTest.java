import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CohortTest {

    private Cohort emptyCohort;
    private Cohort actualCohort;

    @Before
    public void setUp() {
        actualCohort = new Cohort();
    }

    @Test
    public void testCohortConstructors() {
        assertNull(emptyCohort);
        assertNotNull(actualCohort);
    }

    @Test
    public void testCohortAddStudent() {
        Student actualStudent = new Student(1, "tyler");
        actualCohort.addStudent(actualStudent);
        assertEquals(Arrays.asList(actualStudent), actualCohort.getStudents());
    }

    @Test
    public void testCohortGetCohortAverage() {
        Student actualStudent = new Student(1, "tyler");

        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);

        actualCohort.addStudent(actualStudent);

        Student actualStudentTwo = new Student(1, "tyler");

        actualStudentTwo.addGrade(0);
        actualStudentTwo.addGrade(25);
        actualStudentTwo.addGrade(50);

        actualCohort.addStudent(actualStudentTwo);

        assertEquals(50, actualCohort.getCohortAverage(), 0.00000001);
    }
}
