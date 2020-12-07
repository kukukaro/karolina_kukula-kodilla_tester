Feature: Prevent users from taking out more money than their wallet contains
  Scenario: User tries to take out more money than their balance
    Given there is $100 in my wallet
    When I withdraw $200
    Then 100$ should be dispensed
    And I should be told that I withdraw the maximum amount of money available in your wallet.