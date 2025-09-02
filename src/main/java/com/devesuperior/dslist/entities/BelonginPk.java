package com.devesuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;
@Embeddable
public class BelonginPk {
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Games games;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;
    public BelonginPk(Games games, GameList list) {
        this.games = games;
        this.list = list;
    }

    public BelonginPk(){

    }

    public Games getGames() {
        return games;
    }

    public void setGames(Games games) {
        this.games = games;
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelonginPk that = (BelonginPk) o;
        return Objects.equals(getGames(), that.getGames()) && Objects.equals(getList(), that.getList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGames(), getList());
    }
}
