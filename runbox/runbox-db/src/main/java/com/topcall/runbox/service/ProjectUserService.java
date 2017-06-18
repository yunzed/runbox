package com.topcall.runbox.service;

import com.topcall.runbox.domain.ProjectUser;
import com.topcall.runbox.mapper.ProjectUserMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectUserService {
    private final static Logger log =Logger.getLogger(ProjectUserService.class);

    @Autowired
    private ProjectUserMapper projectUserMapper;

    public ProjectUser select(long id) {
        log.info("select id=" + id);
        return projectUserMapper.select(id);
    }

    public List<ProjectUser> selectMulti(String ids) {
        log.info("select multi ids=" + ids);
        return projectUserMapper.selectMulti(ids);
    }

    public ProjectUser insert(ProjectUser item) {
        projectUserMapper.insert(item);
        return item;
    }

    public void remove(ProjectUser item) {
        projectUserMapper.remove(item.getId());
    }
}
