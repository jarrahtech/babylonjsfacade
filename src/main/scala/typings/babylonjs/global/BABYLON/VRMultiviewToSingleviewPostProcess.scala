package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.VRMultiviewToSingleviewPostProcess")
@js.native
open class VRMultiviewToSingleviewPostProcess protected ()
  extends StObject
     with typings.babylonjs.BABYLON.VRMultiviewToSingleviewPostProcess {
  /**
    * Initializes a VRMultiviewToSingleview
    * @param name name of the post process
    * @param camera camera to be applied to
    * @param scaleFactor scaling factor to the size of the output texture
    */
  def this(name: String, camera: Nullable[typings.babylonjs.BABYLON.Camera], scaleFactor: Double) = this()
}
