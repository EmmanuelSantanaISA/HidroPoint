package com.hidroguys.customsmackapi;

import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.chat.Chat;
import org.jivesoftware.smack.chat.ChatManager;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;
import org.jxmpp.stringprep.XmppStringprepException;


/**
 * Created by emman on 7/4/2016.
 */
public class Connection {
    public static String host;
    public static int port;
    public static String service;

    AbstractXMPPConnection connection;
    ChatManager chatmanager;
    Chat newChat;
    MyConnectionListener connectionListener;


    public Connection(String host, int port, String service) {
        this.host = host;
        this.port = port;
        this.service = service;
    }

    private void connect(String userName, String passWord) {

        XMPPTCPConnectionConfiguration.Builder configBuilder = XMPPTCPConnectionConfiguration.builder();
        configBuilder.setUsernameAndPassword(userName, passWord);
        configBuilder.setSecurityMode(ConnectionConfiguration.SecurityMode.disabled);
        try {
            configBuilder.setResource("Smack");
        } catch (XmppStringprepException ex) {

        }
        //configBuilder.setXmppDomain();
        configBuilder.setHost(host);
        configBuilder.setPort(port);
        //configBuilder.setDebuggerEnabled(true);
        connection = new XMPPTCPConnection(configBuilder.build());
        connection.addConnectionListener(connectionListener);
    }

}
