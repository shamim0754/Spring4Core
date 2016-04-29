package com.javaaround.spring;
import com.javaaround.domain.Messaging;
import com.javaaround.domain.Encryption;
 
 
public class Communication {
 
    private Messaging messaging;
    private Encryption encryption;
      
     /*
     * DI via Setter
     */
    public void setMessaging(Messaging messaging){
        this.messaging = messaging;
    }

    /*
     * DI via Constructor Injection
     */
    public Communication(Encryption encryption){
        this.encryption = encryption;
    }

     
    public void communicate(){
        //encrypt data
        encryption.encryptData();

        //send message
        messaging.sendMessage();

    }

    
}