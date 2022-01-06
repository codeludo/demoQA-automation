Feature: forms automation test demoQA
  As user of demoQA
  I want to test different web elements in a form
  To practice screenplay pattern

  @practiceform
  Scenario Outline: Scenario: Practice Form
    Given that 'Camilo' visit the page 'https://demoqa.com/'
    When he selects the practice form in the category forms he records data
      | First Name      | <First Name>      |
      | Last Name       | <Last Name>       |
      | Email           | <Email>           |
      | Gender          | <Gender>          |
      | Mobile          | <Mobile>          |
      | Date of Birth   | <Date of Birth>   |
      | Subjects        | <Subjects>        |
      | Hobbies         | <Hobbies>         |
      | Picture         | <Picture>         |
      | Current Address | <Current Address> |
      | State           | <State>           |
      | City            | <City>            |
    Then he can see his Thanks message in screen with data
      | First Name      | <First Name>      |
      | Last Name       | <Last Name>       |
      | Email           | <Email>           |
      | Gender          | <Gender>          |
      | Mobile          | <Mobile>          |
      | Date of Birth   | <Date of Birth>   |
      | Subjects        | <Subjects>        |
      | Hobbies         | <Hobbies>         |
      | Picture         | <Picture>         |
      | Current Address | <Current Address> |
      | State           | <State>           |
      | City            | <City>            |
      | Thanks         | <Thanks>           |
    Examples:
      | First Name | Last Name | Email              | Gender | Mobile     | Date of Birth | Subjects  | Hobbies | Picture                                     | Current Address | State         | City    | Thanks                         |
      | Gaia       | Zuluaga   | gaia@example.com   | Female | 1234567890 | 20 May 1998   | English   | Sports  | C:\Users\USUARIO\Pictures\imagen-repo-1.png | cra 123         | Uttar Pradesh | Lucknow | Thanks for submitting the form |
      #| Berlin     | Cruz      | berlin@example.com | Male   | 6543219878 | 15 Jul 2000   | Chemistry | Reading |C:\Users\USUARIO\Pictures\imagen-repo-1.png  | cra 234         | Haryana       | Panipat | Thanks for submitting the form |
      #| Osiris     | Restrepo  | osiris@example.com | Other  | 7896543210 | 17 Jun 1963   | Biology   | Music   |C:\Users\USUARIO\Pictures\imagen-repo-1.png  | cra 345         | Rajasthan     | Jaipur  | Thanks for submitting the form |