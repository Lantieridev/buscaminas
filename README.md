# Buscaminas - Java Console Game 💣🚩

> [!NOTE]
> **Ejercicio Académico:** Este proyecto fue desarrollado como simulacro de examen para la asignatura de Programación Backend en la UTN FRC (2026).

¡Bienvenido al **Buscaminas**! El clásico juego de lógica reinventado para la terminal con una interfaz estética y soporte para múltiples dificultades.

## 🚀 Sobre el Proyecto
Este proyecto implementa el motor de juego del Buscaminas en Java, enfocado en la modularidad y la experiencia de usuario en consola.

### 🛠️ Tecnologías Utilizadas
*   **Lenguaje:** Java 21.
*   **Build Tool:** Maven.
*   **Interfaz:** Consola con colores ANSI y banners ASCII.

---

## 📸 Interfaz del Juego (CLI Showcase)

### 1. Inicio y Banner
```text
██████╗ ██╗   ██╗███████╗ ██████╗ █████╗ ███╗   ███╗██╗███╗   ██╗ █████╗ ███████╗
██╔══██╗██║   ██║██╔════╝██╔════╝██╔══██╗████╗ ████║██║████╗  ██║██╔══██╗██╔════╝
██████╔╝██║   ██║███████╗██║     ███████║██╔████╔██║██║██╔██╗ ██║███████║███████╗
██╔══██╗██║   ██║╚════██║██║     ██╔══██║██║╚██╔╝██║██║██║╚██╗██║██╔══██║╚════██║
██████╔╝╚██████╔╝███████║╚██████╗██║  ██║██║ ╚═╝ ██║██║██║ ╚████║██║  ██║███████║
╚═════╝  ╚═════╝ ╚══════╝ ╚═════╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚══════╝
                       M I N E S W E E P E R                                  
================================================================================
```

### 2. Tablero de Juego
```text
    0  1  2  3  4  5  6  7  8  9 
 0 [?] [?] [?] [?] [?] [?] [?] [?] [?] [?] 
 1 [?] [1] [1] [1] [?] [?] [?] [?] [?] [?] 
 2 [?] [1] [0] [1] [?] [?] [?] [?] [?] [?] 
 3 [?] [1] [1] [1] [?] [?] [?] [?] [?] [?] 
```

---

## ⚙️ Cómo Ejecutar
1. **Compilar:**
   ```powershell
   mvn clean compile
   ```
2. **Jugar:**
   ```powershell
   mvn exec:java "-Dexec.mainClass=com.utn.buscaminas.Main"
   ```

---

*Desarrollado por Martin Lantieri - UTN 2026*
