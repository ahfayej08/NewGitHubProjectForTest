$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/user1/eclipse-workspace/BTC190421M_Express_BDD_Project/compareTextOfArray.feature");
formatter.feature({
  "line": 1,
  "name": "compare text of array",
  "description": "",
  "id": "compare-text-of-array",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "open browser",
  "rows": [
    {
      "cells": [
        "chrome"
      ],
      "line": 5
    },
    {
      "cells": [
        "edge"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "nevigate url",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.open_browser(DataTable)"
});
formatter.result({
  "duration": 123772700,
  "error_message": "java.lang.NullPointerException\r\n\tat com.bit.test.StepDefination.open_browser(StepDefination.java:23)\r\n\tat ✽.Given open browser(C:/Users/user1/eclipse-workspace/BTC190421M_Express_BDD_Project/compareTextOfArray.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefination.nevigate_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 10,
  "name": "get menu text from express and compare them",
  "description": "",
  "id": "compare-text-of-array;get-menu-text-from-express-and-compare-them",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "get all text from main menu and store them into array",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "store expected data into another array",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "compare expaected vs actual",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.get_all_text_from_main_menu_and_store_them_into_array()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.store_expected_data_into_another_array()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.compare_expaected_vs_actual()"
});
formatter.result({
  "status": "skipped"
});
});