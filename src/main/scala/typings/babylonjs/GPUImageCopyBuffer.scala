package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUImageCopyBuffer
  extends StObject
     with GPUImageDataLayout {
  
  var buffer: GPUBuffer
}
object GPUImageCopyBuffer {
  
  inline def apply(buffer: GPUBuffer, bytesPerRow: GPUSize32): GPUImageCopyBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesPerRow = bytesPerRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUImageCopyBuffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUImageCopyBuffer] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: GPUBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
  }
}
