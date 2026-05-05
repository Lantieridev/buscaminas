# Minesweeper - Java Console Game 💣🚩

> [!NOTE]
> **Academic Exercise:** This project was developed as an exam simulation for the Backend Programming course at UTN FRC (2026).

Welcome to **Minesweeper**! The classic logic game reinvented for the terminal with an aesthetic interface and support for multiple difficulties.

## 🚀 About the Project
This project implements the Minesweeper game engine in Java, focusing on modularity and the console user experience.

### 🛠️ Technologies Used
*   **Language:** Java 21.
*   **Build Tool:** Maven.
*   **Interface:** Console with ANSI colors and ASCII banners.

---

## 📸 Game Interface (CLI Showcase)

### 1. Startup and Banner
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

### 2. Game Board
```text
    0  1  2  3  4  5  6  7  8  9 
  0 [?] [?] [?] [?] [?] [?] [?] [?] [?] [?] 
  1 [?] [1] [1] [1] [?] [?] [?] [?] [?] [?] 
  2 [?] [1] [0] [1] [?] [?] [?] [?] [?] [?] 
  3 [?] [1] [1] [1] [?] [?] [?] [?] [?] [?] 
```

### 3. Defeat Screen (Explosion)
```text
              _ ._  _ , _ ._             
            (_ ' ( `  )_  .__)           
          ( (  (    )   `)  ) _)         
         (__ (_   (_ . _) _) ,__)        
             `~~`\ ' . /`~~`             
                  |   |                  
                  |   |                  
                  '-' '-'                

        ¡¡¡ B O O O O O O M !!!          
       You hit a mine. Game over.
==========================================
```

### 4. Victory Screen
```text
******************************************
        FIELD SUCCESSFULLY CLEARED!       
******************************************
    🏆  You are an expert sapper!     
******************************************
```

---

## ⚙️ How to Run
1. **Compile:**
   ```powershell
   mvn clean compile
   ```
2. **Play:**
   ```powershell
   mvn exec:java "-Dexec.mainClass=com.utn.buscaminas.Main"
   ```

---

*Developed by Martin Lantieri - UTN 2026*
