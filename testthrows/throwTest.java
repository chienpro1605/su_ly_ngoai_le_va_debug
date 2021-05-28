package testthrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class throwTest {
    public static void main(String[] args) {

    }

    private static void readDataFromFile() throws FileNotFoundException {
        File file = new File("data.txt");
        Scanner scanner = new Scanner(file);

    }

}

