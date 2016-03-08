package B_SecondScreen

import spock.lang.Specification
import spock.lang.Unroll

@SuppressWarnings("GroovyPointlessBoolean")
public class ArrayContainsTotalSpec extends Specification {

    @Unroll
    def '#array #description #target so should return result'(){

        expect:
        ArrayContainsTotal.arrayContains(array as int[], target) == result

        where:
        array           | target        | description               || result
        [3,1,6,10]      | 4             | 'contains total at left'        || true
        [3,1,6,10]      | 16            | 'contains total at right'       || true
        [3,1,6,10]      | 7             | 'contains total centre'         || true
        [3,1,6,10]      | 8             | 'not found, value in range'     || false
        [3,1,6,10]      | 2             | 'not found, value below range'  || false
        [3,1,6,10]      | 25            | 'not found, value above range'  || false
        []              | 8             | 'empty'                         || false
        [3,1,6,10]      | 0             | 'target zero'                   || false
        [3,-1,6,10]     | 5             | 'negative array'                || true
        [3,-1,-6,10]    | -7            | 'negative target'               || false
    }
}
