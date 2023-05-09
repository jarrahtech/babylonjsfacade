package typings.babylonjs.mod

import typings.babylonjs.XRInputSource
import typings.babylonjs.xRWebXRInputSourceMod.IWebXRControllerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXRInputSource")
@js.native
open class WebXRInputSource protected ()
  extends typings.babylonjs.legacyLegacyMod.WebXRInputSource {
  /**
    * Creates the input source object
    * @see https://doc.babylonjs.com/features/featuresDeepDive/webXR/webXRInputControllerSupport
    * @param _scene the scene which the controller should be associated to
    * @param inputSource the underlying input source for the controller
    * @param _options options for this controller creation
    */
  def this(
    _scene: typings.babylonjs.sceneMod.Scene,
    /** The underlying input source for the controller  */
  inputSource: XRInputSource
  ) = this()
  def this(
    _scene: typings.babylonjs.sceneMod.Scene,
    /** The underlying input source for the controller  */
  inputSource: XRInputSource,
    _options: IWebXRControllerOptions
  ) = this()
}
