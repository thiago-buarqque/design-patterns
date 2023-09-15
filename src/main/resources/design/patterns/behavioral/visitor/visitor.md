## Visitor

**Goal**: 

Refactoring Guru: "separate algorithms from the objects on which they operate."

GOF: Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements it operates on

**How:** 

Detach logic related to a hierarchy of classes to a Visitor, which has a method for each of the subclasses.

### Example

Consider a game engine that contains a GameCharacter that shoots an Projectile. 
While a Projectile is being thrown the Character can receive a buff (or debuff) and 
have its projectile speed/damage changed. Considering that, the GameCharacter
could have a base Projectile that is cloned when shoot and its clone start listening
to the base Projectile. When the base Projectile changes, theirs listeners will also be updated.

[Diagrama em breve]