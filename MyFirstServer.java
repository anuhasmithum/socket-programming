/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstserver;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class MyFirstServer {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("Hellow world");
        final int PORT = 10005;
        try{
            System.out.println("About to create the server socket...");
            ServerSocket server = new ServerSocket(PORT);
            System.out.println("Server socket created");
            
            System.out.println("About ot accept...");
            Socket client = server.accept();
            System.out.println("Accept is returned!..");
            
            Date today = new Date();
            PrintWriter out = new PrintWriter(client.getOutputStream());
            out.println("Hello, I'm server.My time is "+ today);
            out.flush();
            System.out.println("SEnt Date time"+ today);
            
            client.close();
            System.out.println("Closed the connetion");
            
            // DataOutputStream os = new DataOutputStream(client.getOutputStream());
        }
        catch(IOException ex){
            //Logger.getLogger(MyFirstServer.class.getName()).log(Level.SEVRE, null, ex);
            System.out.println("nn");
        }
    }
}