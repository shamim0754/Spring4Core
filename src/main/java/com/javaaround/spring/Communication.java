package com.javaaround.spring;
import com.javaaround.domain.Messaging;
import com.javaaround.domain.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
 
@Component("communication") 
public class Communication {
 
    private Messaging messaging;
    @Autowired
    @Qualifier("Des")
    private Encryption encryption;

    public Communication(){

    } 
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