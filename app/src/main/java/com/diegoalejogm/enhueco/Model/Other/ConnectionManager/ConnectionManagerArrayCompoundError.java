package com.diegoalejogm.enhueco.Model.Other.ConnectionManager;

public class ConnectionManagerArrayCompoundError
{
    public final Exception error;
    public final ConnectionManagerArrayRequest request;

    public ConnectionManagerArrayCompoundError(Exception error, ConnectionManagerArrayRequest request)
    {
        this.error = error;
        this.request = request;
    }
}