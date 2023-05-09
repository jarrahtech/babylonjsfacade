package typings.babylonjs

import typings.babylonjs.camerasGamepadCameraMod.GamepadCamera
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasStereoscopicStereoscopicGamepadCameraMod {
  
  @JSImport("babylonjs/Cameras/Stereoscopic/stereoscopicGamepadCamera", "StereoscopicGamepadCamera")
  @js.native
  open class StereoscopicGamepadCamera protected () extends GamepadCamera {
    /**
      * Creates a new StereoscopicGamepadCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param interaxialDistance defines distance between each color axis
      * @param isStereoscopicSideBySide defines is stereoscopic is done side by side or over under
      * @param scene defines the hosting scene
      */
    def this(name: String, position: Vector3, interaxialDistance: Double, isStereoscopicSideBySide: Boolean) = this()
    def this(
      name: String,
      position: Vector3,
      interaxialDistance: Double,
      isStereoscopicSideBySide: Boolean,
      scene: Scene
    ) = this()
    
    /* protected */ var _setRigMode: Any = js.native
  }
}
