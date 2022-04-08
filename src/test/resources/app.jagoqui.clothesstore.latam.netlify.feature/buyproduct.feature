Feature:  Buy product in the application

  Scenario Outline: Buy product in application
    Given user open the application
    When select product for buy
      | <item> | <product> |
    And select count product <quatityProduct>
    Then calculate value products

    Examples:
      | item  | product                                              | quatityProduct |
      | Mujer | Tenis Mujer Colores Variados Calzado Dama Casual Y Elegante | 3              |