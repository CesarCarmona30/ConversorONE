# [Alura ONE Challenge: Conversor de monedas. Java - Backend]()

Este proyecto es un conversor de divisas en Java que permite consultar tasas de cambio entre varias monedas y realizar conversiones con un valor específico utilizando la API de ExchangeRate-API.

## Características

- Consulta la tasa de cambio actual entre dos divisas.
- Conversión de una cantidad específica de una divisa a otra.
- Soporta múltiples monedas como USD, MXN, ARS, y BRL.
- Actualización en tiempo real de las tasas de cambio a través de la API.

## Requisitos

Para ejecutar este proyecto necesitas tener instalado:

- [Java 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [ExchangeRate-API](https://www.exchangerate-api.com/) (Requiere clave de API)

### Variables de entorno

Este proyecto utiliza una clave de API proporcionada por ExchangeRate-API. Para que el proyecto funcione correctamente, debes configurar una variable de entorno llamada `API_KEY` con tu clave de API.

### Instalación y ejecución

Sigue los pasos a continuación para descargar y ejecutar el proyecto:

1. Clona este repositorio:

```bash
git clone https://github.com/tu_usuario/currency-converter.git
```

2. Navega a la carpeta del proyecto:

```bash
cd currency-converter
```

3. Compila el proyecto con javac:

```bash
javac Main.java
```

4. Ejecuta el programa:

```bash
java Main
```

### Uso

Al ejecutar el programa, se te solicitará seleccionar una moneda base y una moneda de cambio entre las siguientes opciones:

- Dólar Estadounidense (USD)
- Peso Mexicano (MXN)
- Peso Argentino (ARS)
- Real Brasileño (BRL)

Luego, podrás indicar si deseas convertir una cantidad específica o simplemente consultar la tasa de cambio actual.

El resultado incluirá la tasa de cambio, el monto convertido y la última actualización de la tasa.
Ejemplo

```bash
CONVERSOR DE DIVISAS

Seleccione la moneda base
  1. Dolar - USD
  2. Peso Mexicano - MXN
  3. Peso Argentino - ARS
  4. Real Brasileño - BRL
>_ 1

Seleccione la moneda de cambio
  1. Dolar - USD
  2. Peso Mexicano - MXN
  3. Peso Argentino - ARS
  4. Real Brasileño - BRL
>_ 2

Desea convertir alguna cantidad en específico? 1.si: 1
Ingrese la cantidad: 100

Tasa de cambio
  1 USD ===> 20.12345 MXN
  100.00  =  2012.34
Última actualización: Tue, 03 Oct 2024 12:00:00 UTC
```

### Dependencias

Este proyecto utiliza las siguientes bibliotecas:

- Gson para el manejo de JSON en Java.
- HttpClient para las solicitudes HTTP.

### Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir, por favor crea un fork del repositorio y envía un pull request con tus cambios.

### Licencia

Este proyecto está licenciado bajo la MIT License.
