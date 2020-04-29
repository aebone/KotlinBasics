# Kotlin Basics

### Mutable and immutable variables

Before proceeding, it's important to know that Kotlin has two types of variables:

* `var` - it's mutable (variable)
* `val` - it's immutable (constant)

Why is `val` preferred?

* **Legible**: as the value doesn't change, the developer doesn't need to look for that variable in other places. It's easier to understand, less complex.
* **Testable**: it's easier to test because it minimizes state changing.
* **Thread-safe**: it doesn't allow to be changed in another thread

Now, let's move on :)

---

1. ## Data Types

When declaring variables, it's not required to pass the type. Kotlin infers it from the value.   
All the data types are objects, some of the types like numbers, characters and booleans can be represented as primitive values at runtime. But to the user, they look like ordinary classes.

More info on data types can be founded [here](https://kotlinlang.org/docs/reference/basic-types.html).

### Numbers

#### Integers

If we don’t specify the number type Kotlin infers that it's an `Int`, unless the value exceeds the maximum allowed. In this case, it infers that it's a `Long`.   
To explicitly create a `Long` attribute, just add an 'L' at the end (ie.: `val longNumber = 1234L`).   

It's possible to use underscores to make numbers more readable:
`val oneMillion = 1_000_000`

Here's a table with the number types and their range:

| Type | Size (bits) | Min value | Max value |
| --- | --- | --- | --- |
| Byte | 8 | -128 | 127 |
| Short | 16 | -32768 | 32767 |
| Int | 32 | -2,147,483,648 (-2^31) | 2,147,483,647 (2^31 - 1) |
| Long | 64 | -9,223,372,036,854,775,808 (-2^63) | 9,223,372,036,854,775,807 (2^63 - 1) |

#### Floating points

We can use `Float` and `Double` types for floating types.   
In general, we use `Double` because it's more precise.   

`Double` is the default type for floating points, so Kotlin will infer that it is a `Double` if we don't specify the type. 
To specify it, we just have to add an 'F' at the end of the number (IE.: `var n: Float = 77.9F`).   

A `Float` can hold 6-7 decimal digits while `Double` can hold 15-16 digits. So, if a `Float` number has more than 7 digits, the number will be rounded. (ie.: 2.7182818284f will be 2.7182817).

#### Conversion

To convert a number we can use the following functions:

* `toByte()`
* `toShort()`
* `toInt()`
* `toLong()`
* `toFloat()`
* `toDouble()`
* `toChar()`

***Note**: Kotlin does not convert numbers in function parameters. Therefore, a function with a Double parameter can be called only on Double values.*

### Boolean

A `Boolean` type can be only `true` or `false`. The operations are:  

* Disjunction - OR ( `||` )

| Variable 1 | Variable 2 | Result |
| --- | --- | --- |
| `false` | `false` | `false` |
| `false` | `true` | `true` |
| `true` | `false` | `true` |
| `true` | `true` | `true` |

* Conjunction - AND ( `&&` )

| Variable 1 | Variable 2 | Result |
| --- | --- | --- |
| `false` | `false` | `false` |
| `false` | `true` | `false` |
| `true` | `false` | `false` |
| `true` | `true` | `true` |

* Negation ( `!` ) - denies the current result:   
**`true` equals `!false`**

### Characters

A `Char` cannot be treated directly as a number. As it happens in the `String` type, special characters can be escaped using a backslash (`\`).    
To create a `Char`, you need to use single quotes (`'a'`), if you use double quotes (`"a"`) it will be a `String`.   
The supported types are character, *ASCII* (numerical representation of a character - the supported ones are `\t`, `\b`, `\n`, `\r`, `\'`, `\"`, `\\` and `\$)`, and Unicode (provides unique code number for every character):

| Type | Example |
| --- | --- |
| Char | `val letter = 'a'` |
| ASCII | `val dollarSign = '\$'` |
| Unicode | `val infinitySign = '\u221E'` |

### Strings

