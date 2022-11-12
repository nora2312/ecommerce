@smoke
Feature: F03_Currency | user can show item price according to selected currency

  Scenario: when user select Euro Symbol ("€") shown on the 4 products

    Given  user select currency Euro
    Then  Symbol (€) is shown on the products displayed in Home page