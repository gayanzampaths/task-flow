package com.gs.tfs.rest.model.api;

/**
 * author: gayan
 * created: 2023-09-23
 **/
public class HealthCheck
{
    private boolean status;

    public boolean getStatus()
    {
        return this.status;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "HealthCheck{" +
                "status=" + status +
                '}';
    }
}
