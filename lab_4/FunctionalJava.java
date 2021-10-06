package Codes.JavaLabs.lab_4;

public class FunctionalJava implements Function<Integer, Integer, String>{
    public void run(Integer a, Integer b, String opp){
        Integer result = 1;
       switch (opp) {
           case "add":
                        result = a+b;
                        break;
           case "subtract":
                        result = a-b;
                        break;
           default:
                        while(b>0){
                            result *=a;
                            b--;
                        }
                        break;
       }

       System.out.println("The operation "+opp+" on the two integers is "+result);
    }

    public static void main(String[] args){
        FunctionalJava func = new FunctionalJava();
        func.run(4, 3, "add");        
        func.run(4, 3, "subtract");        
        func.run(4, 3, "power");        
    }
}
