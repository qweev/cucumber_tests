Feature: data tables type story

  Scenario:  scenario with list
    Given a system state with list
    |dog|
    |cat|
    |wolf|
    When I do something with list
    Then system is in a different state with list


  Scenario:  scenario with list in list
    Given a system state with list in list
      | firstName   | lastName | birthDate  |
      | Annie M. G. | Schmidt  | 1911-03-20 |
      | Roald       | Dahl     | 1916-09-13 |
      | Astrid      | Lindgren | 1907-11-14 |
    When I do something with list in list
    Then system is in a different state with list in list

  Scenario:  scenario with map
    Given a system state with map
      |cat|catty|
      |wolf|wolfy|
      |dog |doggy|
    When I do something with map
    Then system is in a different state with map


  Scenario:  scenario with list with map
    Given a system state with list map
      |name|surname|comment|anythig|
      |cat|catty|qwwere |tyutyut   |
      |wolf|wolfy|sdfgdgf|tyutyutyu|
      |dog|doggy|sdfsdf  |tyutyut  |
    When I do something with list map
    Then system is in a different state with list map