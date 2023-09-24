package com.gs.tfs.rest.model.task;

/**
 * author: gayan
 * created: 2023-09-24
 **/
public class Task
{
    private String taskCode;
    private long taskId;
    private String taskSummary;
    private String taskDesc;
    private long projectId;
    private String createdAt;
    private long createdUser;
    private long assignedUser;

    public String getTaskCode()
    {
        return taskCode;
    }

    public void setTaskCode(String taskCode)
    {
        this.taskCode = taskCode;
    }

    public long getTaskId()
    {
        return taskId;
    }

    public void setTaskId(long taskId)
    {
        this.taskId = taskId;
    }

    public String getTaskSummary()
    {
        return taskSummary;
    }

    public void setTaskSummary(String taskSummary)
    {
        this.taskSummary = taskSummary;
    }

    public String getTaskDesc()
    {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc)
    {
        this.taskDesc = taskDesc;
    }

    public String getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt(String createdAt)
    {
        this.createdAt = createdAt;
    }

    public long getCreatedUser()
    {
        return createdUser;
    }

    public void setCreatedUser(long createdUser)
    {
        this.createdUser = createdUser;
    }

    public long getAssignedUser()
    {
        return assignedUser;
    }

    public void setAssignedUser(long assignedUser)
    {
        this.assignedUser = assignedUser;
    }

    public long getProjectId()
    {
        return projectId;
    }

    public void setProjectId(long projectId)
    {
        this.projectId = projectId;
    }

    @Override
    public String toString()
    {
        return "Task{" +
                "taskId='" + taskId + '\'' +
                ", taskSummary='" + taskSummary + '\'' +
                ", taskDesc='" + taskDesc + '\'' +
                ", projectId=" + projectId +
                ", createdAt='" + createdAt + '\'' +
                ", createdUser=" + createdUser +
                ", assignedUser=" + assignedUser +
                '}';
    }
}
