$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/hitoriaDeUsuario/feature/Ebay.feature");
formatter.feature({
  "line": 1,
  "name": "Demuestra tu Talento Automatizador",
  "description": "",
  "id": "demuestra-tu-talento-automatizador",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Escojer 5 Gorras de la Marca Adidas de talla \"S\" en EBAY",
  "description": "",
  "id": "demuestra-tu-talento-automatizador;escojer-5-gorras-de-la-marca-adidas-de-talla-\"s\"-en-ebay",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@test_Prueba_web"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Ebay se encuentra abierto",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "busco el articulo \"\u003carticulo\u003e\" y doy clic en el boton Buscar",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "filtro por el tipo de marca \"\u003cmarca\u003e\" del articulo",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "elegir el tamaño \"\u003ctamano\u003e\" del articulo",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "imprimo el resultado de la busqueda del articulo",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "ordenamos los articulos por Precio Descendente",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "elejimos los \"\u003ccantProducto\u003e\" primeros productos con sus precios",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "ordenamos los productos por Nombre ascendente",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "ordenamos los productos por Precio descendente",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "demuestra-tu-talento-automatizador;escojer-5-gorras-de-la-marca-adidas-de-talla-\"s\"-en-ebay;",
  "rows": [
    {
      "cells": [
        "articulo",
        "marca",
        "tamano",
        "cantProducto"
      ],
      "line": 16,
      "id": "demuestra-tu-talento-automatizador;escojer-5-gorras-de-la-marca-adidas-de-talla-\"s\"-en-ebay;;1"
    },
    {
      "cells": [
        "GORRA",
        "ADIDAS",
        "S",
        "5"
      ],
      "line": 17,
      "id": "demuestra-tu-talento-automatizador;escojer-5-gorras-de-la-marca-adidas-de-talla-\"s\"-en-ebay;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8402144900,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Escojer 5 Gorras de la Marca Adidas de talla \"S\" en EBAY",
  "description": "",
  "id": "demuestra-tu-talento-automatizador;escojer-5-gorras-de-la-marca-adidas-de-talla-\"s\"-en-ebay;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@test_Prueba_web"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Ebay se encuentra abierto",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "busco el articulo \"GORRA\" y doy clic en el boton Buscar",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "filtro por el tipo de marca \"ADIDAS\" del articulo",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "elegir el tamaño \"S\" del articulo",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "imprimo el resultado de la busqueda del articulo",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "ordenamos los articulos por Precio Descendente",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "elejimos los \"5\" primeros productos con sus precios",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "ordenamos los productos por Nombre ascendente",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "ordenamos los productos por Precio descendente",
  "keyword": "And "
});
formatter.match({
  "location": "Ebay_steps.ebaySeEncuentraAbierto()"
});
formatter.result({
  "duration": 7962127800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GORRA",
      "offset": 19
    }
  ],
  "location": "Ebay_steps.buscoElArticuloYDoyClicEnElBotonBuscar(String)"
});
formatter.result({
  "duration": 6307771700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ADIDAS",
      "offset": 29
    }
  ],
  "location": "Ebay_steps.filtroPorElTipoDeMarcaDelArticulo(String)"
});
formatter.result({
  "duration": 18258011700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "S",
      "offset": 18
    }
  ],
  "location": "Ebay_steps.elegirElTamañoDelArticulo(String)"
});
formatter.result({
  "duration": 1739474900,
  "status": "passed"
});
formatter.match({
  "location": "Ebay_steps.imprimoElResultadoDeLaBusquedaDelArticulo()"
});
formatter.result({
  "duration": 289661600,
  "status": "passed"
});
formatter.match({
  "location": "Ebay_steps.ordenamosLosArticulosPorPrecioDescendente()"
});
formatter.result({
  "duration": 3332429700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 14
    }
  ],
  "location": "Ebay_steps.elejimosLosPrimerosProductosConSusPrecios(String)"
});
formatter.result({
  "duration": 1485441300,
  "status": "passed"
});
formatter.match({
  "location": "Ebay_steps.ordenamosLosProductosPorNombreAscendente()"
});
formatter.result({
  "duration": 1162400,
  "status": "passed"
});
formatter.match({
  "location": "Ebay_steps.ordenamosLosProductosPorPrecioDescendente()"
});
formatter.result({
  "duration": 249338900,
  "status": "passed"
});
formatter.after({
  "duration": 4888456500,
  "status": "passed"
});
});