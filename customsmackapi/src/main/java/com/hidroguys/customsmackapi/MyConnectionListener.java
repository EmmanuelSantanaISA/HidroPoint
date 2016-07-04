package com.hidroguys.customsmackapi;

import org.jivesoftware.smack.XMPPConnection;

/**
 * Created by emman on 7/4/2016.
 */
public class MyConnectionListener implements org.jivesoftware.smack.ConnectionListener {
    @Override
    public void connected(XMPPConnection connection) {

    }

    @Override
    public void authenticated(XMPPConnection connection, boolean resumed) {

    }

    @Override
    public void connectionClosed() {

    }

    @Override
    public void connectionClosedOnError(Exception e) {

    }

    @Override
    public void reconnectionSuccessful() {

    }

    @Override
    public void reconnectingIn(int seconds) {

    }

    @Override
    public void reconnectionFailed(Exception e) {

    }
}
