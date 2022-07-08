package task1_telephone.until;

import task1_telephone.models.GenuinePhones;
import task1_telephone.models.PortablePhones;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteToCSV {
    public static List<String> readList(String filePath) {
        File file = new File(filePath);
        List<String> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = "";
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                list.add(line);
            }

        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return list;
    }

    public static List<GenuinePhones> readGenuinePhones(String pathFile) {
        List<GenuinePhones> genuinePhones = new ArrayList<>();
        List<String> list = readList(pathFile);
        String[] array;
        for (String strings : list) {
            array = strings.split(",");
            genuinePhones.add(new GenuinePhones(Integer.parseInt(array[0]), array[1],Integer.parseInt(array[2]),
                    Integer.parseInt(array[3]) , array[4], Integer.parseInt(array[5]),array[6]));

        }
        return genuinePhones;

    }
    public static List<PortablePhones> readPortablePhones(String pathFile) {
        List<PortablePhones> portablePhones = new ArrayList<>();
        List<String> list = readList(pathFile);
        String[] array;
        for (String strings : list
        ) {
            array = strings.split(",");
          portablePhones.add(new PortablePhones(Integer.parseInt(array[0]), array[1],Integer.parseInt(array[2]),
                    Integer.parseInt(array[3]) , array[4],array[5],array[6]));

        } return portablePhones;
    }

    public static void writeFile(String pathFile, List<String> list, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : list
            ) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeGenuinePhones(String pathFile, List<GenuinePhones> genuinePhonesList, boolean append) {
        List<String> list = new ArrayList<>();
        for (GenuinePhones genuinePhones1 : genuinePhonesList
        ) {
            list.add(genuinePhones1.toFileGenuinePhone());
        }
        writeFile(pathFile, list, append);
    }
    public static void writePortablePhones(String pathFile, List<PortablePhones> portablePhones, boolean append) {
        List<String> list = new ArrayList<>();
        for (PortablePhones portablePhones1 : portablePhones
        ) {
            list.add(portablePhones1.toFilePortablePhones());
        }
        writeFile(pathFile, list, append);
    }

}
