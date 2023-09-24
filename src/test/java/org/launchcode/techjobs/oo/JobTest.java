package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    //verify both constructors
    //verify equals method
    Job testJob;
    @Before
    //Integer nextId = 1; "annotation type not applicable to this kind of declaration" is a private static int
    public void createJobObject() {
        Employer testEmployer = new Employer("Great Boss");
        Location testLocation = new Location("Choice location");
        PositionType testPositionType = new PositionType("Stimulating and immeasurably compensated");
        CoreCompetency testCoreCompetency = new CoreCompetency("All those LC101 skills");
    testJob = new Job ("Dream Job", testEmployer, testLocation, testPositionType, testCoreCompetency);
    }
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .01);
    }
    @Test
    public void testSettingJobId() {
        Employer testEmployer = new Employer("Great Boss");
        Location testLocation = new Location("Choice location");
        PositionType testPositionType = new PositionType("Stimulating and immeasurably compensated");
        CoreCompetency testCoreCompetency = new CoreCompetency("All those LC101 skills");
        Job testJob2 = new Job ("Another one", testEmployer, testLocation, testPositionType, testCoreCompetency);
        assertNotEquals(testJob.getId(), testJob2.getId());
    }

  //  @Test
//    public void testSettingJobId2() {
//        Employer testEmployer = new Employer("Great Boss");
//        Location testLocation = new Location("Choice location");
//        PositionType testPositionType = new PositionType("Stimulating and immeasurably compensated");
//        CoreCompetency testCoreCompetency = new CoreCompetency("All those LC101 skills");
//        Job testJob2 = new Job ("Another one", testEmployer, testLocation, testPositionType, testCoreCompetency);
//        assertEquals(2, testJob2.getId());
  //  } commented this out as it would fail: expected value of 2, actual value of 8

    @Test
    public void testJobConstructorSetsAllFields() {
        //assertNotNull(testJob.getName());
        assertEquals("Dream Job", testJob.getName());
        assertEquals("Great Boss", testJob.getEmployer().getValue());
        assertEquals("Choice location", testJob.getLocation().getValue());
        assertEquals("Stimulating and immeasurably compensated", testJob.getPositionType().getValue());
        assertEquals("All those LC101 skills", testJob.getCoreCompetency().getValue());
    }

//    @Test
//    public void employerConstructorTest() {
//        assertEquals("Great Boss", testJob.getEmployer().getValue());
//    }
//
//    @Test
//    public void locationConstructorTest() {
//        assertEquals("Choice location", testJob.getLocation().getValue());
//    }
//
//    @Test
//    public void positionTypeConstructorTest() {
//        assertEquals("Stimulating and immeasurably compensated", testJob.getPositionType());
//    }
//
//    @Test
//    public void coreCompConstructorTest() {
//        assertEquals("All those LC101 skills", testJob.getCoreCompetency());
//    }

    //how to test for equality when id number is automatically generated and no duplicates can be made?
    //make a reference to the object with a new variable?
    @Test
    public void testJobsForEquality() {
        Employer testEmployer = new Employer("Great Boss");
        Location testLocation = new Location("Choice location");
        PositionType testPositionType = new PositionType("Stimulating and immeasurably compensated");
        CoreCompetency testCoreCompetency = new CoreCompetency("All those LC101 skills");
        Job testJob2 = new Job ("Another one", testEmployer, testLocation, testPositionType, testCoreCompetency);
        assertTrue(testJob != testJob2);
    }

    @Test
    public void testJobsForEquality2() {
        Job shellJob = testJob;
        assertTrue(shellJob.equals(testJob));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
//        assertEquals(lineSeparator(), testJob.toString().charAt(0));
//        assertEquals(lineSeparator(), testJob.toString().charAt(testJob.toString().length()-1));
        String firstChar = String.valueOf(testJob.toString().charAt(0));
        String lastChar = String.valueOf(testJob.toString().charAt(testJob.toString().length()-1));
        int otherwise = testJob.toString().indexOf(lineSeparator(), testJob.toString().length()-3);
        //assertEquals(lineSeparator(), firstChar); does not work as lineSeparators do not equal
        //assertEquals(lineSeparator(), lastChar);
        assertEquals((testJob.toString().length())-2, otherwise);
        assertEquals(0, testJob.toString().indexOf(lineSeparator()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        assertTrue(testJob.toString().contains("ID: " + testJob.getId()));
        assertTrue(testJob.toString().contains("Name: " +testJob.getName()));
        assertTrue(testJob.toString().contains("Employer: " + testJob.getEmployer().getValue()));
        assertTrue(testJob.toString().contains("Location: " + testJob.getLocation().getValue()));
        assertTrue(testJob.toString().contains("Position Type: " + testJob.getPositionType().getValue()));
        assertTrue(testJob.toString().contains("Core Competency: " + testJob.getCoreCompetency().getValue()));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Employer testEmployer = new Employer("Great Boss");
        Location testLocation = new Location("Choice location");
        PositionType testPositionType = new PositionType(null);
        CoreCompetency testCoreCompetency = new CoreCompetency("All those LC101 skills");
        Job testJob2 = new Job ("Another one", testEmployer, testLocation, testPositionType, testCoreCompetency);
        assertTrue(testJob2.toString().contains("Data not available"));
    }
}
