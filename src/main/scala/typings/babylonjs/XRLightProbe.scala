package typings.babylonjs

import org.scalajs.dom.Event
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRLightProbe
  extends StObject
     with EventTarget {
  
  def onreflectionchange(evt: Event): Any = js.native
  @JSName("onreflectionchange")
  var onreflectionchange_Original: XREventHandler = js.native
  
  val probeSpace: org.scalajs.dom.EventTarget = js.native
}
