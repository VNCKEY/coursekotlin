# KOTLIN

VARIABLES

*   variables únicamente lectura `val`
*   variable cambiantes `var`

  

Los mas comunes

| Categori | Type |
| ---| --- |
| Integers | `Byte`, `Short`, `Int`, `Long` |
| Unsigned integers | `UByte`, `UShort`, `UInt`, `ULong` |
| Floating-point numbers | `Float`, `Double` |
| Booleans | `Boolean` |
| Characters | `Char` |
| Strings | `String` |

  

  

INTEGER TYPES

| Type | Size (bits) | Min value | Max value |
| ---| ---| ---| --- |
| `Byte` | 8 | \-128 | 127 |
| `Short` | 16 | \-32768 | 32767 |
| `Int` | 32 | \-2,147,483,648 (-231) | 2,147,483,647 (231 - 1) |
| `Long` | 64 | \-9,223,372,036,854,775,808 (-263) | 9,223,372,036,854,775,807 (263 - 1) |

  

DECIMAL - FLOATING TYPES

| Type | Size (bits) | Significant bits | Exponent bits | Decimal digits |
| ---| ---| ---| ---| --- |
| `Float` | 32 | 24 | 8 | 6-7 |
| `Double` | 64 | 53 | 11 | 15-16 |

```kotlin
val pi = 3.14 // Double
// val one: Double = 1 // Error: type mismatch
val oneDouble = 1.0 // Double
```