Feature: yo como usuario
        quiero poder crear una nueva reseña sobre algun producto
        para publicar mi experiencia de compra

  Scenario: crear reseña no exitosa
    Given ingresar a la url de la pagina web de opencart
    When iniciar sesion, luego entrar en el apartado de reviews dentro del catalogo y crear una nueva resena
    Then se visualiza una alerta la cual informa que no se tiene permiso para crear las resenas