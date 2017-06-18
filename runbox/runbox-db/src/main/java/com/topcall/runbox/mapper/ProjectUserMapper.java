package com.topcall.runbox.mapper;

import com.topcall.runbox.domain.ProjectUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProjectUserMapper {

    @Select("SELECT * FROM project_user WHERE id=#{id}")
    ProjectUser select(@Param("id") long id);

    @Results({
            @Result(id=true, property = "id", column = "id"),
            @Result(property = "project", column = "project"),
            @Result(property = "uid", column = "uid"),
            @Result(property = "cts", column = "cts")
    })
    @Select("SELECT * FROM project_user WHERE id in (${ids})")
    List<ProjectUser> selectMulti(@Param("ids") String ids);

    @Insert("INSERT INTO project_user (project, uid) VALUES (#{project}, #{uid})")
    @SelectKey(statement="select last_insert_id()", keyProperty="id", before=false, resultType=long.class)
    long insert(ProjectUser item);

    @Delete("DELETE FROM project_user WHERE id=#{id}")
    void remove(long id);
}
