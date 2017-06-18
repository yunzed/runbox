package com.topcall.runbox.web;

import com.topcall.runbox.domain.Project;
import com.topcall.runbox.service.ProjectService;
import com.topcall.runbox.util.Rescode;
import com.topcall.runbox.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/runbox/api/v1/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @RequestMapping(value="/create", method=RequestMethod.POST)
    public Result send(@RequestBody Project item1 ) {
        if( item1.getOwner() == 0 || item1.getName().length() == 0 ) {
            return new Result(Rescode.INVALID_PARAMETER, null);
        }

        Project item = projectService.insert(item1);
        return new Result(0, item);
    }

    @RequestMapping("/{id}")
    public Result get(@PathVariable long id) {
        if( id == 0 ) {
            return new Result(Rescode.INVALID_PARAMETER, null);
        }

        Project item = projectService.select(id);
        return new Result(0, item);
    }

    @RequestMapping("/batch/{ids}")
    public Result getMulti(@PathVariable String ids) {
        List<Long> ids2 = new ArrayList<>();
        String[] splits = ids.split(",");
        if( splits == null || splits.length == 0 ) {
            return new Result(Rescode.INVALID_PARAMETER, null);
        }

        for( int i=0; i<splits.length; i++ ) {
            long id = Long.parseLong(splits[i]);
            if( id != 0 ) {
                ids2.add(id);
            }
        }
        if( ids2.size() == 0 ) {
            return new Result(Rescode.INVALID_PARAMETER, null);
        }

        String ret = ids2.get(0).toString();
        for( int i=1; i<ids2.size(); i++ ) {
            ret += "," + ids2.get(i);
        }
        List<Project> items = projectService.selectMulti(ret);
        return new Result(0, items);
    }
}
