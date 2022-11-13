import template.uat.RandomPassGen;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        RandomPassGen passGen = new RandomPassGen();
        passGen.setPassword(passGen.generatePass(10,1,2,3));
        FileOutputStream fos = new FileOutputStream("src/test/resources/test.txt", true);
        fos.write(passGen.getPassword().getBytes());
        fos.close();
    }
}
