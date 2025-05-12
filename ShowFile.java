import java.io.*;

class ShowFile 
{
    public static void main(String args[]) throws IOException 
    {
        String source = "Hello World\n";
        byte buf[] = source.getBytes();
        FileInputStream fin;
        int i;
        try
        {
        FileOutputStream fi=new FileOutputStream("file.txt");
        for (i=0;i<buf.length;i++)
        fi.write(buf[i]);
        } catch (IOException e) 
        {
            System.out.println("An I/O Error Occurred during writing");
        }
        try 
        {
        fin=new FileInputStream(args[0]);
           }
           catch (FileNotFoundException e)
           {
           System.out.println("File Not Found");
           return;
           }
           do
           {
           i=fin.read();
           if(i!=-1)
           System.out.print((char)i);
           }while(i!=-1);
           }
           }















ksb@ksb-H410M-S2-V2:~/Anj7/OOps$ javac ShowFile.java
ksb@ksb-H410M-S2-V2:~/Anj7/OOps$ java ShowFile
Hello World









    Convert the string "Hello World\n" into a byte array.

    Write the byte array to a file named "file.txt".

    Read the filename from the command-line argument.

    Open the specified file for reading.

    Read each byte from the file and display it as a character until the end of the file is reached.
