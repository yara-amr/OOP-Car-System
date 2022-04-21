/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class App1 extends javax.swing.JFrame {
    public static void main (String[] args){

        App1 CarSystemApp = new App1();
        CarSystemApp.setVisible(true);
        try{
            for(int i=0; i<=100; i++){
                Thread.sleep(50);
                SignUp signUp = new SignUp();                        
                if(i==100){              
                    CarSystemApp.dispose();
                    signUp.show();
                }
            }
        }
        catch(Exception e){}

    }
}
