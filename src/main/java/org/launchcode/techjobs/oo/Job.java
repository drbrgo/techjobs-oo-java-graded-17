package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job () {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
//        if(name != null) {
            this.name = name;
//        } else { this.name = "Data not available";}
//        if(employer.getValue() != null) {
            this.employer = employer;
//        } else {
//            this.employer.setValue("Data not available");
//        }
//        if(location.getValue() != null) {
            this.location = location;
//        } else {
//            this.location.setValue("Data not available");
//        }
//        if(positionType != null) {
            this.positionType = positionType;
//        } else {
//            this.positionType.setValue("Data not available");
//        }
//        if(coreCompetency.getValue() != null) {
            this.coreCompetency = coreCompetency;
//        } else {
//            this.coreCompetency.setValue("Data not available");
//        }
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        if(employer.getValue() == null || employer.getValue().isBlank()) {
            employer.setValue("Data not available");
        }
        if(location.getValue() == null) {
            location.setValue("Data not available");
        }
        if(positionType.getValue() == null || positionType.getValue().isBlank()) {
            positionType.setValue("Data not available");
        }
        if(coreCompetency.getValue() == null) {
            coreCompetency.setValue("Data not available");
        }

        return newLine +
                "ID: " + id + newLine +
                "Name: " + name + newLine +
                "Employer: " + employer.getValue() + newLine +
                "Location: " + location.getValue() + newLine +
                "Position Type: " + positionType.getValue() + newLine +
                "Core Competency: " + coreCompetency.getValue() + newLine;

//        String newline = System.lineSeparator();
//        return  newline +
//                "ID: " + id + newline +
//                "Name: " + name + newline +
//                "Employer: " + employer + newline +
//                "Location: " + location.getValue() + newline +
//                "Position Type: " + positionType + newline +
//                "Core Competency: " + coreCompetency.getValue() + newline;

    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
