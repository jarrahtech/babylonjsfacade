package typings.babylonjs.BABYLON

import org.scalajs.dom.EventTarget
import typings.babylonjs.XRCPUDepthInformation
import typings.babylonjs.XRFrame
import typings.babylonjs.XRHitTestResult
import typings.babylonjs.XRHitTestSource
import typings.babylonjs.XRImageTrackingResult
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

/** @internal */
trait INativeXRFrame
  extends StObject
     with XRFrame {
  
  var _imageTrackingResults: js.UndefOr[js.Array[XRImageTrackingResult]] = js.undefined
  
  def getPoseData(
    space: EventTarget,
    baseSpace: XRReferenceSpace,
    vectorBuffer: js.typedarray.ArrayBuffer,
    matrixBuffer: js.typedarray.ArrayBuffer
  ): XRPose
}
object INativeXRFrame {
  
  inline def apply(
    getDepthInformation: XRView => js.UndefOr[XRCPUDepthInformation],
    getHitTestResults: XRHitTestSource => js.Array[XRHitTestResult],
    getHitTestResultsForTransientInput: XRTransientInputHitTestSource => js.Array[XRTransientInputHitTestResult],
    getLightEstimate: XRLightProbe => XRLightEstimate,
    getPose: (EventTarget, EventTarget) => js.UndefOr[XRPose],
    getPoseData: (EventTarget, XRReferenceSpace, js.typedarray.ArrayBuffer, js.typedarray.ArrayBuffer) => XRPose,
    getViewerPose: XRReferenceSpace => js.UndefOr[XRViewerPose],
    session: XRSession
  ): INativeXRFrame = {
    val __obj = js.Dynamic.literal(getDepthInformation = js.Any.fromFunction1(getDepthInformation), getHitTestResults = js.Any.fromFunction1(getHitTestResults), getHitTestResultsForTransientInput = js.Any.fromFunction1(getHitTestResultsForTransientInput), getLightEstimate = js.Any.fromFunction1(getLightEstimate), getPose = js.Any.fromFunction2(getPose), getPoseData = js.Any.fromFunction4(getPoseData), getViewerPose = js.Any.fromFunction1(getViewerPose), session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[INativeXRFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INativeXRFrame] (val x: Self) extends AnyVal {
    
    inline def setGetPoseData(
      value: (EventTarget, XRReferenceSpace, js.typedarray.ArrayBuffer, js.typedarray.ArrayBuffer) => XRPose
    ): Self = StObject.set(x, "getPoseData", js.Any.fromFunction4(value))
    
    inline def set_imageTrackingResults(value: js.Array[XRImageTrackingResult]): Self = StObject.set(x, "_imageTrackingResults", value.asInstanceOf[js.Any])
    
    inline def set_imageTrackingResultsUndefined: Self = StObject.set(x, "_imageTrackingResults", js.undefined)
    
    inline def set_imageTrackingResultsVarargs(value: XRImageTrackingResult*): Self = StObject.set(x, "_imageTrackingResults", js.Array(value*))
  }
}
