package com.gs.tfs.rest.model.res;

/**
 * author: gayan
 * created: 2023-09-24
 **/
public class ResponsePack<T>
{
    private final int status;
    private final String message;
    private final T data;

    public ResponsePack(int status, String message, T data)
    {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus()
    {
        return status;
    }

    public String getMessage()
    {
        return message;
    }

    public T getData()
    {
        return data;
    }
}
