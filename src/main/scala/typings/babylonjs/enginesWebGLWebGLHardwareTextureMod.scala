package typings.babylonjs

import org.scalajs.dom.WebGLRenderbuffer
import org.scalajs.dom.WebGLRenderingContext
import org.scalajs.dom.WebGLTexture
import typings.babylonjs.materialsTexturesHardwareTextureWrapperMod.HardwareTextureWrapper
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGLWebGLHardwareTextureMod {
  
  @JSImport("babylonjs/Engines/WebGL/webGLHardwareTexture", "WebGLHardwareTexture")
  @js.native
  open class WebGLHardwareTexture protected ()
    extends StObject
       with HardwareTextureWrapper {
    def this(existingTexture: Unit, context: WebGLRenderingContext) = this()
    def this(existingTexture: Nullable[WebGLTexture], context: WebGLRenderingContext) = this()
    
    /* private */ var _MSAARenderBuffers: Any = js.native
    
    /* private */ var _context: Any = js.native
    
    /* private */ var _webGLTexture: Any = js.native
    
    def addMSAARenderBuffer(buffer: WebGLRenderbuffer): Unit = js.native
    
    /* CompleteClass */
    override def release(): Unit = js.native
    
    def releaseMSAARenderBuffers(): Unit = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    def set(hardwareTexture: WebGLTexture): Unit = js.native
    /* CompleteClass */
    override def set(hardwareTexture: Any): Unit = js.native
    
    def setUsage(): Unit = js.native
    /* CompleteClass */
    override def setUsage(textureSource: Double, generateMipMaps: Boolean, isCube: Boolean, width: Double, height: Double): Unit = js.native
    
    /* CompleteClass */
    var underlyingResource: Any = js.native
    @JSName("underlyingResource")
    def underlyingResource_MWebGLHardwareTexture: Nullable[WebGLTexture] = js.native
  }
}
