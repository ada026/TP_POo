package SourcePackage;

import GraphiquePackage.FichAccueil;
import GraphiquePackage.FichMenu;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static public User user;
    private static FichAccueil fichAccueil;
    private static FichMenu fichMenu;
    
    public static void main(String[] args){
    fichAccueil = new FichAccueil();
    fichAccueil.setVisible(true);

    }
    
    public static void launchUser(String pseudo){
        user = new User(pseudo);
        user.startThread();
    }
    
    
    
    public static void setFichMenu(FichMenu fichMenu1){
        fichMenu = fichMenu1;
    }
    
    public static void openFich(int port){
        fichMenu.openWindow(port);
    }  
    
    public static User getUser(){
        return user;
    }
    
    public static HashMap getUserList(){
        return user.getListUser();
    }

}