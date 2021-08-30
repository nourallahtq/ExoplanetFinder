package nour.com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        try {
            ///////////////////////
            //Input Data Files: in the path of the File need to change the data file name for each file.

            // input.txt : have only the Example input.
            // level1-1.in
            // level1-2.in
            // level1-3.in
            // level1-4.in
            // level1-5.in
            //////////////////////

            File inputData = new File("/Users/nourallahtakielddin/Desktop/Exam/Level-1/src/nour/com/company/level1-5.in");
            Scanner myReader = new Scanner(inputData);
            int con = 0 ;

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] dataSplit = data.split("[a-zA-Z]+");
                for (String s: dataSplit) {
                    List<String> strings = Arrays.asList(s.split(" "));
                    List<Map<String,Integer>> objects = new ArrayList<>();
                    if (s.length()<10){
                        continue;
                    }
                    int number = 1 ;
                    for ( int i = 0 ; i < strings.size() ; i ++){
                        if (i > 1){
                            if (i + 1 < strings.size() && strings.get(i).equals(strings.get(i+1) )) {
                                number++;
                            }else {
                                Map<String,Integer> stringsten = new HashMap<>();
                                stringsten.put(strings.get(i), number);
                                number = 1;
                                objects.add(stringsten);
                                continue;
                            }

                        }
                    }
                    // Here you should change the (Star name) regarding each data file input
                    /////////////////////////////////////////////////
                    // level1-1.in : beginnerFirst
                    // level1-2.in : beginnerSecond
                    // level1-3.in : beginnerThird
                    // level1-4.in : APX
                    // level1-5.in : APY
                    /////////////////////////////////////////////////
                    System.out.print("APY"+ con+ " ");

                    for (Map<String,Integer> value: objects) {

                            value.entrySet().forEach(e -> System.out.print(e.getKey() + " "+ e.getValue() + " "));

                    }
                    System.out.print(con);
                    con ++;
                    System.out.println();

                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
