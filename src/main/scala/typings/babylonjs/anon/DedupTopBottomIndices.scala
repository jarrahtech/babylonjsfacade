package typings.babylonjs.anon

import typings.babylonjs.mathsMathDotvectorMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DedupTopBottomIndices extends StObject {
  
  var arc: js.UndefOr[Double] = js.undefined
  
  var backUVs: js.UndefOr[Vector4] = js.undefined
  
  var dedupTopBottomIndices: js.UndefOr[Boolean] = js.undefined
  
  var diameter: js.UndefOr[Double] = js.undefined
  
  var diameterX: js.UndefOr[Double] = js.undefined
  
  var diameterY: js.UndefOr[Double] = js.undefined
  
  var diameterZ: js.UndefOr[Double] = js.undefined
  
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  
  var segments: js.UndefOr[Double] = js.undefined
  
  var sideOrientation: js.UndefOr[Double] = js.undefined
  
  var slice: js.UndefOr[Double] = js.undefined
}
object DedupTopBottomIndices {
  
  inline def apply(): DedupTopBottomIndices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DedupTopBottomIndices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DedupTopBottomIndices] (val x: Self) extends AnyVal {
    
    inline def setArc(value: Double): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    inline def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
    
    inline def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    inline def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    inline def setDedupTopBottomIndices(value: Boolean): Self = StObject.set(x, "dedupTopBottomIndices", value.asInstanceOf[js.Any])
    
    inline def setDedupTopBottomIndicesUndefined: Self = StObject.set(x, "dedupTopBottomIndices", js.undefined)
    
    inline def setDiameter(value: Double): Self = StObject.set(x, "diameter", value.asInstanceOf[js.Any])
    
    inline def setDiameterUndefined: Self = StObject.set(x, "diameter", js.undefined)
    
    inline def setDiameterX(value: Double): Self = StObject.set(x, "diameterX", value.asInstanceOf[js.Any])
    
    inline def setDiameterXUndefined: Self = StObject.set(x, "diameterX", js.undefined)
    
    inline def setDiameterY(value: Double): Self = StObject.set(x, "diameterY", value.asInstanceOf[js.Any])
    
    inline def setDiameterYUndefined: Self = StObject.set(x, "diameterY", js.undefined)
    
    inline def setDiameterZ(value: Double): Self = StObject.set(x, "diameterZ", value.asInstanceOf[js.Any])
    
    inline def setDiameterZUndefined: Self = StObject.set(x, "diameterZ", js.undefined)
    
    inline def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    inline def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    inline def setSegments(value: Double): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    inline def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    inline def setSlice(value: Double): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    
    inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
  }
}
