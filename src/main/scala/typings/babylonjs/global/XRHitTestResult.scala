package typings.babylonjs.global

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("XRHitTestResult")
@js.native
open class XRHitTestResult ()
  extends StObject
     with typings.babylonjs.XRHitTestResult {
  
  /* CompleteClass */
  override def getPose(baseSpace: EventTarget): js.UndefOr[typings.babylonjs.XRPose] = js.native
}
