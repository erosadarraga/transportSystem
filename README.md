# transport System


## Como lo hice 

- Planificación: Trate de Definir claramente los requisitos y objetivos de la aplicacion de transporte , y elige la arquitectura y tecnologías adecuadas para cumplirlos segun sus enseñanzas

- Configuración inicial y estructura de carpetas: Crea un nuevo proyecto en Spring Boot utilizando herramientas como Spring Initializer y configura las dependencias necesarias para el proyecto junto con los principios KISS Dividi el proyecto en módulos lógicos y organiza los paquetes y clases de acuerdo a una buena práctica de diseño con el modelo MVC

- Mi logica: Despues de analizar el problema llegue a la conclucion que para poder hacer la app tenia que crear una clase para los pasajeros, otra para los destinos y otra para los buces en donde todas heredaban de una clase abstracta por otro lado fue necesario crear 2 carpetas en servicios en donde cada una tenia su interface y su clase que la implementaban para asi ser inyectadas en el controlador de la manera mas desacoplada posible loca cual se presta para mantener la logica lo mas desacoplada posible de una clase en espesifico

- Documentación: Documenta el código y el proyecto de manera clara y detallada en el readmed con los end point

## End Point de la api Rest

- Odtiene todos los destinos en un arreglo: http://localhost:8080/api/destinos
- Inserta un nuevo destino en el arreglo de destinos: http://localhost:8080/api/destinos
```  
  {
        "cityName": "bogota",
        "bus": {
            "passenger": {
                "namePerson": "santiago",
                "age": 29
                
            },
            "name": "Berlinas del Fonce",
            "destination": "cucuta"
        },
        "horarios": [
            "13:30 AM",
            "6:00 pm",
            "3:20 AM"
        ]
    }
```
- Borra un destino del arreglo de destinos con su id: http://localhost:8080/api/destinos/{id}
- Odtiene todos los pasajeros en un arreglo: http://localhost:8080/api/pasajeros



## Patrones de diseño identificados

- Patrón Singleton: permite crear una única instancia de un objeto y proporcionar un punto de acceso global a ella.
- Patrón Factory: permite crear objetos sin especificar la clase concreta que se está creando.
- Patrón Builder: permite construir objetos complejos de manera eficiente y clara.
