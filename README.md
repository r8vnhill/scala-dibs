# 📚 scala-dibs — DIBS Course Companion for Scala

[![License: BSD-2-Clause](https://img.shields.io/badge/License-BSD%202--Clause-blue.svg)](./LICENSE)
[![Scala](https://img.shields.io/badge/Scala-3.0%2B-blue?logo=scala)](https://www.scala-lang.org/download/)
[![Educational](https://img.shields.io/badge/purpose-educational-yellow)](https://dibs.ravenhill.cl)
[![Status](https://img.shields.io/badge/status-stable-brightgreen)]()
[![DIBS Site](https://img.shields.io/badge/website-dibs.ravenhill.cl-purple)](https://dibs.ravenhill.cl)

Companion code for the **“Diseño e Implementación de Bibliotecas de Software” (DIBS)** course, demonstrating core Scala techniques for building reusable libraries.

>[!note]
> The course lectures and materials are in Spanish, but **all code and documentation here are in English** for wider accessibility.

## 📖 Table of Contents

- [📚 scala-dibs — DIBS Course Companion for Scala](#-scala-dibs--dibs-course-companion-for-scala)
  - [📖 Table of Contents](#-table-of-contents)
  - [🎓 Lessons](#-lessons)
  - [🔍 Overview](#-overview)
  - [📝 Getting Started](#-getting-started)
    - [Prerequisites](#prerequisites)
    - [Clone \& Compile](#clone--compile)
  - [🤝 Contributing](#-contributing)
  - [🛡️ License](#️-license)

## 🎓 Lessons

This repository contains code examples for the following lessons:

1. **[Product Types as Scala Classes](https://dibs.ravenhill.cl/docs/type-fundamentals/algebraic-data-types/classes/scala/)**

## 🔍 Overview

This repo contains small, focused examples that illustrate:

- **Product Types** with ordinary Scala classes  
- **Primary & Secondary Constructors**, default parameters, and initialization logic  
- **Compile-time Safety** via named and typed fields  
- **Idiomatic Scala 3** features (no `new`, `@main` entry points)

These patterns are essential when designing robust, maintainable, and reusable libraries in Scala.

## 📝 Getting Started

### Prerequisites

- **Java** 11 or newer  
- **sbt** 1.6+ (Scala Build Tool)  
- (Optional) An IDE with Scala support, e.g., IntelliJ IDEA or VS Code + Metals  

### Clone & Compile

```bash
git clone https://github.com/r8vnhill/scala-dibs.git
cd scala-dibs
sbt compile
```

## 🤝 Contributing

This repository is intended as an **educational companion** and isn’t actively maintained as a library.
Still, if you spot an error, have an improvement, or a question:

1. Open an issue: [https://github.com/r8vnhill/scala-dibs/issues](https://github.com/r8vnhill/scala-dibs/issues)
2. Read our [Code of Conduct](./CODE_OF_CONDUCT.md)

Feel free to fork and adapt these examples for your own teaching or learning!

## 🛡️ License

This project is licensed under the **[BSD 2-Clause License](./LICENSE)**.
Use freely in educational or personal projects, with attribution.

> For the full DIBS course materials (in Spanish), visit the [official DIBS site](https://dibs.ravenhill.cl).
