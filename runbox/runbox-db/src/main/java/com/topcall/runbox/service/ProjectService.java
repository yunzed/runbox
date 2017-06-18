package com.topcall.runbox.service;

import com.topcall.runbox.domain.Project;
import com.topcall.runbox.mapper.ProjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private final static Logger log =Logger.getLogger(ProjectService.class);

    @Autowired
    private ProjectMapper projectMapper;

    public Project select(long id) {
        log.info("select id=" + id);
        return projectMapper.select(id);
    }

    public List<Project> selectMulti(String ids) {
        log.info("select multi ids=" + ids);
        return projectMapper.selectMulti(ids);
    }

    public Project insert(Project item) {
        projectMapper.insert(item);
        return item;
    }

}
