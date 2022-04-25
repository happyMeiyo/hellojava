package com.tuya.lesson.java.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * film_actor
 * @author 
 */
@Data
public class FilmActorKey implements Serializable {
    private Short actorId;

    private Short filmId;

    private static final long serialVersionUID = 1L;
}