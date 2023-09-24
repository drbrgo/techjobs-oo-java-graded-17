package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField {

//    private int id;
//    private static int nextId = 1;
//    private String value;

//    public Location() {
//        id = nextId;
//        nextId++;
//    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.
    // i think this satisfies the requirements of the assignment, but it seems pretty weak in that it would allow for
    // the same location to be repeated with various ids

//    public Location(String value) {
//        this();
//        this.value = value;
//    }
    public Location(String value) {
        super(value);
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return "Location: " + getValue() + newLine +
                "ID: " + getId();
    }

    //need to test for equality, not identity! reference check(identity); null check; class check; cast as location; compare id
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null) return false;
//        if (!(o instanceof Location)) return false;
//        Location location = (Location) o;
//        return getId() == location.getId();
//    }
//
//    //hopefully this is adequate
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }

    //auto-generated below...
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Location location = (Location) o;
//        return id == location.id && Objects.equals(value, location.value);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, value);
//    }

    // Getters and Setters:

//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

}
