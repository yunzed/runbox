package com.topcall.runbox.service;

import com.topcall.runbox.domain.CheckPoint;
import com.topcall.runbox.mapper.CheckPointMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckPointService {
    private final static Logger log =Logger.getLogger(CheckPointService.class);

    @Autowired
    private CheckPointMapper checkPointMapper;

    public CheckPoint select(long id) {
        log.info("select id=" + id);
        return checkPointMapper.select(id);
    }

    public List<CheckPoint> selectMulti(String ids) {
        log.info("select multi ids=" + ids);
        return checkPointMapper.selectMulti(ids);
    }

    public CheckPoint insert(CheckPoint item) {
        checkPointMapper.insert(item);
        return item;
    }

}
