$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Addition.feature");
formatter.feature({
  "line": 1,
  "name": "Addition",
  "description": "",
  "id": "addition",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Addition of two integer numbers",
  "description": "",
  "id": "addition;addition-of-two-integer-numbers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I have two numbers 20 and 40",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Add button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the output should be 60",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 19
    },
    {
      "val": "40",
      "offset": 26
    }
  ],
  "location": "Addition_steps.i_have_two_numbers_and(int,int)"
});
formatter.result({
  "duration": 135451644,
  "status": "passed"
});
formatter.match({
  "location": "Addition_steps.i_click_on_Add_button()"
});
formatter.result({
  "duration": 49930,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "60",
      "offset": 21
    }
  ],
  "location": "Addition_steps.the_output_should_be(int)"
});
formatter.result({
  "duration": 307601,
  "status": "passed"
});
formatter.uri("Multiplication.feature");
formatter.feature({
  "line": 1,
  "name": "Multiplication",
  "description": "",
  "id": "multiplication",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Multiplication of two integer numbers",
  "description": "",
  "id": "multiplication;multiplication-of-two-integer-numbers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "two integer numbers 20 and 100",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Multiply button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the result should be 2000",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 20
    },
    {
      "val": "100",
      "offset": 27
    }
  ],
  "location": "Multiplication_steps.two_integer_numbers_and(int,int)"
});
formatter.result({
  "duration": 234334,
  "status": "passed"
});
formatter.match({
  "location": "Multiplication_steps.i_click_on_Multiply_button()"
});
formatter.result({
  "duration": 65494,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2000",
      "offset": 21
    }
  ],
  "location": "Multiplication_steps.the_result_should_be(int)"
});
formatter.result({
  "duration": 182708,
  "status": "passed"
});
});