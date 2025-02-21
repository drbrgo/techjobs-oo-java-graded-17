package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField {

//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public CoreCompetency() {
//        this.id = nextId;
//        nextId++;
//    }
//
//    public CoreCompetency(String value) {
//        this();
//        this.value = value;
//    }

    public CoreCompetency(String value) {
        super(value);
    }
    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return "Skill: " + getValue() + newLine +
                "Id: " + getId();
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null) return false;
//        if (!(o instanceof CoreCompetency)) return false;
//        CoreCompetency coreCompetency = (CoreCompetency) o;
//        return getId() == coreCompetency.getId();
//    }
//
//    //hopefully this is adequate
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.


//    public String getValue() {
//        return value;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
}
