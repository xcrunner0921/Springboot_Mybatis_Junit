package com.example.demo.model;

import java.io.Serializable;

/**
 * Created by jonghee on 2017-06-02.
 */
public class TrackingEntity implements Serializable {
    /*
     * just increment id
     */
    //private String id;

    private String sessionId;

    /*
     * simulator_type
     *      web: web simulation
     *      log: only logging
     *      null: real service
     */
    private String simulatorType;

    private String method;

    private String uri;

    private String remoteAddr;

    private String remoteHost;

    private String createdTime;

    private String process;

    /*
     * 디바이스 실행을 위해 si 컨테이너에 넘기는 commandId
     */
    private String commandId;

    public TrackingEntity() {
    }

    public TrackingEntity(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSimulatorType() {
        return simulatorType;
    }

    public void setSimulatorType(String simulatorType) {
        this.simulatorType = simulatorType;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public String getRemoteHost() {
        return remoteHost;
    }

    public void setRemoteHost(String remoteHost) {
        this.remoteHost = remoteHost;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }
}
