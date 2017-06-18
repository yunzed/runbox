package com.topcall.runbox.domain;

import java.io.Serializable;

public class Article implements Serializable {
    public static final int STATUS_NORMAL = 0;
    public static final int STATUS_DRAFT = 1;
    public static final int STATUS_REVOKED = 2;

    private long id;
    private long owner;
    private String name;
    private String content;
    private int status;
    private long cts;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOwner() {
        return owner;
    }

    public void setOwner(long owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String desc) {
        this.content = content;
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
}
