Feature: Prevent users from making deposit with negative amount of money
  Scenario: User tries to deposit -1$
    Given There is 50$ in wallet
    When I try to deposit -1$
    Then The deposit is rejected
    And I get a negative deposit error message