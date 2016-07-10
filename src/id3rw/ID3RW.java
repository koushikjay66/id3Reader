/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id3rw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import jdk.management.resource.internal.inst.FileInputStreamRMHooks;

/**
 *
 * @author Koushik
 */
public class ID3RW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        File f=new File("C:\\Users\\Koushik\\Downloads\\Music\\ds.mp3");
        
        readID3 id=new readID3(f);
        
        System.out.println(id.id3Exists());
    }
    
}
