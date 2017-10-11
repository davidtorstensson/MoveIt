package com.mygdx.moveit.utils;

import com.badlogic.gdx.physics.box2d.Body;
import com.mygdx.moveit.box2d.UserData;
import com.mygdx.moveit.enums.UserDataType;

/**
 * Created by b_bal on 2017-09-29.
 */
public class BodyUtils {

    public static boolean bodyIsRunner(Body body) {
        UserData userData = (UserData) body.getUserData();

        return userData != null && userData.getUserDataType() == UserDataType.RUNNER;
    }

    public static boolean bodyIsGround(Body body) {
        UserData userData = (UserData) body.getUserData();

        return userData != null && userData.getUserDataType() == UserDataType.GROUND;
    }

}