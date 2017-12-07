Feature: Checkout

Scenario: Checkout a banana
    Given the price of a "banana" is 40p
    When I checkout 1 "banana"
    Then the total price should be 40p

Scenario Outline: Checkout bananas
    Given the price of a "banana" is 40p
    When I checkout <count> "banana"
    Then the total price should be <total>p

      Examples:
      | count | total |
      | 1     | 40    |
      | 2     | 80    |
      | 3     | 120   |

Scenario: Two bananas scanned separately
    Given the price of a "banana" is 40p
    When I checkout 1 "banana"
    And I checkout 1 "banana"
    Then the total price should be 80p

Scenario: A banana and an apple
    Given the price of a "banana" is 40p
    And the price of a "apple" is 25p
    When I checkout 1 "banana"
    And I checkout 1 "apple"
    Then the total price should be 65p
