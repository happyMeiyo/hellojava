package com.tuya.lesson.java.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * film_actor
 * @author 
 */
@Data
public class FilmActor extends FilmActorKey implements Serializable {
    private Date lastUpdate;

    private static final long serialVersionUID = 1L;
}