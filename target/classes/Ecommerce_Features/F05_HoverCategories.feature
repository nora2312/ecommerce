@smoke
  Feature: F05_HoverCategories | user could hover categories

    Scenario: user could hover categories
      Given user havour random category
      When user clicks on of selected category
      Then check that sub-category title equal selected menu item