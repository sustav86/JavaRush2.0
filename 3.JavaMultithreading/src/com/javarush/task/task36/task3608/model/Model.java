package com.javarush.task.task36.task3608.model;

/**
 * Created by ukr-sustavov on 26.07.2017.
 */
public interface Model {
    ModelData getModelData();
    void loadUsers();
    void loadDeletedUsers();
    void loadUserById(long userId);
}
