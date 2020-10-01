package com.hachi.jpa.entity;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public class BaseEntity implements Serializable {
    private Integer recordVersionNo;
    private Date creatingDatetime;
    private String creatingUserId;
    private Date lastUpdatingDatetime;
    private String lastUpdatingUserId;
    private Date deletingDatetime;

    public Integer getRecordVersionNo() {
        return recordVersionNo;
    }

    public void setRecordVersionNo(Integer recordVersionNo) {
        this.recordVersionNo = recordVersionNo;
    }

    public Date getCreatingDatetime() {
        return creatingDatetime;
    }

    public void setCreatingDatetime(Date creatingDatetime) {
        this.creatingDatetime = creatingDatetime;
    }

    public String getCreatingUserId() {
        return creatingUserId;
    }

    public void setCreatingUserId(String creatingUserId) {
        this.creatingUserId = creatingUserId;
    }

    public Date getLastUpdatingDatetime() {
        return lastUpdatingDatetime;
    }

    public void setLastUpdatingDatetime(Date lastUpdatingDatetime) {
        this.lastUpdatingDatetime = lastUpdatingDatetime;
    }

    public String getLastUpdatingUserId() {
        return lastUpdatingUserId;
    }

    public void setLastUpdatingUserId(String lastUpdatingUserId) {
        this.lastUpdatingUserId = lastUpdatingUserId;
    }

    public Date getDeletingDatetime() {
        return deletingDatetime;
    }

    public void setDeletingDatetime(Date deletingDatetime) {
        this.deletingDatetime = deletingDatetime;
    }
}
