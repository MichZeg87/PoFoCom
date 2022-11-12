Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario Outline:Successful withdrawal more samples
    Given I have deposited <deposit> in my wallet
    When I request <amount>
    Then <amount> should be dispensed
    Examples:
      |deposit  | amount|
      | 100     | 100   |
      | 300     | 0     |
      | 0       | 0     |