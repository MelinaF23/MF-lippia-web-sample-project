@Search
Feature: As a potential client I need to search in google to find a web site

  @Smoke @Automated
  Scenario Outline: The client search by <word>
    Given The client is on google page
    When The client search for word <word>
    Then The client verify that results are shown properly

    Examples:
    | word            |
    | Crowdar Academy |
    | Calidad         |
    | Software        |
    | Testing         |

  @Academy
  Scenario Outline: The client search by <word>
    Given The client is on google page
    When The client search for word <word>
    Then The client verify that results are shown properly

    Examples:
      | word            |
      | Crowdar         |
      | IntelliJ        |