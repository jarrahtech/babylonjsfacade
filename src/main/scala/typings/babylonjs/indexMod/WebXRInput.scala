package typings.babylonjs.indexMod

import typings.babylonjs.xRWebXRInputMod.IWebXRInputOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXRInput")
@js.native
open class WebXRInput protected ()
  extends typings.babylonjs.xRIndexMod.WebXRInput {
  /**
    * Initializes the WebXRInput
    * @param xrSessionManager the xr session manager for this session
    * @param xrCamera the WebXR camera for this session. Mainly used for teleportation
    * @param _options = initialization options for this xr input
    */
  def this(
    /**
    * the xr session manager for this session
    */
  xrSessionManager: typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager,
    /**
    * the WebXR camera for this session. Mainly used for teleportation
    */
  xrCamera: typings.babylonjs.xRWebXRCameraMod.WebXRCamera
  ) = this()
  def this(
    /**
    * the xr session manager for this session
    */
  xrSessionManager: typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager,
    /**
    * the WebXR camera for this session. Mainly used for teleportation
    */
  xrCamera: typings.babylonjs.xRWebXRCameraMod.WebXRCamera,
    _options: IWebXRInputOptions
  ) = this()
}
