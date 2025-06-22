import java.io.*;
import java.util.Scanner;

public class FileTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fileName = "mydata.txt";

        System.out.println("Choose an option:\n1. Write to file\n2. Read file\n3. Append to file");
        int option = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (option) {
            case 1:
                System.out.println("Enter text to write:");
                String toWrite = sc.nextLine();
                writeFile(fileName, toWrite);
                break;

            case 2:
                readFile(fileName);
                break;

            case 3:
                System.out.println("Enter text to append:");
                String toAppend = sc.nextLine();
                appendFile(fileName, toAppend);
                break;

            default:
                System.out.println("Invalid option!");
        }

        sc.close();
    }

    static void writeFile(String fname, String data) {
        try {
            FileWriter fw = new FileWriter(fname);
            fw.write(data);
            fw.close();
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("Something went wrong while writing.");
        }
    }

    static void readFile(String fname) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fname));
            String line;
            System.out.println("----- File Content -----");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

    static void appendFile(String fname, String data) {
        try {
            FileWriter fw = new FileWriter(fname, true);
            fw.write("\n" + data);
            fw.close();
            System.out.println("Data appended to file.");
        } catch (IOException e) {
            System.out.println("Couldn't append to file.");
        }
    }
}
