package com.topcall.runbox.service;

import com.topcall.runbox.domain.Task;
import com.topcall.runbox.mapper.TaskMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final static Logger log =Logger.getLogger(TaskService.class);

    @Autowired
    private TaskMapper taskMapper;

    public Task select(long id) {
        log.info("select id=" + id);
        return taskMapper.select(id);
    }

    public List<Task> selectMulti(String ids) {
        log.info("select multi ids=" + ids);
        return taskMapper.selectMulti(ids);
    }

    public Task insert(Task item) {
        taskMapper.insert(item);
        return item;
    }

}
