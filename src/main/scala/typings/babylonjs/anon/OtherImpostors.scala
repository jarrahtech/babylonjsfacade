package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.PhysicsImpostor
import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherImpostors extends StObject {
  
  def callback(
    collider: PhysicsImpostor,
    collidedAgainst: PhysicsImpostor,
    point: Nullable[Vector3],
    distance: Double,
    impulse: Double,
    normal: Nullable[Vector3]
  ): Unit
  
  var otherImpostors: js.Array[PhysicsImpostor]
}
object OtherImpostors {
  
  inline def apply(
    callback: (PhysicsImpostor, PhysicsImpostor, Nullable[Vector3], Double, Double, Nullable[Vector3]) => Unit,
    otherImpostors: js.Array[PhysicsImpostor]
  ): OtherImpostors = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction6(callback), otherImpostors = otherImpostors.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherImpostors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OtherImpostors] (val x: Self) extends AnyVal {
    
    inline def setCallback(
      value: (PhysicsImpostor, PhysicsImpostor, Nullable[Vector3], Double, Double, Nullable[Vector3]) => Unit
    ): Self = StObject.set(x, "callback", js.Any.fromFunction6(value))
    
    inline def setOtherImpostors(value: js.Array[PhysicsImpostor]): Self = StObject.set(x, "otherImpostors", value.asInstanceOf[js.Any])
    
    inline def setOtherImpostorsVarargs(value: PhysicsImpostor*): Self = StObject.set(x, "otherImpostors", js.Array(value*))
  }
}
