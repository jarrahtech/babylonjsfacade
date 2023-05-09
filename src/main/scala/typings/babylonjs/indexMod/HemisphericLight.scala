package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "HemisphericLight")
@js.native
open class HemisphericLight protected ()
  extends typings.babylonjs.lightsIndexMod.HemisphericLight {
  /**
    * Creates a HemisphericLight object in the scene according to the passed direction (Vector3).
    * The HemisphericLight simulates the ambient environment light, so the passed direction is the light reflection direction, not the incoming direction.
    * The HemisphericLight can't cast shadows.
    * Documentation : https://doc.babylonjs.com/features/featuresDeepDive/lights/lights_introduction
    * @param name The friendly name of the light
    * @param direction The direction of the light reflection
    * @param scene The scene the light belongs to
    */
  def this(
    name: String,
    direction: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}
