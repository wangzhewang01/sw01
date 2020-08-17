package com.sw.eneity;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "teacher")
public class Teacher {
    @Id
    private String tid;
    private String tname;
    private Integer posts;
    private Integer tstate;

    public Teacher() {
    }

    public Teacher(String tid, String tname, Integer posts, Integer tstate) {
        this.tid = tid;
        this.tname = tname;
        this.posts = posts;
        this.tstate = tstate;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getPosts() {
        return posts;
    }

    public void setPosts(Integer posts) {
        this.posts = posts;
    }

    public Integer getTstate() {
        return tstate;
    }

    public void setTstate(Integer tstate) {
        this.tstate = tstate;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid='" + tid + '\'' +
                ", tname='" + tname + '\'' +
                ", posts=" + posts +
                ", tstate=" + tstate +
                '}';
    }
}
