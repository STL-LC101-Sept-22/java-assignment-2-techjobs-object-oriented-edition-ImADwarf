package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(job.getName(),"Product tester");
        assertTrue(job.getName() instanceof String);

        assertEquals(job.getEmployer().getValue(),"ACME");
        assertTrue(job.getEmployer() instanceof Employer);

        assertEquals(job.getLocation().getValue(),"Desert");
        assertTrue(job.getLocation() instanceof Location);

        assertEquals(job.getPositionType().getValue(),"Quality control");
        assertTrue(job.getPositionType() instanceof PositionType);

        assertEquals(job.getCoreCompetency().getValue(),"Persistence");
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        Job someJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job anotherJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(someJob.equals(anotherJob));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char someChar = job.toString().charAt(0);
        char anotherChar = job.toString().charAt(0);
        assertEquals(someChar, '\n');
        assertEquals(anotherChar, '\n');
    }

}
