package com.helpers;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import src.main.java.com.models.User;

public class WriteToFile {
    public void Write(ArrayList<User> u ){

        try{
            int i=u.size-1;
            FileWriter= new FileWriter("./demo/data/temp.txt",true);
            writer.append("\n");
            writer.write(u.get(i).userName);
            writer.write(u.get(i).address)
        }
    }
}
