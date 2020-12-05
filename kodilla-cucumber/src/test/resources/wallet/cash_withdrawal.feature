Feature: Cash Withdrawal

  Scenario Outline: Checking that the transaction can be process correctly
    Given Your deposit is <deposit_amount>
    When I request <requested_amount>
    Then <dispensed_amount> should be dispensed

    Examples:
      | deposit_amount | requested_amount | dispensed_amount |
      | 200 | 30 | 30 |
      | 200 | -30 | 0 |
      | 200 | 200 | 200 |
      | 100 | 101 | 0 |
      | 0 | 1 | 0 |
      | 200 | 0 | 0 |
      | -1  | 0 | 0 |




