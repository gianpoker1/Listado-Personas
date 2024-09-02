# Listado de Personas en Java

Este proyecto es una aplicación de consola en Java que permite agregar y listar personas. Los datos de las personas se solicitan por consola y se almacenan en memoria para su posterior visualización.

## Características

- Interfaz de consola amigable.
- Manejo de excepciones para entradas inválidas.
- Menú de opciones para agregar y listar personas.
- Uso de ArrayList para almacenar los datos de las personas.

## Tecnologías Utilizadas

- Java
- Scanner para la entrada de datos por consola.
- ArrayList para almacenar los datos de las personas.

## Instrucciones de Uso

1. Clona el repositorio:

    ```bash
    git clone https://github.com/gianpoker1/Listado-Personas/
    cd tu-repositorio
    ```

2. Compila los archivos `Persona.java` y `ListadoPersonasApp.java`:

    ```bash
    javac Persona.java ListadoPersonasApp.java
    ```

3. Ejecuta el programa:

    ```bash
    java ListadoPersonasApp
    ```

## Estructura del Proyecto

- `Persona.java`: Clase que representa una persona con atributos como id, nombre, teléfono y email.
- `ListadoPersonasApp.java`: Clase principal que contiene el menú y la lógica para agregar y listar personas.

## Ejemplo de Uso
Listado Personas App

1. Agregar
2. Listar
3. Salir

Introduce la opcion: 1 

Nombre: Juan

Telefono: 123456789 

Email: juan@example.com

Listado Personas App

1. Agregar
2. Listar
3. Sali
  
Introduce la opcion: 2 

Lista de Personas: 

Persona{id=1, nombre='Juan', telefono='123456789', email='juan@example.com'}
