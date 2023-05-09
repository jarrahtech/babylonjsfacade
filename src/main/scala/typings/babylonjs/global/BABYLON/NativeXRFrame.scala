package typings.babylonjs.global.BABYLON

import org.scalajs.dom.EventTarget
import typings.babylonjs.BABYLON.INativeXRFrame
import typings.babylonjs.XRCPUDepthInformation
import typings.babylonjs.XRHitTestResult
import typings.babylonjs.XRHitTestSource
import typings.babylonjs.XRLightEstimate
import typings.babylonjs.XRLightProbe
import typings.babylonjs.XRPose
import typings.babylonjs.XRReferenceSpace
import typings.babylonjs.XRSession
import typings.babylonjs.XRTransientInputHitTestResult
import typings.babylonjs.XRTransientInputHitTestSource
import typings.babylonjs.XRView
import typings.babylonjs.XRViewerPose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.NativeXRFrame")
@js.native
open class NativeXRFrame protected ()
  extends StObject
     with typings.babylonjs.BABYLON.NativeXRFrame {
  def this(_nativeImpl: INativeXRFrame) = this()
  
  /* CompleteClass */
  override def getDepthInformation(view: XRView): js.UndefOr[XRCPUDepthInformation] = js.native
  
  /* CompleteClass */
  override def getHitTestResults(hitTestSource: XRHitTestSource): js.Array[XRHitTestResult] = js.native
  
  /* CompleteClass */
  override def getHitTestResultsForTransientInput(hitTestSource: XRTransientInputHitTestSource): js.Array[XRTransientInputHitTestResult] = js.native
  
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
  override def getPose(space: EventTarget, baseSpace: EventTarget): js.UndefOr[XRPose] = js.native
  
  /**
    * Provides the pose of the viewer relative to referenceSpace as an XRViewerPose, at the
    * XRFrame's time.
    *
    * @param referenceSpace
    */
  /* CompleteClass */
  override def getViewerPose(referenceSpace: XRReferenceSpace): js.UndefOr[XRViewerPose] = js.native
  
  /* CompleteClass */
  override val session: XRSession = js.native
}
