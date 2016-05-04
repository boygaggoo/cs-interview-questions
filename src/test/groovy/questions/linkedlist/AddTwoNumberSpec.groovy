package questions.linkedlist

import api.Node
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class AddTwoNumberSpec extends Specification {

    def "addTwoNumbers"() {
        given:
        // book
        // 315 + 592 = 808
        Node<Integer> book1 = new Node<>(3)
        book1.next = new Node<>(1)
        book1.next.next = new Node<>(5)

        Node<Integer> book2 = new Node<>(5)
        book2.next = new Node<>(9)
        book2.next.next = new Node<>(2)

        // programming geeks
        // 342 + 465 = 807
        Node<Integer> pg = new Node<>(2)
        pg.next = new Node<>(4)
        pg.next.next = new Node<>(3)

        Node<Integer> pg2 = new Node<>(5)
        pg2.next = new Node<>(6)
        pg2.next.next = new Node<>(4)

        // from 3 to 4 digits
        // 999 + 999 = 1998
        Node<Integer> nine = new Node<>(9)
        nine.next = new Node<>(9)
        nine.next.next = new Node<>(9)

        Node<Integer> shortNumber = new Node<>(1)
        shortNumber.next = new Node<>(1)

        Node<Integer> shorterNumber = new Node<>(1)
        shorterNumber.next = new Node<>(1)
        shorterNumber.next.next = new Node<>(1)

        expect:
        AddTwoNumbers.addTwoNumbers(null, nine) == null
        AddTwoNumbers.addTwoNumbers(nine, null) == null
        AddTwoNumbers.addTwoNumbers(null, null) == null

        Node<Integer> result = AddTwoNumbers.addTwoNumbers(book1, book2)
        result.value == 8
        result.next.value == 0
        result.next.next.value == 8

        Node<Integer> result2 = AddTwoNumbers.addTwoNumbers(pg, pg2)
        result2.value == 7
        result2.next.value == 0
        result2.next.next.value == 8

        Node<Integer> result3 = AddTwoNumbers.addTwoNumbers(nine, nine)
        result3.value == 8
        result3.next.value == 9
        result3.next.next.value == 9
        result3.next.next.next.value == 1

        Node<Integer> result4 = AddTwoNumbers.addTwoNumbers(shortNumber, shorterNumber)
        result4.value == 2
        result4.next.value == 2
        result4.next.next.value == 1

        Node<Integer> result5 = AddTwoNumbers.addTwoNumbers(shorterNumber, shortNumber)
        result5.value == 2
        result5.next.value == 2
        result5.next.next.value == 1
    }
}
