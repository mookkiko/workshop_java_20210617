import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*Test cases
        [] => []
        [1] => [1]
        [1,2] => [1,2]
        [2,1] => [1,2]
        [1,2,3] => [1,2,3]
        [2,1,3] => [1,2,3]
        [1,3,2] => [1,2,3]
        [3,2,1] => [1,2,3]
        [5,4,3,2,1]  [1,2,3,4,5]*/

class MysortTest {

    @Test
    @DisplayName("[] => []")
    public void result01(){
        List<Integer> expected = Arrays.asList();
        Mysort mySort = new Mysort();
        List<Integer> inputs = Arrays.asList();
        List<Integer> results = mySort.sort(inputs);
        assertEquals(expected, results);
    }

}