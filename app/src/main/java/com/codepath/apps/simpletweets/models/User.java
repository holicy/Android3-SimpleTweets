package com.codepath.apps.simpletweets.models;

import org.json.JSONException;
import org.json.JSONObject;

public class User
{

    private String name;
    private long uid;
    private String screenName;
    private String profileImageUrl;

    public String getName() {
        return name;
    }

    public long getUid() {
        return uid;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public static User fromJSON (JSONObject json_object)
    {
        User result = new User();

        try {
            result.name = json_object.getString("name");
            result.uid = json_object.getLong("id");
            result.screenName = json_object.getString("screen_name");
            result.profileImageUrl = json_object.getString("profile_image_url");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return result;
    }

}