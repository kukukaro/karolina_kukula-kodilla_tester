Feature: Prevent users from making withdrawals on negative amount of money
  Scenario: User tries to withdraw -1$
    Given There is 200$ in wallet
    When I try to withdraw -1$
    Then The withdrawal is rejected
    And I get a negative withdrawal error message