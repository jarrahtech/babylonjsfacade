package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "AnaglyphFreeCamera")
@js.native
open class AnaglyphFreeCamera protected ()
  extends typings.babylonjs.legacyLegacyMod.AnaglyphFreeCamera {
  /**
    * Creates a new AnaglyphFreeCamera
    * @param name defines camera name
    * @param position defines initial position
    * @param interaxialDistance defines distance between each color axis
    * @param scene defines the hosting scene
    */
  def this(
    name: String,
    position: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    interaxialDistance: Double
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    interaxialDistance: Double,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}
