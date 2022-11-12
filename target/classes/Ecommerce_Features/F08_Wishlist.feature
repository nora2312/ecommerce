@smoke
  Feature: F08_Wishlist | user could add product to wishlist

    Scenario: product added to wishlist successfully
      Given user click on wishlist button on product
      Then msg appears that product added successfully

    Scenario: Get Qty after add product in wishlist
      Given user click on wishlist button on product
      Then msg appears that product added successfully
      And enter to wishlist checj that Qty bigger than zero