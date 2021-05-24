package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JobTest {
    Job jobOne;
    Job jobTwo;
    @Before
    public void setupTest(){
        jobOne = new Job();
        jobTwo = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertFalse(jobOne.getId() == jobTwo.getId());
        assertTrue(jobTwo.getId() - jobOne.getId() == 1 );

    }
    @Test
    public void testJobConstructorSetsAllFields() {
       Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
assertTrue(job.getName() == "Product tester");
        assertTrue(job.getName() == "Product tester");
        assertTrue(job.getEmployer().getValue() == "ACME");
        assertTrue(job.getLocation().getValue() == "Desert");
        assertTrue(job.getPositionType().getValue() == "Quality control");
        assertTrue(job.getCoreCompetency().getValue() == "Persistence");

    }
    @Test
    public void testJobsForEquality(){
        assertFalse(jobOne.equals(jobTwo));
    }
}
