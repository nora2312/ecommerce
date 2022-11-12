@smoke
  Feature: F07_FollowsUs | you could access follow_up pages
    Scenario: user opens Facebook link

      When user clicks facebook link
      Then facebook link "https://www.facebook.com/nopCommerce"opens successfully

    Scenario: user opens twitter link
      When user clicks twitter link
      Then twitter link "https://twitter.com/nopCommerce"opens successfully

    Scenario: user opens rss link
      When user clicks rss link
      Then rss link "https://demo.nopcommerce.com/new-online-store-is-open"opens successfully

    Scenario: user opens Youtube link
      When user clicks Youtube link
      Then Youtube link "https://www.youtube.com/user/nopCommerce" opens successfully