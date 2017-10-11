package com.mygdx.moveit.box2d;

import com.mygdx.moveit.enums.UserDataType;

/**
 * Created by b_bal on 2017-09-28.
 */
public abstract class UserData {
    protected UserDataType userDataType;

    public UserData() {

    }

    public UserDataType getUserDataType(){
        return userDataType;
    }
}
