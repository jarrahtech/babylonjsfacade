package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IWebXRControllerOptions
import typings.babylonjs.XRInputSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRInputSource")
@js.native
open class WebXRInputSource protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRInputSource {
  /**
    * Creates the input source object
    * @see https://doc.babylonjs.com/features/featuresDeepDive/webXR/webXRInputControllerSupport
    * @param _scene the scene which the controller should be associated to
    * @param inputSource the underlying input source for the controller
    * @param _options options for this controller creation
    */
  def this(
    _scene: typings.babylonjs.BABYLON.Scene,
    /** The underlying input source for the controller  */
  inputSource: XRInputSource
  ) = this()
  def this(
    _scene: typings.babylonjs.BABYLON.Scene,
    /** The underlying input source for the controller  */
  inputSource: XRInputSource,
    _options: IWebXRControllerOptions
  ) = this()
}
