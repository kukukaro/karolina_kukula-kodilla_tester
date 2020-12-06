Feature: Cash Withdrawal

  Scenario Outline: Checking that the transaction can be process correctly
    Given Your deposit is <deposit_amount>
    When I request <requested_amount>
    Then <dispensed_amount> should be dispensed
    And The balance of my wallet should be <final_amount>

    Examples:
      | deposit_amount | requested_amount | dispensed_amount | final_amount |
      | 200 | 30 | 30 | 170                                                 |
      | 200 | -30 | 0 | 200                                                 |
      | 200 | 200 | 200 | 0                                                 |
      | 100 | 101 | 100 | 0                                                 |
      | 0 | 1 | 0 | 0                                                       |
      | 200 | 0 | 0 | 200                                                   |
      | -1  | 0 | 0 | 0                                                    |




