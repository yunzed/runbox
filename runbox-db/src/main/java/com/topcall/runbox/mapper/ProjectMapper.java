package com.topcall.runbox.mapper;

import com.topcall.runbox.domain.Project;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface ProjectMapper {

    @Select("SELECT * FROM im WHERE id=#{id}")
    Project select(@Param("id") long id);

    @Results({
            @Result(id=true, property = "id", column = "id"),
            @Result(property = "owner", column = "owner"),
            @Result(property = "name", column = "name"),
            @Result(property = "desc", column = "desc"),
            @Result(property = "status", column = "status"),
            @Result(property = "cts", column = "cts")
    })
    @Select("SELECT * FROM im WHERE id in (${ids})")
    List<Project> selectMulti(@Param("ids") String ids);

    @Insert("INSERT INTO project (owner, name, desc) VALUES (#{owner}, #{name}, #{desc})")
    @SelectKey(statement="select last_insert_id()", keyProperty="id", before=false, resultType=long.class)
    long insert(Project item);

    @Update("UPDATE im SET status=#2 WHERE id=#{id}")
    void revoke(@Param("id") long id);
}
