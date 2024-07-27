package com.salim.FakeAPI.controller.interfaces;

import java.util.List;

public interface ICommonEndPoints<T> {

    List<T> getAllData();
    T getDataById(Long id);
    T insertData(T data);
    void deleteAll();
    void deleteById(Long id);
}
