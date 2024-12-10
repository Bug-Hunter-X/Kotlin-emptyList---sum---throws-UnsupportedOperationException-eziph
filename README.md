# Kotlin Empty List Sum Bug

This repository demonstrates a common error in Kotlin: attempting to calculate the sum of an empty list using the `sum()` function.  This results in an `UnsupportedOperationException`.

The `BuggySum.kt` file shows the problematic code. The `FixedSum.kt` file provides a solution using the Elvis operator to handle the empty list case gracefully.

This is a crucial example for understanding null safety and the proper handling of edge cases in Kotlin.