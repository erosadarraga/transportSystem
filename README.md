# transportSystem



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





## Patrones de diseño identificados

- Patrón Singleton: permite crear una única instancia de un objeto y proporcionar un punto de acceso global a ella.
- Patrón Factory: permite crear objetos sin especificar la clase concreta que se está creando.
- Patrón Builder: permite construir objetos complejos de manera eficiente y clara.
