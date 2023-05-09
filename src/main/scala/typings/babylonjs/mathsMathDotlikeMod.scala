package typings.babylonjs

import typings.babylonjs.typesMod.DeepImmutable
import typings.babylonjs.typesMod.float
import typings.babylonjs.typesMod.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathsMathDotlikeMod {
  
  trait IColor3Like extends StObject {
    
    var b: float
    
    var g: float
    
    var r: float
  }
  object IColor3Like {
    
    inline def apply(b: float, g: float, r: float): IColor3Like = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColor3Like]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IColor3Like] (val x: Self) extends AnyVal {
      
      inline def setB(value: float): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: float): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: float): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait IColor4Like extends StObject {
    
    var a: float
    
    var b: float
    
    var g: float
    
    var r: float
  }
  object IColor4Like {
    
    inline def apply(a: float, b: float, g: float, r: float): IColor4Like = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColor4Like]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IColor4Like] (val x: Self) extends AnyVal {
      
      inline def setA(value: float): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: float): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: float): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: float): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMatrixLike extends StObject {
    
    def toArray(): DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]
    
    var updateFlag: int
  }
  object IMatrixLike {
    
    inline def apply(toArray: () => DeepImmutable[js.typedarray.Float32Array | js.Array[Double]], updateFlag: int): IMatrixLike = {
      val __obj = js.Dynamic.literal(toArray = js.Any.fromFunction0(toArray), updateFlag = updateFlag.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMatrixLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMatrixLike] (val x: Self) extends AnyVal {
      
      inline def setToArray(value: () => DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      
      inline def setUpdateFlag(value: int): Self = StObject.set(x, "updateFlag", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPlaneLike extends StObject {
    
    var d: float
    
    var normal: IVector3Like
    
    def normalize(): Unit
  }
  object IPlaneLike {
    
    inline def apply(d: float, normal: IVector3Like, normalize: () => Unit): IPlaneLike = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize))
      __obj.asInstanceOf[IPlaneLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPlaneLike] (val x: Self) extends AnyVal {
      
      inline def setD(value: float): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setNormal(value: IVector3Like): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
      
      inline def setNormalize(value: () => Unit): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
    }
  }
  
  trait IQuaternionLike extends StObject {
    
    var w: float
    
    var x: float
    
    var y: float
    
    var z: float
  }
  object IQuaternionLike {
    
    inline def apply(w: float, x: float, y: float, z: float): IQuaternionLike = {
      val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[IQuaternionLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IQuaternionLike] (val x: Self) extends AnyVal {
      
      inline def setW(value: float): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setX(value: float): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: float): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: float): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  trait IVector2Like extends StObject {
    
    var x: float
    
    var y: float
  }
  object IVector2Like {
    
    inline def apply(x: float, y: float): IVector2Like = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVector2Like]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IVector2Like] (val x: Self) extends AnyVal {
      
      inline def setX(value: float): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: float): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait IVector3Like extends StObject {
    
    var x: float
    
    var y: float
    
    var z: float
  }
  object IVector3Like {
    
    inline def apply(x: float, y: float, z: float): IVector3Like = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVector3Like]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IVector3Like] (val x: Self) extends AnyVal {
      
      inline def setX(value: float): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: float): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: float): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  trait IVector4Like extends StObject {
    
    var w: float
    
    var x: float
    
    var y: float
    
    var z: float
  }
  object IVector4Like {
    
    inline def apply(w: float, x: float, y: float, z: float): IVector4Like = {
      val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVector4Like]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IVector4Like] (val x: Self) extends AnyVal {
      
      inline def setW(value: float): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setX(value: float): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: float): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: float): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  trait IViewportLike extends StObject {
    
    var height: float
    
    var width: float
    
    var x: float
    
    var y: float
  }
  object IViewportLike {
    
    inline def apply(height: float, width: float, x: float, y: float): IViewportLike = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IViewportLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IViewportLike] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: float): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: float): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: float): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: float): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
