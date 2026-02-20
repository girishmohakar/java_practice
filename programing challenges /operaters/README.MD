# ☕ Java Operators & Basics – Practice Programs

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![OOP](https://img.shields.io/badge/Concepts-Operators-blue)
![Beginner Friendly](https://img.shields.io/badge/Level-Beginner-green)
![Status](https://img.shields.io/badge/Project-Active-success)

> 📘 A beginner-friendly Java project covering **Arithmetic, Relational, Logical, Unary, Assignment, and Shorthand operators** with practical examples.

---

## 📑 Table of Contents

* [📌 Project Overview](#-project-overview)
* [📂 Project Structure](#-project-structure)
* [🧮 Arithmetic Operators](#-arithmeticjava)
* [🔍 Relational Operators](#-relationaljava)
* [📝 Assignment Operators](#-assignmentjava)
* [➕ Shorthand Operators](#-shorthandjava)
* [⚡ Unary Operators](#-unaryjava)
* [🧠 Logical Operators](#-logicaljava)
* [🚀 How to Run](#-how-to-run)
* [🎯 Learning Outcomes](#-learning-outcomes)

---

# 📌 Project Overview

This project contains multiple Java files demonstrating different types of operators and basic variable usage.

It is ideal for:

* 👨‍🎓 Beginners learning Java
* 🏫 Students practicing operator concepts
* 💻 Lab assignments or revision practice

---

# 📂 Project Structure

| File Name         | Description                        | 
| ----------------- | ---------------------------------- |
| `Arithmatic.java` | Basic arithmetic operations        |
| `Relational.java` | Driving license eligibility check  |
| `Shorthand.java`  | Addition using shorthand operators |
| `Unary.java`      | Demonstrates unary operators       | 
| `assignment.java` | Basic variable assignment          |
| `logical.java`    | Logical operator examples          |

---

# 🧮 Arithmatic.java

![Image](https://www.w3resource.com/w3r_images/arithmetic-operator-image1.png)

![Image](https://codescracker.com/java/images/java-add-subtract-multiply-divide.JPG)

![Image](https://s2.dmcdn.net/v/6A9Av1JKU86oOF3uI/x1080)

![Image](https://i.sstatic.net/VgjIu.png)

### 📌 Concepts Covered

* Addition (`+`)
* Subtraction (`-`)
* Multiplication (`*`)
* Division (`/`)
* Modulus (`%`)

### 💡 Example Operations

```java
int a = 10;
int b = 5;

System.out.println("Addition: " + (a + b));
System.out.println("Subtraction: " + (a - b));
System.out.println("Multiplication: " + (a * b));
System.out.println("Division: " + (a / b));
System.out.println("Modulus: " + (a % b));
```

---

# 🔍 Relational.java

![Image](https://journaldev.nyc3.cdn.digitaloceanspaces.com/2019/07/relational-operators-java-example.png)

![Image](https://www.simplilearn.com/ice9/free_resources_article_thumb/JavaIf-elsecode7_1.png)

![Image](https://media.cheggcdn.com/media/4fd/4fdb452a-1a3f-44de-a744-f2caa46aa5de/php7QpBRN)

![Image](https://media.licdn.com/dms/image/v2/D5605AQFf7FL0mvEIJA/videocover-low/videocover-low/0/1725725360126?e=2147483647\&t=_6tWxJIZY-RKiElva6Ec2M870D7WZV0n0nS7hkHotLo\&v=beta)

### 📌 Concepts Covered

* Greater than (`>`)
* Less than (`<`)
* Equal to (`==`)
* Not equal to (`!=`)
* Greater than or equal to (`>=`)
* Less than or equal to (`<=`)

### 🚗 Driving License Eligibility Logic

```java
int age = 18;

if (age >= 18) {
    System.out.println("Eligible for Driving License");
} else {
    System.out.println("Not Eligible");
}
```

---

# 📝 assignment.java

### 📌 Concepts Covered

* Basic variable assignment
* Reassignment of values

```java
int number = 10;
System.out.println(number);

number = 20;  // reassignment
System.out.println(number);
```

---

# ➕ Shorthand.java

![Image](https://www.w3resource.com/w3r_images/java-assignment-operator-image2.png)

![Image](https://journaldev.nyc3.cdn.digitaloceanspaces.com/2019/07/relational-operators-java-example.png)

![Image](https://www.btechsmartclass.com/java/java_images/java-bitwise-operators-example.png)

![Image](https://www.w3resource.com/w3r_images/java-assignment-operator-image4.png)

### 📌 Concepts Covered

* `+=`
* `-=`
* `*=`
* `/=`
* `%=`
* Taking user input using `Scanner`

### 💡 Example

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int num = sc.nextInt();

num += 5;  // shorthand addition
System.out.println("Updated value: " + num);
```

---

# ⚡ Unary.java

![Image](https://scaler.com/topics/images/types-of-unary-operator.webp)

![Image](https://miro.medium.com/v2/resize%3Afit%3A970/1%2AqR9zrgsMoyasMbBpwFJX1g.png)

![Image](https://www.btechsmartclass.com/java/java_images/java-bitwise-operators-example.png)

![Image](https://s3-ap-southeast-1.amazonaws.com/djamblog/article-290719132543.png)

### 📌 Concepts Covered

* Increment (`++`)
* Decrement (`--`)
* Pre-increment
* Post-increment

### 💡 Example

```java
int a = 5;

System.out.println(++a); // Pre-increment
System.out.println(a++); // Post-increment
System.out.println(a);
```

---

# 🧠 logical.java

![Image](https://www.btechsmartclass.com/java/java_images/java-logical-operators-example.png)

![Image](https://dotnettrickscloud.blob.core.windows.net/img/java/2820230115182228.png)

![Image](https://journaldev.nyc3.cdn.digitaloceanspaces.com/2019/07/relational-operators-java-example.png)

### 📌 Concepts Covered

* AND (`&&`)
* OR (`||`)
* NOT (`!`)

### 💡 Example

```java
int age = 20;
boolean hasID = true;

if (age >= 18 && hasID) {
    System.out.println("Allowed Entry");
}
```

---

# 🚀 How to Run

### 1️⃣ Compile the file

```bash
javac FileName.java
```

### 2️⃣ Run the program

```bash
java FileName
```

Example:

```bash
javac Arithmatic.java
java Arithmatic
```

---

# 🎯 Learning Outcomes

After completing this project, you will understand:

✅ Java variable assignment
✅ Arithmetic operators
✅ Relational comparisons
✅ Logical operations
✅ Unary operators
✅ Shorthand operators
✅ Basic user input

---

# 📊 Operator Summary Table

| Operator Type | Symbols           | Purpose                   |    |                    |
| ------------- | ----------------- | ------------------------- | -- | ------------------ |
| Arithmetic    | `+ - * / %`       | Mathematical calculations |    |                    |
| Relational    | `> < >= <= == !=` | Comparisons               |    |                    |
| Logical       | `&&               |                           | !` | Combine conditions |
| Unary         | `++ --`           | Increment/Decrement       |    |                    |
| Assignment    | `=`               | Assign values             |    |                    |
| Shorthand     | `+= -= *= /= %=`  | Short form assignment     |    |                    |

---

# 🏆 Conclusion

This project builds a **strong foundation in Java operators**, which are essential for:

* Decision making
* Loops
* Conditional logic
* Real-world applications
