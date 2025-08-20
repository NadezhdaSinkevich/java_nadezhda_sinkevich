package reader;

import java.io.*;

public class Logger {
    private String pathDir;

    public Logger(String path) {
        this.pathDir = path;
    }

    public File createLogFile (String loginUser){

        String filename = pathDir + loginUser + ".txt";

        File file = new File(filename);
        try {

            file.createNewFile();

        } catch (IOException e) {
            System.err.println("error with create file " + e.getMessage());
        }
        return file;
    }

    public void writeOperation (String operation,String loginUser){

        if (chooseFile(loginUser) != null){
            Reader reader = new Reader(chooseFile(loginUser));
            reader.writeOperation(operation);
        }
        else {
            System.out.println("have no file to log");
        }

    }

    public File chooseFile (String loginUser){
        File fileReturn = null;

        String filename = loginUser + ".txt";
        File directory = new File(pathDir);

        if (directory.exists() && directory.isDirectory()) {

            File[] files = directory.listFiles();

            for (int i = 0; i < files.length; i++) {
                 if (files[i].isFile() && files[i].getName().equals(filename)){
                     fileReturn = files[i];
                 }
            }
        }
        else {
            System.out.println("no such dir");
            fileReturn = null;
        }
        return fileReturn;
    }
}
