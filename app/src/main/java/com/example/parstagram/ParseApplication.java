package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("7uPRHaxfxOupnVWmFI2UJre7qvJmqIoWI4sEjZbi")
                .clientKey("tfhYXbQ8NsVog8NSQwXHoZ5UtcE8aro7nHQyUfAQ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
