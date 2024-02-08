Feature: object conversion story

  Scenario:  scenario with conversion of custom table to animal object
    Given a system state with object
      |name|surname|comment|anything|
      |cat|catty|qwwere |tyutyut   |
      |wolf|wolfy|sdfgdgf|tyutyutyu|
      |dog|doggy|sdfsdf  |tyutyut  |
    When I do something with object
    Then system is in a different state with object