# Agenda MVC Swing (vallegrande.edu.pe)

Proyecto educativo con ejemplos de GUI Swing en tres niveles: Estructura Principal (básico), Nivel Intermedio y Nivel Avanzado. Incluye buenas prácticas como separación de responsabilidades, Look & Feel, recursos (icono) e internacionalización (i18n).

## Requisitos
- Java 17+
- Maven 3.8+

## Estructura del proyecto
```
src/
  main/
    java/
      vallegrande/edu/pe/
        EstructuraPrincipal/
          VentanaBienvenida.java
        NivelIntermedio/
          VentanaBienvenidaIntermedio.java
        NivelAvanzado/
          MainApp.java
          VentanaBienvenidaAvanzada.java
          ControladorBienvenida.java
        imagenes/
          icon.png
    resources/
      vallegrande/edu/pe/i18n/
        messages.properties
        messages_en.properties
```

## Cómo ejecutar cada nivel

### 1) Estructura Principal (básico)
Clase principal: `vallegrande.edu.pe.EstructuraPrincipal.VentanaBienvenida`



Qué muestra:
- Una ventana con un botón que despliega un saludo simple.

### 2) Nivel Intermedio
Clase principal: `vallegrande.edu.pe.NivelIntermedio.VentanaBienvenidaIntermedio`



Qué muestra / requisitos cubiertos:
- Solicita nombre con `JOptionPane.showInputDialog`.
- Valida que no esté vacío/cancelado.
- Muestra saludo personalizado: `¡Hola, <nombre>! ¡Buen trabajo!`.
- Estilos: fondo del panel personalizado y botón azul con texto blanco.

### 3) Nivel Avanzado
Clase principal: `vallegrande.edu.pe.NivelAvanzado.MainApp`


Características avanzadas:
- Icono personalizado en la ventana con `setIconImage` cargado por recurso: `/vallegrande/edu/pe/imagenes/icon.png`.
- Separación de responsabilidades (SRP):
  - Vista: `VentanaBienvenidaAvanzada`.
  - Lógica: `ControladorBienvenida`.
  - Entrada y configuración: `MainApp` (Look & Feel, Locale, ResourceBundle).
- Look & Feel con `UIManager` (Nimbus).
- Internacionalización (i18n) con `Locale` + `ResourceBundle`.
  - Español por defecto: `messages.properties`.
  - Inglés: `messages_en.properties`.

## Notas sobre recursos (icono e i18n)
- El icono se busca en el classpath en: `/vallegrande/edu/pe/imagenes/icon.png`.
  - Recomendado: mantener `icon.png` en `src/main/resources/vallegrande/edu/pe/imagenes/`.
  - El `pom.xml` también incluye imágenes de `src/main/java/**` para compatibilidad.
- Archivos i18n se ubican en `src/main/resources/vallegrande/edu/pe/i18n/`.

## Ejecutar desde el IDE
- Abrir la clase deseada y ejecutar su `main`:
  - Básico: `VentanaBienvenida`.
  - Intermedio: `VentanaBienvenidaIntermedio`.
  - Avanzado: `MainApp`.

## Licencia
Uso educativo.
