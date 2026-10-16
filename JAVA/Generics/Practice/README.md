# Java Generics Practice

Small Java examples for practicing generic classes, bounded type usage, and
wildcard collections.

## Examples

- `Main.java` - Uses generic `Phone<String>` and `Box<Integer>` instances.
- `Locker.java` - Stores and retrieves values with a generic `Locker<T>`.
- `Wildcard.java` - Prints lists of different types through `List<?>`.

## Running an example

From this directory, compile and run an example with:

```powershell
javac -d . Locker.java
java JAVA.Generics.Practice.gen
```

For the wildcard example:

```powershell
javac -d . Wildcard.java
java JAVA.Generics.Practice.Wildcard
```

`Main.java` currently references `Box<Integer>`, but this directory does not
contain a `Box` class. Add or provide that class before compiling `Main.java`.
