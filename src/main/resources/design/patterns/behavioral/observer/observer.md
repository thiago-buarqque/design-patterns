## Observer

**Goal**: observe an object state and perform actions (or update self state) on changing state.

### Example

Consider a game engine that contains a GameCharacter that shoots an Projectile. 
While a Projectile is being thrown the Character can receive a buff (or debuff) and 
have its projectile speed/damage changed. Considering that, the GameCharacter
could have a base Projectile that is cloned when shoot and its clone start listening
to the base Projectile. When the base Projectile changes, theirs listeners will also be updated.

[Diagrama em breve]