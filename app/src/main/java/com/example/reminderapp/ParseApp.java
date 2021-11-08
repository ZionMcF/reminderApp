package com.example.reminderapp;

import android.app.Application;

import com.parse.Parse;


public class ParseApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("yGo0oOEybmmZxdOI9GjxUHVEvnnWdYqkzogDTzHk")
                .clientKey("KwX60ln5lBdUbuPkinDBtSZV3dMOYgRwlyJUu8kV")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
