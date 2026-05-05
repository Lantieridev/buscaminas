# Minesweeper | Tactical Logic Engine

![Minesweeper Banner](buscaminas_banner.png)

## Overview
A high-performance Java implementation of the classic Minesweeper logic game. Re-engineered for the modern terminal, this version features advanced grid processing, dynamic difficulty scaling, and a cinematic CLI interface.

## 🚀 Key Features
- **Sophisticated Game Engine**: Modular grid logic handling recursive cell revelation and mine placement algorithms.
- **Executive Visuals**: Rich ANSI color palettes and professional ASCII branding provide a premium user experience.
- **Multi-Level Difficulty**: Customizable grid dimensions and mine density for scalable challenge levels.
- **Cinematic Feedback**: High-impact visual sequences for victory and loss conditions.

## 🎨 Interface Showcase
The system utilizes a refined grid system with clear status indicators:
- `[?]` (Cian): Hidden Cell.
- `[F]` (Red): Flagged Mine.
- `[0-8]` (Dynamic): Proximity count.
- `[*]` (Yellow): Detonated Mine.

## 🛠️ Technical Stack
- **Language**: Java 21
- **Build System**: Maven
- **Paradigm**: Object-Oriented Design (OOD)
- **Styling**: ANSI Escape Sequences & High-Density ASCII Art

## 📖 How to Run
Ensure you have Maven and a Java 21+ JDK installed, then execute:
```powershell
mvn clean compile
mvn exec:java "-Dexec.mainClass=com.utn.buscaminas.Main"
```

## 👔 Contact
Developed by **Martin Lantieri** | *Lantieridev*
[LinkedIn](https://www.linkedin.com/in/martin-lantieri/) | [GitHub](https://github.com/Lantieridev)
