package typings.babylonjs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.buffersBufferMod.VertexBuffer
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sizes extends StObject {
  
  var data: StringDictionary[js.typedarray.Float32Array]
  
  var sizes: StringDictionary[Double]
  
  var strides: StringDictionary[Double]
  
  var vertexBuffers: StringDictionary[Nullable[VertexBuffer]]
}
object Sizes {
  
  inline def apply(
    data: StringDictionary[js.typedarray.Float32Array],
    sizes: StringDictionary[Double],
    strides: StringDictionary[Double],
    vertexBuffers: StringDictionary[Nullable[VertexBuffer]]
  ): Sizes = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any], vertexBuffers = vertexBuffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sizes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sizes] (val x: Self) extends AnyVal {
    
    inline def setData(value: StringDictionary[js.typedarray.Float32Array]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setSizes(value: StringDictionary[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setStrides(value: StringDictionary[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
    
    inline def setVertexBuffers(value: StringDictionary[Nullable[VertexBuffer]]): Self = StObject.set(x, "vertexBuffers", value.asInstanceOf[js.Any])
  }
}
