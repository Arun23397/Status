package com.status.Status.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Statusy {
    
	public Statusy() {}
	
    @Id
    private int statusid;
    private String userid, pagesize,uname,caption, statusurl, comment,commentid;

    public Statusy(int statusid, String uname, String userid, String statusurl, String caption, String pagesize) {
        this.caption = caption;
        this.statusid = statusid;
        this.uname = uname;
        this.userid = userid;
        this.pagesize = pagesize;
        this.statusurl = statusurl;
    }
    
    public Statusy(int statusid, String uname, String comment, String commentid) {
        this.comment = comment;
        this.commentid = commentid;
        this.statusid = statusid;
        this.uname = uname;
    }

    public String getCaption() {
        return this.caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
    
    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    public String getCommentId() {
        return this.commentid;
    }

    public void setCommentId(String commentid) {
        this.commentid = commentid;
    }
    
    public String getStatusUrl() {
        return this.statusurl;
    }

    public void setStatusUrl(String statusurl) {
        this.statusurl = statusurl;
    }
    
    public String getPageSize() {
        return this.pagesize;
    }

    public void setPageSize(String pagesize) {
        this.pagesize = pagesize;
    }
    
    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getStatusId() {
        return this.statusid;
    }

    public void setStatusId(int statusid) {
        this.statusid = statusid;
    }

    public String getUname() {
        return this.uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String toStatusString() {
        return "Status created";
    }
    
    public String toReplyString() {
        return "Replied!";
    }
}

