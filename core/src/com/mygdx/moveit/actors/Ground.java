package com.mygdx.moveit.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.mygdx.moveit.box2d.GroundUserData;
import com.mygdx.moveit.box2d.UserData;

/**
 * Created by b_bal on 2017-09-19.
 */
public class Ground extends GameActor {

    public Ground (Body body){
        super(body);
    }

    @Override
    public GroundUserData getUserData() {
        return (GroundUserData) userData;
    }


}
