package com.example.firstapi.api.service;

import com.example.firstapi.api.model.UserTo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private List<UserTo> userToList;

    public UserService(){
        userToList = new ArrayList<>();

        UserTo  userTo = new UserTo(1,"Azam",30,"azam.ahmadjonovs@gmail.com");
        UserTo  userTo2 = new UserTo(2,"Azam2",30,"azam2.ahmadjonovs@gmail.com");
        UserTo  userTo3 = new UserTo(3,"Azam3",30,"azam3.ahmadjonovs@gmail.com");
        UserTo  userTo4 = new UserTo(4,"Azam4",30,"azam4.ahmadjonovs@gmail.com");
        UserTo  userTo5 = new UserTo(5,"Azam5",30,"azam5.ahmadjonovs@gmail.com");

        userToList.addAll(Arrays.asList(userTo,userTo2,userTo3,userTo4,userTo5));
    }

    public UserTo getUser(int id) {
        return userToList.stream().filter(userTo -> id==userTo.getId()).findAny().orElse(null);
    }
}
