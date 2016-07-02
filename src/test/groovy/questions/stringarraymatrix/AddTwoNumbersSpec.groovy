package questions.stringarraymatrix

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class AddTwoNumbersSpec extends Specification {

    def "addTwoNumbers"() {
        expect:
        AddTwoNumbers.addTwoNumbers(a, b) == c

        where:
        a     | b     | c
        null  | null  | null
        null  | "123" | "123"
        "123" | null  | "123"
        "243" | "564" | "807"
        "123" | "234" | "357"
    }
}
