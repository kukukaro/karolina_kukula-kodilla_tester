Feature: Is it FizzBuzz?
  Check your number out!

  Scenario Outline: Number is Fizz, Buzz or FizzBuzz
    Given Your number is <number>
    When I ask whether my number is Fizz, Buzz or FizzBuzz
    Then I should be told <answer>
    Examples:
      | number | answer|
      | -30 | "FizzBuzz" |
      | -29 | "Nope" |
      | -9 | "Fizz" |
      | -5 | "Buzz" |
      | -1 | "Nope" |
      | 1 | "Nope" |
      | 2 | "Nope" |
      | 3| "Fizz" |
      | 5 | "Buzz" |
      | 6 | "Fizz" |
      | 15 | "FizzBuzz" |
