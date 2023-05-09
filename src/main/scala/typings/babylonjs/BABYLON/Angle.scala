package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Angle extends StObject {
  
  /* private */ var _radians: Any
  
  /**
    * Get value in degrees
    * @returns the Angle value in degrees (float)
    */
  def degrees(): Double
  
  /**
    * Get value in radians
    * @returns the Angle value in radians (float)
    */
  def radians(): Double
}
object Angle {
  
  inline def apply(_radians: Any, degrees: () => Double, radians: () => Double): Angle = {
    val __obj = js.Dynamic.literal(_radians = _radians.asInstanceOf[js.Any], degrees = js.Any.fromFunction0(degrees), radians = js.Any.fromFunction0(radians))
    __obj.asInstanceOf[Angle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Angle] (val x: Self) extends AnyVal {
    
    inline def setDegrees(value: () => Double): Self = StObject.set(x, "degrees", js.Any.fromFunction0(value))
    
    inline def setRadians(value: () => Double): Self = StObject.set(x, "radians", js.Any.fromFunction0(value))
    
    inline def set_radians(value: Any): Self = StObject.set(x, "_radians", value.asInstanceOf[js.Any])
  }
}
