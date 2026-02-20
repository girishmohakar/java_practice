# ☕ Java Variables & Type Conversions

### 📘 A Complete Guide to Type Casting & User Input in Java

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![Beginner Friendly](https://img.shields.io/badge/Level-Beginner%20Friendly-brightgreen)
![License](https://img.shields.io/badge/License-MIT-blue)
![Status](https://img.shields.io/badge/Status-Active-success)

---

## 📑 Table of Contents

1. [📌 Introduction](#-introduction)
2. [🔤 Variables in Java](#-variables-in-java)

   * [Primitive Data Types](#primitive-data-types)
   * [Non-Primitive Data Types](#non-primitive-data-types)
3. [🔄 Type Conversion in Java](#-type-conversion-in-java)
4. [⌨️ Java User Input](#-java-user-input)
5. [📊 Type Casting Comparison Table](#-type-casting-comparison-table)
6. [🧠 Best Practices](#-best-practices)
7. [🚀 Example Program](#-example-program)

---

## 📌 Introduction

Java is a strongly typed language, meaning every variable must have a declared data type.

In this guide, you'll learn:

* ✅ How variables work in Java
* ✅ How type conversion works
* ✅ How to use type casting
* ✅ How to take user input and convert it properly

---

# 🔤 Variables in Java

A **variable** is a container that stores data values.

### 📝 Syntax:

```java
dataType variableName = value;
```

### Example:

```java
int age = 25;
double salary = 50000.50;
char grade = 'A';
```

---

## Primitive Data Types

| Data Type | Size    | Example             | Description      |
| --------- | ------- | ------------------- | ---------------- |
| byte      | 1 byte  | `byte b = 10;`      | Small integers   |
| short     | 2 bytes | `short s = 100;`    | Larger than byte |
| int       | 4 bytes | `int num = 1000;`   | Default integer  |
| long      | 8 bytes | `long l = 10000L;`  | Large integers   |
| float     | 4 bytes | `float f = 10.5f;`  | Decimal numbers  |
| double    | 8 bytes | `double d = 20.99;` | Default decimal  |
| char      | 2 bytes | `char c = 'A';`     | Single character |
| boolean   | 1 bit   | `boolean b = true;` | true/false       |

---

## Non-Primitive Data Types

* String
* Arrays
* Classes
* Interfaces

Example:

```java
String name = "John";
```

---

# 🔄 Type Conversion in Java

Type conversion means converting one data type into another.

There are **two types**:

---

## 🔹 Implicit Type Casting (Widening)

* Done automatically by Java
* Converting smaller type → larger type
* No data loss

### Conversion Order:

```
byte → short → int → long → float → double
```

### Example:

```java
int num = 100;
double value = num;  // automatic conversion
```

---

## 🔹 Explicit Type Casting (Narrowing)

* Done manually
* Larger type → smaller type
* Possible data loss

### Syntax:

```java
dataType variable = (dataType) value;
```

### Example:

```java
double num = 10.75;
int value = (int) num;  // 10 (decimal lost)
```

---

# ⌨️ Java User Input

To take input from users, Java uses the **Scanner** class from:

```java
import java.util.Scanner;
```

---

# 📊 Type Casting Comparison Table

| Feature       | Implicit Casting | Explicit Casting |
| ------------- | ---------------- | ---------------- |
| Also Called   | Widening         | Narrowing        |
| Manual?       | ❌ No             | ✅ Yes            |
| Data Loss     | ❌ No             | ⚠️ Possible      |
| Example       | `int → double`   | `double → int`   |
| Syntax Needed | No               | Yes `(type)`     |

---

# 🧠 Best Practices

✔ Always choose the correct data type
✔ Avoid unnecessary type casting
✔ Be careful with narrowing (data loss risk)
✔ Close Scanner using `sc.close()` or enter the scanner statement in try () {}
✔ Validate user input

---

# 🎯 Summary

| Topic            | Key Point                         |
| ---------------- | --------------------------------- |
| Variables        | Store values with a declared type |
| Implicit Casting | Automatic (small → large)         |
| Explicit Casting | Manual (large → small)            |
| Scanner          | Used for user input               |
| Data Loss        | Happens in narrowing              |

---

## 📚 Keep Learning

Practice writing small programs that:

* Convert temperature (int → double)
* Convert double to int
* Take string input and convert to integer

---

### 💡 Author Notes

This README is perfect for:

* Beginners learning Java
* Students preparing for exams
* Quick revision before interviews

