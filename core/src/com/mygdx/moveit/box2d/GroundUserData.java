package com.mygdx.moveit.box2d;

import com.mygdx.moveit.enums.UserDataType;

/**
 * Created by b_bal on 2017-09-28.
 */
public class GroundUserData extends UserData {

    public GroundUserData(){
        super();
        userDataType = UserDataType.GROUND;
    }
}
