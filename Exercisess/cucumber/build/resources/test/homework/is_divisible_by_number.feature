Feature: is divisible by number
  by what number you are divisible?

  Scenario Outline:  Number is or isn't Fizz or Buzz
    Given <Number>
    When I divide by three or five
    Then I should get <answer>
    Examples:
      | Number | answer |
      | 3 |  "Fizz" |
      | 35 | "Buzz" |
      | 15 | "Fizz Buzz" |
      | 1 | None |