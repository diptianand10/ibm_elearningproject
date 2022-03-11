$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/inbox.feature");
formatter.feature({
  "name": "Post the user message on social wall and compose and show the outbox messages",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the elearning platform",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition1.user_is_on_the_elearning_platform()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"levi1500\" and \"12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition1.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition1.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verification message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition1.user_verification_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Post the user message on social wall",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wall"
    }
  ]
});
formatter.step({
  "name": "user clicks on social network tab",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition1.user_clicks_on_social_network_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on my shared profile",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition1.clicks_on_my_shared_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "types the message in input field",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition1.types_the_message_in_input_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks the post button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition1.clicks_the_post_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Inbox messages",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@inbox"
    }
  ]
});
formatter.step({
  "name": "user clicks on inbox link under the profile tab",
  "keyword": "Given "
});
formatter.step({
  "name": "user search for a message \"\u003cmessage1\u003e\" in search field and clicks on the search button",
  "keyword": "And "
});
formatter.step({
  "name": "the message is displayed successfully",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on reply image",
  "keyword": "And "
});
formatter.step({
  "name": "enters the message \"\u003cmessage2\u003e\" field and clicks on send message button",
  "keyword": "And "
});
formatter.step({
  "name": "success message is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks the back arrow image",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on select all button and on the caret symbol",
  "keyword": "And "
});
formatter.step({
  "name": "clicks on mark as unread",
  "keyword": "And "
});
formatter.step({
  "name": "clicks on ok button of the pop up message",
  "keyword": "And "
});
formatter.step({
  "name": "the success message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "message1",
        "message2"
      ]
    },
    {
      "cells": [
        "Hii",
        "Hello"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the elearning platform",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition1.user_is_on_the_elearning_platform()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"levi1500\" and \"12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition1.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition1.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verification message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition1.user_verification_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Inbox messages",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@inbox"
    }
  ]
});
formatter.step({
  "name": "user clicks on inbox link under the profile tab",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition1.user_clicks_on_inbox_link_under_the_profile_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for a message \"Hii\" in search field and clicks on the search button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition1.user_search_for_a_message_in_search_field_and_clicks_on_the_search_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the message is displayed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition1.the_message_is_displayed_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on reply image",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition1.user_clicks_on_reply_image()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters the message \"Hello\" field and clicks on send message button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition1.enters_the_message_field_and_clicks_on_send_message_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "success message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition1.success_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the back arrow image",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition1.user_clicks_the_back_arrow_image()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on select all button and on the caret symbol",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition1.clicks_on_select_all_button_and_on_the_caret_symbol()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on mark as unread",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition1.clicks_on_mark_as_unread()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on ok button of the pop up message",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition1.clicks_on_ok_button_of_the_pop_up_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the success message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition1.the_success_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Compose message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@inbox"
    }
  ]
});
formatter.step({
  "name": "user clicks on inbox link under the profile tab",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on compose message image",
  "keyword": "When "
});
formatter.step({
  "name": "user enters \"\u003cname\u003e\" in please select an option field",
  "keyword": "And "
});
formatter.step({
  "name": "selects a name and enters the subject \"\u003csub\u003e\" and message \"\u003cmsg\u003e\" field",
  "keyword": "And "
});
formatter.step({
  "name": "attaches a file and a description \"\u003cdesc\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "clicks on send message",
  "keyword": "And "
});
formatter.step({
  "name": "message sent is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "sub",
        "desc",
        "msg"
      ]
    },
    {
      "cells": [
        "Dip",
        "Hello",
        "shinchan",
        "Ohayo"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the elearning platform",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition1.user_is_on_the_elearning_platform()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"levi1500\" and \"12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition1.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition1.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verification message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition1.user_verification_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Compose message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@inbox"
    }
  ]
});
formatter.step({
  "name": "user clicks on inbox link under the profile tab",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition1.user_clicks_on_inbox_link_under_the_profile_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on compose message image",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition1.user_clicks_on_compose_message_image()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Dip\" in please select an option field",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition1.user_enters_in_please_select_an_option_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects a name and enters the subject \"Hello\" and message \"Ohayo\" field",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition1.selects_a_name_and_enters_the_subject_and_message_field(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "attaches a file and a description \"shinchan\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition1.attaches_a_file_and_a_description(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on send message",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition1.clicks_on_send_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "message sent is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition1.message_sent_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the elearning platform",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition1.user_is_on_the_elearning_platform()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"levi1500\" and \"12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition1.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition1.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verification message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition1.user_verification_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Outbox messages",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@inbox"
    }
  ]
});
formatter.step({
  "name": "user clicks on inbox link under the profile tab",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition1.user_clicks_on_inbox_link_under_the_profile_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on outbox image",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition1.user_clicks_on_outbox_image()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for message in search field and clicks on search button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition1.user_search_for_message_in_search_field_and_clicks_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "searched message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition1.searched_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on select all option",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition1.user_clicks_on_select_all_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the caret symbol and delete selected message",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition1.clicks_on_the_caret_symbol_and_delete_selected_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on ok button of the pop up message",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition1.clicks_on_ok_button_of_the_pop_up_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the message is deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition1.the_message_is_deleted()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});