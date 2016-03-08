package C_FirstFull

import spock.lang.Specification
import spock.lang.Unroll


class WordGameSpec extends Specification {

    @Unroll
    def'#description returns #result'(){
        given:
        char[][] grid = [
        ['F','A','K','E'],
        ['A','O','H','A'],
        ['C','N','O','N'],
        ['E','I','T','L']]

        expect:
        WordGame.wordExists(grid,word) == result

        where:
        result  |  word         || description
        false   | 'NOTExist'    || 'word not exist'
        true    | 'Fake'        || 'word exists down'
        true    | 'Fool'        || 'word exists diagonal'
        true    | 'Hot'         || 'word in centre'
        true    | 'ANOH'        || 'word not in straight line'
    }
}