package com.service;

import com.pojo.Carbon;

import java.util.List;

public interface CarbonService{

    List<Carbon> selectAll();

    void add(String id);

    Carbon selectOne(String id);

    void update(Carbon carbon);
}
