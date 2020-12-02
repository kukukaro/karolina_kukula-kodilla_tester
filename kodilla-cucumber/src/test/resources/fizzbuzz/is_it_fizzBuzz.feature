Feature: Is it FizzBuzz?
  Check your number out!

  Scenario Outline: Number is Fizz, Buzz or FizzBuzz
    Given Your number is <number>
    When I ask whether my number is Fizz, Buzz or FizzBuzz
    Then I should be told <answer>
    Examples:
      | number | answer|
      | 0 | "FizzBuzz" |
      | 1 | "Nope" |
      | 2 | "Nope" |
      | 3| "Fizz" |
      | 4 | "Nope" |
      | 5 | "Buzz" |
      | 6 | "Fizz" |
      | 7 | "Nope" |
      | 8 | "Nope" |
      | 9 | "Fizz" |
      | 10 | "Buzz" |
      | 11 | "Nope" |
      | 12 | "Fizz" |
      | 13 | "Nope" |
      | 14 | "Nope" |
      | 15 | "FizzBuzz" |
