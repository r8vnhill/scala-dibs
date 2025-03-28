# scala-dibs

This repository contains code examples from the **Scala lessons** of the course _Diseño e implementación de bibliotecas de software_ (Design and Implementation of Software Libraries), also known as **DIBS**. The course is taught in Spanish, but both the code and repository are fully in English to ensure broader accessibility.

## 📚 About the Course

DIBS is a university-level course focused on the design and implementation of reusable and maintainable software libraries. The Scala lessons cover key concepts such as object-oriented programming, functional programming, testing, and property-based testing.

## ✨ Features

- Multi-module **Scala 3** project, built with **SBT**.
- Support for both **Scala 2** and **Scala 3** code examples.
- Clean project structure with shared configuration via a custom plugin (`CommonSettingsPlugin`).
- Includes examples on:
  - Functional programming (e.g., lambdas, functors)
  - Property-based testing and generators
  - OOP concepts (open classes, operator overloading)
  - Error handling and exceptions

## 🏗️ Build Configuration

This project uses **SBT 1.x** and targets **Scala 3.5.1** (with some Scala 2.13 code under `scala-2/`).

The root project is named `scala3-dibs` and aggregates the following modules:

- `intro`: Basic concepts and exception handling
- `testing`: 
  - `pbt`: Property-based testing
    - `biggest`: Example with generators
    - `generators`: Custom generator examples
    - `stats`: Statistics and shrinking
- `oop`:
  - `open-final`: Sealed, open, and final classes
  - `operator-overload`: Operator overloading in Scala
- `fp`: Functional programming concepts like functors and lambdas

All modules follow a consistent naming and packaging strategy (`cl.ravenhill`).

### 🧪 Running Tasks

To compile and test modules, use:

```bash
sbt compile
sbt test
sbt root/compile
```

## 📂 Project Layout

The repository is structured by language version:

- `scala-3/`: Main Scala 3 modules and examples (organized into `intro`, `oop`, `fp`, `testing`)
- `scala-2/`: Selected Scala 2 versions of the same examples (for comparison and backwards compatibility)

Each module contains a typical `src/main/scala` and `src/test/scala` structure.

## 🚀 Getting Started

To get started:

1. Install [SBT](https://www.scala-sbt.org/download.html)
2. Clone this repository:
   ```bash
   git clone https://github.com/r8vnhill/scala-dibs.git
   cd scala-dibs
   ```
3. Compile and run:
   ```bash
   sbt compile
   sbt test
   ```

## ⚠️ Notes

- This code is for educational purposes and meant to support the teaching of library design principles in Scala.
- While the course is in Spanish, all identifiers and documentation in this repo are in English.

## 📝 License

BSD-2-Clause License. This project is licensed under the BSD-2-Clause License. See [LICENSE](./LICENSE) for more information.
