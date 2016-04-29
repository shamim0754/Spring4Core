package com.javaaround.impl;
 
import com.javaaround.domain.Encryption;
import org.springframework.stereotype.Component;

@Component("Rsa")  
public class RSAEncryption implements Encryption{
 
    public void encryptData() {
        System.out.println("Encrypting data using RSA Encryption");
    }
}