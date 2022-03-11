Feature: Post the user message on social wall and compose and show the outbox messages

  Background: 
    Given User is on the elearning platform
    When user enters "levi1500" and "12345"
    And user clicks on login button
    Then user verification message is displayed

  @wall
  Scenario: Post the user message on social wall
    Given user clicks on social network tab
    And clicks on my shared profile
    And types the message in input field
    Then clicks the post button

  @inbox
  Scenario Outline: Inbox messages
    Given user clicks on inbox link under the profile tab
    And user search for a message "<message1>" in search field and clicks on the search button
    Then the message is displayed successfully
    And user clicks on reply image
    And enters the message "<message2>" field and clicks on send message button
    Then success message is displayed
    When user clicks the back arrow image
    And clicks on select all button and on the caret symbol
    And clicks on mark as unread
    And clicks on ok button of the pop up message
    Then the success message is displayed

    Examples: 
      | message1 | message2 |
      | Hii      | Hello    |

  @inbox
  Scenario Outline: Compose message
    Given user clicks on inbox link under the profile tab
    When user clicks on compose message image
    And user enters "<name>" in please select an option field
    And selects a name and enters the subject "<sub>" and message "<msg>" field
    And attaches a file and a description "<desc>"
    And clicks on send message
    Then message sent is displayed

    Examples: 
      | name | sub   | desc     | msg   |
      | Dip  | Hello | shinchan | Ohayo |

  @inbox
  Scenario: Outbox messages
    Given user clicks on inbox link under the profile tab
    When user clicks on outbox image
    And user search for message in search field and clicks on search button
    Then searched message is displayed
    When user clicks on select all option
    And clicks on the caret symbol and delete selected message
    And clicks on ok button of the pop up message
    Then the message is deleted
