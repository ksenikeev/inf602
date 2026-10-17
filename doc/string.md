# Тип данных строка - String

## Создание

```java
String s1 = "Привет";                    // литерал
String s2 = new String("Привет");       // через конструктор
String s3 = new String(charArray);      // из массива символов
String s4 = String.valueOf(123);        // из других типов
```

## Длина, сравнение

```java
String str = "1234567";
String other = "789";
str.length();              // длина строки
str.isEmpty();             // проверка на пустоту
str.isBlank();            // пустая или только пробелы (Java 11+)
str.contains("abc");       // содержит подстроку
str.startsWith("abc");     // начинается с
str.endsWith("abc");       // заканчивается на
str.equals(other);         // сравнение (с учётом регистра)
str.equalsIgnoreCase(other); // сравнение без учёта регистра
```

## Поиск, подстрока, символ
```java
str.indexOf("abc")        // первое вхождение (-1 если нет)
str.lastIndexOf("abc")    // последнее вхождение
str.charAt(0)             // символ по индексу
str.substring(2)          // подстрока с индекса 2
str.substring(2, 5)       // подстрока [2, 5)
```

## Разделение, слияние
```java
str.split(",")                    // разбить по разделителю → String[]
str.split(",", 3)                 // с ограничением количества
String.join(", ", list)           // объединить коллекцию в строку
```

## Преобразование
```java
str.toUpperCase()
str.toLowerCase()
str.toCharArray()                 // → char[]
str.getBytes()                    // → byte[] (кодировка по умолчанию)
str.getBytes(StandardCharsets.UTF_8)
String.valueOf(obj)               // объект → строка
Integer.parseInt("123")           // строка → число
```
