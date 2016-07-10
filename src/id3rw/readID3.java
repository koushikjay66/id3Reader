/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id3rw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Koushik
 */
public class readID3 {
    
    byte []fileContents;
    int fileLength;
    
    public readID3(File f) throws IOException{  
        fileLength=(int) f.length();
        fileContents=new byte[(int)f.length()];
        try {
            (new FileInputStream(f)).read(fileContents);
        } catch (FileNotFoundException ex) {
            System.out.println("Can't Find the File");
        }
    }//End of constructor
    
    
    public void printTags(){
        
    }
    
    public boolean id3Exists(){
        
         return "TAG".equals(getter((fileLength-128), (fileLength-125)));
    }
    
    
    private String getter(int start, int end){
        String temp="";
        for (int i = start; i < end; i++) {
            temp=temp+Character.toString((char)fileContents[i]);
        }
        System.out.println(temp);
        return temp;
    }
}// End of class
