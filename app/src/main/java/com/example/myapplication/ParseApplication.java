package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("6rTdSGJko4RTaA3mQh59k6kJNZmN4oBSLSWC9Un9")
                .clientKey("UyWvGKB3a4bTviRnNE0IEl3BexZ6lhbYWhJrUwIB")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
