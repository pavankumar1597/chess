package com.pavan.chess.model;


import com.pavan.chess.enums.COlour;

public class Player extends BaseModel {
    private long id;
    private  User user;
    private COlour color;
    private Game game;

    public Player(long id, User user, COlour color) {
        this.id = id;
        this.user = user;
        this.color = color;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public COlour getColor() {
        return color;
    }

    public void setColor(COlour color) {
        this.color = color;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
