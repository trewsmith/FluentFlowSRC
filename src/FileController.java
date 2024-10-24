import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;  

public class FileController {

    private String thisDir;
    private File ProgressFile;

    public FileController() {

        // create the progress folder if it doesn't already exist
        try {

            thisDir = System.getProperty("user.dir");
            File ProgressFolder = new File(thisDir + "/progress");

            if (!ProgressFolder.exists()) {

                ProgressFolder.mkdirs();

            }

        }
        catch (NullPointerException e) {

            e.printStackTrace();

        }

        try {

            // create the progress file
            ProgressFile = new File(thisDir + "/progress/learning_progress.txt");

            if (!ProgressFile.exists()) {
                
                ProgressFile.createNewFile();

            }

        }
        catch (IOException e) {

            e.printStackTrace();

        }

    }

    public void writeProgress(String type, String genre) {

        String result = "";

        // create result
        try {

            Scanner read = new Scanner(ProgressFile);

            while (read.hasNextLine()) {

                String data = read.nextLine();

                String thisType = data.substring(0, 1);
                String thisGenre = data.substring(2, 3);
                int thisValue = Integer.valueOf(data.substring(4));

                if (thisType.equals(type) && thisGenre.equals(genre)) {

                    result += thisType + ">" + thisGenre + ":" + (thisValue + 1) + "\n";

                }
                else {

                    result += thisType + ">" + thisGenre + ":" + thisValue + "\n";

                }

            }
            read.close();

        }
        catch (IOException e) {

            e.printStackTrace();

        }

        // write result to learning_progress
        try {

            FileWriter writer = new FileWriter(ProgressFile);
            writer.write(result);
            writer.close();

        }
        catch (IOException e) {

            e.printStackTrace();

        }

    }

    public int readProgress (String type, String genre) {

        try {

            Scanner read = new Scanner(ProgressFile);

            while (read.hasNextLine()) {

                String data = read.nextLine();
                if (data.substring(0, 1).equals(type) && data.substring(2, 3).equals(genre)) {

                    return Integer.valueOf(data.substring(4));

                }

            }
            read.close();

        }
        catch (IOException e) {

            e.printStackTrace();

        }
        return 0;
    }
}