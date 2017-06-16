package com.example.demo.model;


/**
 * handler entity model.<BR/>
 * Created by uni4love on 2017. 1. 13..
 */
public class CommonEntity { //extends AbstractPersistable<String> {

    String name;

    String description;

//    @Column(name = "modifiedDate", nullable = false)
//    Timestamp modifiedDate;

    String created_date;

    String modified_date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getModified_date() {
        return modified_date;
    }

    public void setModified_date(String modified_date) {
        this.modified_date = modified_date;
    }
}
