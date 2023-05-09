package typings.babylonjs.global

import org.scalajs.dom.EventTarget
import typings.babylonjs.XRCPUDepthInformation
import typings.babylonjs.XRLightEstimate
import typings.babylonjs.XRLightProbe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a snapshot of the state of all of the tracked objects for an XRSession. Applications
  * can acquire an XRFrame by calling requestAnimationFrame() on an XRSession with an
  * XRFrameRequestCallback. When the callback is called it will be passed an XRFrame.
  * Events which need to communicate tracking state, such as the select event, will also provide an
  * XRFrame.
  *
  * ref: https://immersive-web.github.io/webxr/#xrframe-interface
  */
/* note: abstract class */ @JSGlobal("XRFrame")
@js.native
open class XRFrame ()
  extends StObject
     with typings.babylonjs.XRFrame {
  
  /* CompleteClass */
  override def getDepthInformation(view: typings.babylonjs.XRView): js.UndefOr[XRCPUDepthInformation] = js.native
  
  /* CompleteClass */
  override def getHitTestResults(hitTestSource: typings.babylonjs.XRHitTestSource): js.Array[typings.babylonjs.XRHitTestResult] = js.native
  
  /* CompleteClass */
  override def getHitTestResultsForTransientInput(hitTestSource: typings.babylonjs.XRTransientInputHitTestSource): js.Array[typings.babylonjs.XRTransientInputHitTestResult] = js.native
  
  /* CompleteClass */
  override def getLightEstimate(xrLightProbe: XRLightProbe): XRLightEstimate = js.native
  
  /**
    * Provides the pose of space relative to baseSpace as an XRPose, at the time represented by
    * the XRFrame.
    *
    * @param space
    * @param baseSpace
    */
  /* CompleteClass */
  override def getPose(space: EventTarget, baseSpace: EventTarget): js.UndefOr[typings.babylonjs.XRPose] = js.native
  
  /**
    * Provides the pose of the viewer relative to referenceSpace as an XRViewerPose, at the
    * XRFrame's time.
    *
    * @param referenceSpace
    */
  /* CompleteClass */
  override def getViewerPose(referenceSpace: typings.babylonjs.XRReferenceSpace): js.UndefOr[typings.babylonjs.XRViewerPose] = js.native
  
  /* CompleteClass */
  override val session: typings.babylonjs.XRSession = js.native
}
