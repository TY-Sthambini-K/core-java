  
package com.tyss.exception.resources;

import java.io.FileOutputStream;

public class TryWithResources {    
public static void main(String args[]){      
        // Using try-with-resources  
try(FileOutputStream fs =new FileOutputStream("E:\\java nots\\Exception1")){      
String msg = "Trying with resources";      
byte byteArray[] = msg.getBytes(); //converting string into byte array      
fs.write(byteArray);  
System.out.println("Message written to file successfuly!");      
}catch(Exception exception){  
       System.out.println(exception);  
}      
}      
}    