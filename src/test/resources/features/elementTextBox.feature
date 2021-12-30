Feature: automation test demoQA

  Scenario Outline: Scenario: element textbox automation
    Given that 'carlos' visit the page 'https://demoqa.com/'
    When he selects the textbox in the category elements he records data
      | Full Name         | <Full Name>         |
      | Email             | <Email>             |
      | Current Address   | <Current Address>   |
      | Permanent Address | <Permanent Address> |
    Then he can see his data in screen
      | Full Name         | <Full Name>         |
      | Email             | <Email>             |
      | Current Address   | <Current Address>   |
      | Permanent Address | <Permanent Address> |
    Examples:
      | Full Name    | Email            | Current Address    | Permanent Address    |
      | Dante solo   | dante@gmail.com  | 1233 st avemaria   | 3321 av lindolof     |
      #| Felix donato | felix@gmail.com  | 432 st san marti   | medellin, antioquia  |