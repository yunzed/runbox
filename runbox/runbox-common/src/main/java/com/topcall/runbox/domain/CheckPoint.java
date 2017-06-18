package com.topcall.runbox.domain;

import java.io.Serializable;

public class CheckPoint implements Serializable {
    private long id;
    private long project;
    private String name;
    private String desc;
    private long ts;
    private int percent;
    private long cts;
    private long uts;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProject() {
        return project;
    }

    public void setProject(long project) {
        this.project = project;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public long getCts() {
        return cts;
    }

    public void setCts(long cts) {
        this.cts = cts;
    }

    public long getUts() {
        return uts;
    }

    public void setUts(long uts) {
        this.uts = uts;
    }
}
