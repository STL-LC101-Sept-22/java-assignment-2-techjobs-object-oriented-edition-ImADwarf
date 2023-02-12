package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;

    private String workBoss;
    private String workPlace;

    private String workPosition;

    private String workSkill;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
     this();
     this.name = name;
     this.employer = employer;
     this.location = location;
     this.positionType = positionType;
     this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }


    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        if(this.getEmployer() == null) {
            return "\n" + "OOPS! This job does not seem to exist"+"\n";
        }

        if(this.getName() != "") {
            name = this.getName();
        } else {
            name = "Data not available";
        }

        if(this.getEmployer().getValue() != "") {
            workBoss = this.getEmployer().toString();
        } else {
            workBoss = "Data not available";
        }
        if(this.getLocation().getValue() != "") {
            workPlace = this.getLocation().toString();
        } else {
            workPlace = "Data not available";
        }
        if(this.getPositionType().getValue() != "") {
            workPosition = this.getPositionType().toString();
        } else {
            workPosition = "Data not available";
        }
        if(this.getCoreCompetency().getValue() != "") {
            workSkill = this.getCoreCompetency().toString();
        } else {
            workSkill = "Data not available";
        }

        return String.format("\nID: " + this.getId() + "\n" + "Name: " + name + "\n" + "Employer: " + workBoss + "\n" + "Location: " + workPlace + "\n" + "Position Type: " + workPosition + "\n" + "Core Competency: " + workSkill + "\n");
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
