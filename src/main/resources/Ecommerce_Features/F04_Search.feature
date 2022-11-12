@smoke
Feature: F04_Search | user could search in website

  Scenario Outline: user could search using product name
    Given user enter Product_Name as"<product_name>"
    When  user press search button
    Then  result search by as "<product_name>" appear successfully
    Examples:
      | product_name |
      | book         |
      | laptop       |
      | nike         |

  Scenario Outline: : user Could search by sku
    Given user enter sku as"<sku>"
    When  user press search button
    Then  result search by as "<sku>" appears successfully
    Examples:
      | sku       |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |
