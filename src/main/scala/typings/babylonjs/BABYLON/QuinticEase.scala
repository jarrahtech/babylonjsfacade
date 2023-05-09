package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuinticEase
  extends StObject
     with EasingFunction
object QuinticEase {
  
  inline def apply(
    _easingMode: Any,
    ease: Double => Double,
    easeInCore: Double => Double,
    getEasingMode: () => Double,
    setEasingMode: Double => Unit
  ): QuinticEase = {
    val __obj = js.Dynamic.literal(_easingMode = _easingMode.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), easeInCore = js.Any.fromFunction1(easeInCore), getEasingMode = js.Any.fromFunction0(getEasingMode), setEasingMode = js.Any.fromFunction1(setEasingMode))
    __obj.asInstanceOf[QuinticEase]
  }
}
