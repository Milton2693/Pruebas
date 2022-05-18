Feature: yo como usuario
        necesito usar el filtro de busqueda de productos
        para verificar su correcto funcionamiento

  Scenario: busqueda filtro exitoso
    Given Ingresar a la pagina web de opencart
    When Iniciar sesion, luego entrar en el apartado de catalog, despues en products y por ultimo hacer uso del filter
    Then Se observa la busqueda del producto por medio del filtro

