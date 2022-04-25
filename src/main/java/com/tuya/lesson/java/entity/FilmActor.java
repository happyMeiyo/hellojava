package com.tuya.lesson.java.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * @description film_actor
 * @author qingchuan
 * @date 2022-04-25
 */
public class FilmActor implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * actor_id
     */
    private Integer actorId;

    /**
     * film_id
     */
    private Integer filmId;

    /**
     * last_update
     */
    private Date lastUpdate;


    public FilmActor() {
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}