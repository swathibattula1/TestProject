Feature:  To test sales functionality


  Scenario Outline: To test how Sales and Letting functionality works

    Given I am on right move home page
    When I enter a desired <place>
    And clicked on desired <button>
    And select radius
    And I selected Property type
    And I selected price ranges
    And I selected Added to site
    And I selected number of bedrooms
    And I clicked on FindProperties button
    And click on first non featured file

    Examples:
    Examples:
      | place         | button |
      | Ilford, Essex | buy    |
      | Ilford, Essex | rent   |




