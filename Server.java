package com.company;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {


        System.out.println("about to create the server...");
        ////////
        ServerSocket server = new ServerSocket(5001);
        System.out.println("created");

        System.out.println("about to accept...");
        ///////
        Socket client = server.accept();
        System.out.println("accept is returned!!");

        Date today = new Date();
        /////
        PrintWriter out = new PrintWriter(client.getOutputStream());
        out.println("hello im server,  my time is "+ today );
        out.flush();
        System.out.println("data send time "+ today);


        client.close();

        System.out.println("Close the server..");


    }
}


