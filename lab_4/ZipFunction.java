package Codes.JavaLabs.lab_4;

import java.util.*;

public class ZipFunction implements ZipFunctionInterface<List<List<String>>, List<String>> {
    public List<List<String>> zip(List<String> str1, List<String> str2) {
        // logics for mapping: zip [1, 2, 3] [4, 5, 6] => [(1, 4), (2, 5), (3, 6)]
        //basically the resulting data is of the type List of Lists
        List<List<String>> results = new ArrayList<List<String>>();

        //check for whether the two list has the same sizes
        if (str1.size() == str2.size()) {
            //loop through for the individual data
            for (int i=0; i<str1.size(); i++) {
                //declare another list variable to store the result mapped strings
                List<String> res = new ArrayList<String>();

            //add the two mapped strings
               res.add(str1.get(i));
               res.add(str2.get(i));

               //add the results to the overall
               results.add(res);
            }
        }
        return results;
    }

    public static void main(String[] args){
        ZipFunction zip = new ZipFunction();

        String[] val1 = {"1","2", "3"};
        String[] val2 = {"4","5", "6"};

        //declare lists
        List<String> first = Arrays.asList(val1);
        List<String> second = Arrays.asList(val2);
       
        var results = zip.zip(first, second);

        System.out.println(results.toString());
    }
}
