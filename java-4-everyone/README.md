The major difference between an **interface** and an **abstract class**
is that an interface defines a contract for behavior (what a class can do), 
while an abstract class defines a base identity (what a class is).

An interface is a contract:
“Any class implementing me MUST provide this behavior.”
- It defines:
what must be done (method signatures)
NOT how it’s done (implementation)

### sealed interfaces
- Sealed types let you explicitly control who can extend/implement something.

- Each permitted class must be one of:
1. final → cannot be extended further
2. sealed → continues restricting
3. non-sealed → opens it up again