package typings.babylonjs.indexMod

import typings.babylonjs.typesMod.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Angle")
@js.native
open class Angle protected ()
  extends typings.babylonjs.mathsIndexMod.Angle {
  /**
    * Creates an Angle object of "radians" radians (float).
    * @param radians the angle in radians
    */
  def this(radians: Double) = this()
}
/* static members */
object Angle {
  
  @JSImport("babylonjs/index", "Angle")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets a new Angle object valued with the gradient angle, in radians, of the line joining two points
    * @param a defines first point as the origin
    * @param b defines point
    * @returns a new Angle
    */
  inline def BetweenTwoPoints(
    a: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector2],
    b: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector2]
  ): typings.babylonjs.mathsMathDotpathMod.Angle = (^.asInstanceOf[js.Dynamic].applyDynamic("BetweenTwoPoints")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotpathMod.Angle]
  
  /**
    * Gets a new Angle object from the given float in degrees
    * @param degrees defines the angle value in degrees
    * @returns a new Angle
    */
  inline def FromDegrees(degrees: Double): typings.babylonjs.mathsMathDotpathMod.Angle = ^.asInstanceOf[js.Dynamic].applyDynamic("FromDegrees")(degrees.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotpathMod.Angle]
  
  /**
    * Gets a new Angle object from the given float in radians
    * @param radians defines the angle value in radians
    * @returns a new Angle
    */
  inline def FromRadians(radians: Double): typings.babylonjs.mathsMathDotpathMod.Angle = ^.asInstanceOf[js.Dynamic].applyDynamic("FromRadians")(radians.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotpathMod.Angle]
}
