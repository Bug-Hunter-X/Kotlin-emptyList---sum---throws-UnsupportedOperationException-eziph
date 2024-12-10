```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers.size) // This will print 2
    println(evenNumbers.sum()) //This will print 6

    val emptyList = emptyList<Int>()
    //Solution using elvis operator
    println(emptyList.sumOrNull() ?: 0) // Prints 0
}
```