Feature: Menus

  Scenario: Master Menu
    Given Rusty opens the hotel reservation application
    Then Rusty will be welcomed
    And Rusty will see a list of the following actions:
      | Find and reserve a room |
      | See my reservations     |
      | Create an account       |
      | Create an account       |
      | Admin                   |
      | Exit                    |
    And Rusty will be prompted to select a menu option