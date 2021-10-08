package Codes.JavaLabs.lab_4;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Codes.JavaLabs.lab_3.Trade;


public class StreamsClass {
    static void readStreamFile() {
        String filePath = "C:\\Users\\User\\Documents\\JAVA\\Codes\\JavaLabs\\lab_4\\TradeStream.txt";

        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {

            // Java collection for storing converted time
            List<TradeStream> tradeList = new ArrayList<TradeStream>();

            // to help generate ids
            // static int counter = 0;
            List<String> ids = new ArrayList<String>();
            stream.forEach((data) -> {
                // TradeStream.convertTime(Integer.parseInt(data.split(",")[2]));

                if (!ids.contains("T" + TradeStream.counter)) {
                    var id = "T" + TradeStream.counter++;// generate id
                    ids.add(id); // add id to list

                    // splitting the various values into an array
                    String[] split = data.split(",");

                    // creating an object for each line
                    TradeStream tr = new TradeStream(id, split[0], Integer.parseInt(split[3]), Double.parseDouble(split[4]),
                            Integer.parseInt(split[2]));

                    // add object of trade to list
                    tradeList.add(tr);
                }
            });

            //create instance of TradeStream to use as sort
            TradeStream trs = new TradeStream();
            //sort data
            //sort by time
            Collections.sort(tradeList, trs.new SortByTime());
            // for(TradeStream t:tradeList)
            //     System.out.println(t.time+"\t"+t.symbol);
            // System.out.println("-------------------------------Done with time sorting----------------------------------");
            //sort by quantity
            Collections.sort(tradeList, trs.new SortByQuantity());
            // for(TradeStream t:tradeList)
                // System.out.println(t.quantity+"\t"+t.symbol);

            //selecting trades with quantity higher than 200 using lambda expression
            var selected = tradeList.stream().filter(t-> t.quantity > 200).collect(Collectors.toList());
            for(TradeStream t:selected)
            System.out.println(t.quantity+"\t"+t.symbol);
        } catch (Exception err) {
            System.out.println(err);
        }
    }


    public static void main(String[] args) {
        StreamsClass.readStreamFile();
    }

    //function to find the value given a symbol
    // static void 
}
