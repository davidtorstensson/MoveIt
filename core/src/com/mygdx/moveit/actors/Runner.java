package com.mygdx.moveit.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.mygdx.moveit.box2d.RunnerUserData;
import com.mygdx.moveit.box2d.UserData;

/**
 * Created by b_bal on 2017-09-19.
 */
public class Runner extends GameActor{
    private boolean jumping;

    public Runner(Body body){
        super(body);
    }

    @Override
    public RunnerUserData getUserData() {
        return (RunnerUserData) userData;
    }

    public void jump(){
        if (!jumping){
            body.applyLinearImpulse(getUserData().getJumpingLinearImpulse(), body.getWorldCenter(),true);
            jumping=true;
        }
    }

    public void landed(){
        jumping = false;
    }
}
