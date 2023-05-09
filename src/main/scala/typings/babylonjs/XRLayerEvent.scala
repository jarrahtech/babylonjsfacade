package typings.babylonjs

import org.scalajs.dom.EventTarget
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRLayerEvent
  extends StObject
     with Event {
  
  val layer: EventTarget = js.native
  
  @JSName("type")
  val type_XRLayerEvent: XRLayerEventType = js.native
}
