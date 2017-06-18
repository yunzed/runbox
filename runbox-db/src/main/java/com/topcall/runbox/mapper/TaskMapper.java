package com.topcall.runbox.mapper;

import com.topcall.runbox.domain.Task;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TaskMapper {

    @Select("SELECT * FROM im WHERE id=#{id}")
    Task select(@Param("id") long id);

    @Results({
            @Result(id=true, property = "id", column = "id"),
            @Result(property = "project", column = "project"),
            @Result(property = "owner", column = "owner"),
            @Result(property = "parent", column = "parent"),
            @Result(property = "name", column = "name"),
            @Result(property = "desc", column = "desc"),
            @Result(property = "status", column = "status"),
            @Result(property = "cts", column = "cts"),
            @Result(property = "uts", column = "uts")
    })
    @Select("SELECT * FROM task WHERE id in (${ids})")
    List<Task> selectMulti(@Param("ids") String ids);

    @Insert("INSERT INTO task (project, owner, parent, name, desc) VALUES (#{project}, #{owner}, #{parent}, #{name}, #{desc})")
    @SelectKey(statement="select last_insert_id()", keyProperty="id", before=false, resultType=long.class)
    long insert(Task item);
}
