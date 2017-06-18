package com.topcall.runbox.mapper;

import com.topcall.runbox.domain.CheckPoint;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CheckPointMapper {

    @Select("SELECT * FROM im WHERE id=#{id}")
    CheckPoint select(@Param("id") long id);

    @Results({
            @Result(id=true, property = "id", column = "id"),
            @Result(property = "project", column = "project"),

            @Result(property = "name", column = "name"),
            @Result(property = "desc", column = "desc"),
            @Result(property = "ts", column = "ts"),
            @Result(property = "percent", column = "percent"),
            @Result(property = "cts", column = "cts"),
            @Result(property = "uts", column = "uts")
    })
    @Select("SELECT * FROM task WHERE id in (${ids})")
    List<CheckPoint> selectMulti(@Param("ids") String ids);

    @Insert("INSERT INTO task (project, owner, parent, name, desc) VALUES (#{project}, #{owner}, #{parent}, #{name}, #{desc})")
    @SelectKey(statement="select last_insert_id()", keyProperty="id", before=false, resultType=long.class)
    long insert(CheckPoint item);
}
