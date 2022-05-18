Feature: yo como usuario
        necesito poder visualizar la factura de mi pedido
        para verificar la información del producto solicitado

  Scenario: visualizar factura del pedido exitosa
    Given estar en la pagina web de opencart
    When iniciar sesion, luego entrar en el apartado de pedidos dentro de la opcion ventas e imprimir la factura del pedido seleccionado
    Then se visualiza la informacion del producto y del pedido

