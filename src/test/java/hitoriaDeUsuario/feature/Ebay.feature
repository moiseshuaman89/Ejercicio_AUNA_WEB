Feature: Demuestra tu Talento Automatizador

  @test_Prueba_web
  Scenario Outline: Escojer 5 Gorras de la Marca Adidas de talla "S" en EBAY
    Given Ebay se encuentra abierto
    When  busco el articulo "<articulo>" y doy clic en el boton Buscar
    And   filtro por el tipo de marca "<marca>" del articulo
    And   elegir el tamaño "<tamano>" del articulo
    And   imprimo el resultado de la busqueda del articulo
    And   ordenamos los articulos por Precio Descendente
    Then  elejimos los "<cantProducto>" primeros productos con sus precios
    And   ordenamos los productos por Nombre ascendente
    And   ordenamos los productos por Precio descendente

    Examples:
      | articulo | marca  | tamano | cantProducto |
      | GORRA    | ADIDAS | S      | 5            |