package com.tuya.lesson.java.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * actor
 * @author 
 */
@Data
public class Actor implements Serializable {
    private Short actorId;

    private String firstName;

    private String lastName;

    private Date lastUpdate;

    private static final long serialVersionUID = 1L;
}