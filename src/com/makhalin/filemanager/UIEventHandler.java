package com.makhalin.filemanager;

public interface UIEventHandler {

    void onList(String path);
    void onCreate(String path);
    void onDelete(String path);
}
