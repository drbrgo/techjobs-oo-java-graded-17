package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField{

//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }
//
//    public PositionType(String value) {
//        this();
//        this.value = value;
//    }

    public PositionType(String value) {
        super(value);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    @Override
    public String toString() {
//        String newLine = System.lineSeparator();
//        return "Position Type: " + value + newLine +
//                "Id: " + id;
        //commented out the above to that all 9 tests of TestTaskTwo would pass
        return getValue();
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null) return false;
//        if (!(o instanceof PositionType)) return false;
//        PositionType positionType = (PositionType) o;
//        return getId() == positionType.getId();
//    }
//
//    //hopefully this is adequate
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
//
//    // Getters and Setters:
//
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
