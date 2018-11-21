package com.grigoryevdev.test.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "access_log")
public class AccessLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "access_date")
    private LocalDate date;

    @Column(name = "ip_address")
    private String ipAddress;

    @Column(name = "request")
    private String request;

    @Column(name = "status")
    private String status;

    @Column(name = "user_agent")
    private String userAgent;

    public AccessLog() {
    }

    public AccessLog(LocalDate date, String ipAddress, String request, String status, String userAgent) {
        this.date = date;
        this.ipAddress = ipAddress;
        this.request = request;
        this.status = status;
        this.userAgent = userAgent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

}
