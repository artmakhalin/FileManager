package com.makhalin.filemanager;

public interface UserInterface {

    void start();
    void subscribe(UIEventHandler handler);
    void display(String message);
}
