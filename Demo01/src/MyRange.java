/**Class = MyRange
 Input    Expected result
 [1,5]    1,2,3,4,5
 [1,5)    1,2,3,4
 (1,5]    2,3,4,5
 (1,5)    2,3,4
 ===============================
 1. check input (Valid/Invalid)
 2. First number =>1
    *[1 => 1
    *(1 => 1+1 = 2
 3. Second number => 5
    *5] => 5
    *5) => 5-1 =5
 4. result = 1,2,3,4,5**/

import java.util.ArrayList;
import java.util.List;

public class MyRange {

    private final String input;

    public MyRange(String input) {
        this.input = input;
    }

    public boolean checkStartWithInclude() {
        return input.startsWith("[");
    }

    public int getFirstNumber() {
        int firstNumber = Character.getNumericValue(input.charAt(1));
        if( checkStartWithInclude() ) {
            return firstNumber;
        }
        return firstNumber + 1;
//        return input.charAt(1) - 48;

    }

    public String getResult() {
        int firstNumber = getFirstNumber();
        int secondNumber = 5;
//        String[] results = new String[secondNumber - firstNumber + 1];
        // Collection Framework
        List<String> results = new ArrayList<>();
        for (int i = firstNumber; i < secondNumber + 1 ; i++) {
            results.add(String.valueOf(i));
        }
        return String.join(",", results);
    }


    public boolean checkStartWithExclude() {
            return input.startsWith("(");
    }

    public int getLastNumber() {
        int LastNumber = Character.getNumericValue(input.charAt(1));
        if( checkStartWithExclude() ) {
            return LastNumber;
        }
        return LastNumber - 1;
//        return input.charAt(1) - 48;

    }
}