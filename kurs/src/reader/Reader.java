package reader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Reader {
        private File file;

        public Reader(File file) {
            this.file = file;
        }

        public void writeOperation(String userOperation){

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsolutePath(),true))){

                bw.write(userOperation+"\n");
                bw.close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }



}
