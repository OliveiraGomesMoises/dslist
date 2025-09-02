package com.devesuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belongin")
public class Belonging {
    @EmbeddedId
    private BelonginPk id = new BelonginPk();
    private Integer position;

    public Belonging(){

    }

    public Belonging(Games games,GameList list, Integer position) {
        this.id.setGames(games);
        this.id.setList(list);
        this.position = position;
    }

    public BelonginPk getId() {
        return id;
    }

    public void setId(BelonginPk id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(getId(), belonging.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
