package com.mygdx.moveit.box2d;

import com.badlogic.gdx.math.Vector2;
import com.mygdx.moveit.enums.UserDataType;
import com.mygdx.moveit.utils.Constants;

/**
 * Created by b_bal on 2017-09-28.
 */
public class RunnerUserData extends UserData {
    private Vector2 jumpingLinearImpulse;

    public RunnerUserData(){
        super();
        jumpingLinearImpulse = Constants.RUNNER_JUMPING_LINEAR_IMPULSE;
        userDataType=userDataType.RUNNER;
    }

    public Vector2 getJumpingLinearImpulse(){
        return jumpingLinearImpulse;
    }

    public void setJumpingLinearImpulse(Vector2 jumpingLinearImpulse){
        this.jumpingLinearImpulse = jumpingLinearImpulse;
    }

}
