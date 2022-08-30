package com.mapper;

import com.pojo.Carbon;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CarbonMapper {

    @Select("Select * from carbon")
    @ResultMap("carbonResultMap")
    List<Carbon> selectAll();

    @Select("select * from carbon where id = #{id}")
    @ResultMap("carbonResultMap")
    Carbon selectOne(@Param("id") String id);

    @Insert("insert into carbon values (#{id},0,0,0,0,0,0,0)")
    void add(@Param("id") String id);

    @Update("update carbon set punch_the_clock = #{punchTheClock},water = #{water},electric = #{electric},go_out = #{goOut}," +
            "retrieve = #{retrieve},bale = #{bale},commonweal = #{commonweal} where id = #{id};")
    void update(Carbon carbon);
}
