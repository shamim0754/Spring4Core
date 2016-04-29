package com.javaaround.impl;
 
import com.javaaround.domain.Encryption;
import org.springframework.stereotype.Component;

@Component("Des") 
public class DESEncryption implements Encryption{
 
    public void encryptData() {
        System.out.println("Encrypting data using DES Encryption");
    }
}