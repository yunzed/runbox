package com.topcall.runbox.domain;

import java.io.Serializable;

public class Task implements Serializable {
    public static final int STATUS_NORMAL = 0;
    public static final int STATUS_DRAFT = 1;
    public static final int STATUS_REVOKED = 2;

    private long id;
    private long project;
    private long owner;
    private long parent;
    private String name;
    private String desc;
    private int status;
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

    public long getOwner() {
        return owner;
    }

    public void setOwner(long owner) {
        this.owner = owner;
    }

    public long getParent() {
        return parent;
    }

    public void setParent(long parent) {
        this.parent = parent;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
