# DAM2_PMDM
Ejemplos y ejercicios vistos en clase para el módulo PMDM de 2º DAM.

## UT1
* **Ejercicio 01-Activity-Saludo**. Programa que pide tu nombre y al pulsar un botón te saluda y otro botón te limpia el cuadro de texto. Lo tenéis accesible en este commit: "**Ejercicio 1 subido completo**".https://github.com/alejandrtf/DAM2_PMDM/commit/faee6a235962423df1b5a0fcaac8a7fa6ab0dc97 y pulsando en **Browse files**.

* **Ejercicio 01-Activity-Saludo-Versión 2**. Incluye dos nuevos botones: OCULTAR y MOSTRAR que han sido programados de diferentes maneras; OCULTAR hemos usado la propiedad onClick de XML y MOSTRAR hemos usado los interfaces de java. Lo tenéis accesible en este commit: "**Ejercicio 1 Versión2:incluye botón ocultar y mostrar**": https://github.com/alejandrtf/DAM2_PMDM/commit/855c0c4a42edc1ada8cf7f23c61a888f157d420a

* **Ejercicio 01-Activity-Saludo-Versión 3**. En esta versión se han quitado todos los textos que habíamos escrito manualmente y se han pasado al fichero strings.xml que está en /res/values dentro del proyecto para así permitir localización. Lo tenéis accesible en este commit: "**Ejercicio 1 Versión3_Buena:cambiando los textos escritos a textos en recursos/values/strings.xml**": https://github.com/alejandrtf/DAM2_PMDM/commit/beca174f3f01d05aaca0cd0d413b8c472d2021eb

* **Ejercicio 02-Activity-Saludo-Con 2 Activities**. En este ejercicio se practica el uso de Intent para lanzar otra activity que no es la principal. En la pantalla principal pedimos el nombre al usuario y al pulsar el botón Aceptar, se lanza otra activity donde se le saluda por su nombre.

## UT3
* **Ejercicio 02-Activity-Saludo-Con 2 Activities-que pide edad y la devuelve al MainActivity**. Programa que pide tu nombre y al pulsar un botón te saluda en otra pantalla y en esa segunda pantalla te pide además la edad. Si pulsas ACEPTAR te envía la edad al MainActiviy y la verás en la parte de abajo de la pantalla. Es un ejemplo de onActivityResult().

## UT4
* **LayoutEj02-Bandas de colores-Versión 1**. Programa que muestra 7 bandas de colores de forma horizontal e igualmente distribuidas sobre un LinearLayout vertical. Además al pulsar sobre cada banda, se muestra un Toast informando de qué color se ha pulsado. Esta VERSIÓN 1 está hecho programando el evento onClick en el XML. Lo tenéis accesible en este commit: "**Layout Ej02-Bandas de Colores-Versión 1-Corregido pequeño error**": https://github.com/alejandrtf/DAM2_PMDM/tree/94c9d4019bc901600412236de883fb8ea0d832dc/UT4/LayoutEj02BandasColores

* **LayoutEj02-Bandas de colores-Versión 2**. Esta VERSIÓN 2 del ejercicio anterior está hecha programando el evento onClick sobre cada banda asociando un nuevo OnClickListener interface anónimo en cada una de las bandas. Lo tenéis accesible en este commit: "**Layout Ej02-Bandas de Colores-Versión 2-Subido Completo**": https://github.com/alejandrtf/DAM2_PMDM/tree/4d35a27115733e393cc3c11bc57f16892980b0c0/UT4/LayoutEj02BandasColores

* **LayoutEj02-Bandas de colores-Versión 3**. Esta VERSIÓN 3 del ejercicio anterior está hecha implementando el listener OnClickListener en la clase MainActivity y no como interface anónimo en cada banda. Se ahorra mucho código. Lo tenéis accesible en este commit: "**Layout Ej02-Bandas de Colores-Versión 3-Subido Completo**": https://github.com/alejandrtf/DAM2_PMDM/tree/61e9f18eff78ead9108985fc95aaf2b157a97032/UT4/LayoutEj02BandasColores 
* **EjemploBotonesPersonalizados**. Programa que muestra cómo hacer que la imagen de un botón cambien en función de su estado: pulsado, no pulsado.

## UT10
* **EjemploReceptorSMS**. Programa que muestra cómo reaccionar ante la llegada de un SMS. Se cargará una nueva activity.
* **EjemploReceptorPropio**. Programa que muestra cómo configurar anuncios propios y registrar en código una receptor de anuncias que responda a esos anuncios. El ejemplo está hecho con un Servicio de Música que cuando lo paramos guarda la posición y al arrancar de nuevo continúa donde lo dejó.
* **Ejemplo PermisosMarshmallow**. Programa de ejemplo de cómo solicitar permisos en Android 6.0 y superior

