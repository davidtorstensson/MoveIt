package com.mygdx.moveit.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.ContactListener;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.moveit.box2d.UserData;

/**
 * Created by b_bal on 2017-09-19.
 */
public abstract class GameActor extends Actor{
    protected Body body;
    protected UserData userData;

    public GameActor(Body body){
        this.body = body;
        this.userData = (UserData) body.getUserData();
    }

    public abstract UserData getUserData();


}
