package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "EasingFunction")
@js.native
open class EasingFunction ()
  extends typings.babylonjs.animationsIndexMod.EasingFunction
/* static members */
object EasingFunction {
  
  /**
    * Interpolation follows the mathematical formula associated with the easing function.
    */
  @JSImport("babylonjs/index", "EasingFunction.EASINGMODE_EASEIN")
  @js.native
  val EASINGMODE_EASEIN: Double = js.native
  
  /**
    * Interpolation uses EaseIn for the first half of the animation and EaseOut for the second half.
    */
  @JSImport("babylonjs/index", "EasingFunction.EASINGMODE_EASEINOUT")
  @js.native
  val EASINGMODE_EASEINOUT: Double = js.native
  
  /**
    * Interpolation follows 100% interpolation minus the output of the formula associated with the easing function.
    */
  @JSImport("babylonjs/index", "EasingFunction.EASINGMODE_EASEOUT")
  @js.native
  val EASINGMODE_EASEOUT: Double = js.native
}
