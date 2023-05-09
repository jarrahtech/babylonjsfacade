package typings.babylonjs.global

import typings.babylonjs.XRInputSourceEventInit
import typings.babylonjs.XRInputSourceEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * XRInputSourceEvents are fired to indicate changes to the state of an XRInputSource.
  * ref: https://immersive-web.github.io/webxr/#xrinputsourceevent-interface
  */
@JSGlobal("XRInputSourceEvent")
@js.native
open class XRInputSourceEvent protected ()
  extends StObject
     with typings.babylonjs.XRInputSourceEvent {
  def this(`type`: XRInputSourceEventType) = this()
  def this(`type`: XRInputSourceEventType, eventInitDict: XRInputSourceEventInit) = this()
}
