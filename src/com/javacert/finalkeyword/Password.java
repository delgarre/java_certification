package com.javacert.finalkeyword;

public class Password {
    private static final int key = 78545165;
    private final int encryptedPass;

    public Password(int password){
        this.encryptedPass = ecryptDecrypt(password);
    }
    private int ecryptDecrypt(int password){
        return password ^ key;
    }
    public void storePassword(){
        System.out.println("Saving password as " + this.encryptedPass);
    }
    public boolean letMeIn(int password){
        if (ecryptDecrypt(password) == this.encryptedPass){
            System.out.println("Welcome");
            return true;
        }else{
            System.out.println("Nope");
            return false;
        }
    }
}
