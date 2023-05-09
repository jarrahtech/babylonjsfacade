package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMultiRenderTargetOptions extends StObject {
  
  /**
    * Define the default type of the buffers we are creating
    */
  var defaultType: js.UndefOr[Double] = js.undefined
  
  /**
    * Define depth texture format to use
    */
  var depthTextureFormat: js.UndefOr[Double] = js.undefined
  
  /**
    * Define if aspect ratio should be adapted to the texture or stay the scene one
    */
  var doNotChangeAspectRatio: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Define the default type of the buffers we are creating
    */
  var drawOnlyOnFirstAttachmentByDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Define the face index of each texture in the textures array (if applicable, given the corresponding targetType) at creation time (for Constants.TEXTURE_CUBE_MAP and .TEXTURE_CUBE_MAP_ARRAY).
    * Can be changed at any time by calling setLayerAndFaceIndices or setLayerAndFaceIndex
    */
  var faceIndex: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Define the internal format of the buffer in the RTT (RED, RG, RGB, RGBA (default), ALPHA...) of all the draw buffers we want to create
    */
  var formats: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Define if a depth buffer is required
    */
  var generateDepthBuffer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Define if a depth texture is required instead of a depth buffer
    */
  var generateDepthTexture: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Define if the texture needs to create mip maps after render.
    */
  var generateMipMaps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Define if a stencil buffer is required
    */
  var generateStencilBuffer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Define the number of layer of each texture in the textures array (if applicable, given the corresponding targetType) (for Constants.TEXTURE_3D, .TEXTURE_2D_ARRAY, and .TEXTURE_CUBE_MAP_ARRAY)
    */
  var layerCounts: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Define the layer index of each texture in the textures array (if applicable, given the corresponding targetType) at creation time (for Constants.TEXTURE_3D, .TEXTURE_2D_ARRAY, and .TEXTURE_CUBE_MAP_ARRAY).
    * Can be changed at any time by calling setLayerAndFaceIndices or setLayerAndFaceIndex
    */
  var layerIndex: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Define the sampling modes of all the draw buffers we want to create
    */
  var samplingModes: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Define the type of texture at each attahment index (of Constants.TEXTURE_2D, .TEXTURE_2D_ARRAY, .TEXTURE_CUBE_MAP, .TEXTURE_CUBE_MAP_ARRAY, .TEXTURE_3D).
    * You can also use the -1 value to indicate that no texture should be created but that you will assign a texture to that attachment index later.
    * Can be useful when you want to attach several layers of the same 2DArrayTexture / 3DTexture or several faces of the same CubeMapTexture: Use the setInternalTexture
    * method for that purpose, after the MultiRenderTarget has been created.
    */
  var targetTypes: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Define the number of desired draw buffers
    */
  var textureCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Define the types of all the draw buffers we want to create
    */
  var types: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Define if sRGB format should be used for each of the draw buffers we want to create
    */
  var useSRGBBuffers: js.UndefOr[js.Array[Boolean]] = js.undefined
}
object IMultiRenderTargetOptions {
  
  inline def apply(): IMultiRenderTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMultiRenderTargetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMultiRenderTargetOptions] (val x: Self) extends AnyVal {
    
    inline def setDefaultType(value: Double): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
    
    inline def setDefaultTypeUndefined: Self = StObject.set(x, "defaultType", js.undefined)
    
    inline def setDepthTextureFormat(value: Double): Self = StObject.set(x, "depthTextureFormat", value.asInstanceOf[js.Any])
    
    inline def setDepthTextureFormatUndefined: Self = StObject.set(x, "depthTextureFormat", js.undefined)
    
    inline def setDoNotChangeAspectRatio(value: Boolean): Self = StObject.set(x, "doNotChangeAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setDoNotChangeAspectRatioUndefined: Self = StObject.set(x, "doNotChangeAspectRatio", js.undefined)
    
    inline def setDrawOnlyOnFirstAttachmentByDefault(value: Boolean): Self = StObject.set(x, "drawOnlyOnFirstAttachmentByDefault", value.asInstanceOf[js.Any])
    
    inline def setDrawOnlyOnFirstAttachmentByDefaultUndefined: Self = StObject.set(x, "drawOnlyOnFirstAttachmentByDefault", js.undefined)
    
    inline def setFaceIndex(value: js.Array[Double]): Self = StObject.set(x, "faceIndex", value.asInstanceOf[js.Any])
    
    inline def setFaceIndexUndefined: Self = StObject.set(x, "faceIndex", js.undefined)
    
    inline def setFaceIndexVarargs(value: Double*): Self = StObject.set(x, "faceIndex", js.Array(value*))
    
    inline def setFormats(value: js.Array[Double]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    inline def setFormatsVarargs(value: Double*): Self = StObject.set(x, "formats", js.Array(value*))
    
    inline def setGenerateDepthBuffer(value: Boolean): Self = StObject.set(x, "generateDepthBuffer", value.asInstanceOf[js.Any])
    
    inline def setGenerateDepthBufferUndefined: Self = StObject.set(x, "generateDepthBuffer", js.undefined)
    
    inline def setGenerateDepthTexture(value: Boolean): Self = StObject.set(x, "generateDepthTexture", value.asInstanceOf[js.Any])
    
    inline def setGenerateDepthTextureUndefined: Self = StObject.set(x, "generateDepthTexture", js.undefined)
    
    inline def setGenerateMipMaps(value: Boolean): Self = StObject.set(x, "generateMipMaps", value.asInstanceOf[js.Any])
    
    inline def setGenerateMipMapsUndefined: Self = StObject.set(x, "generateMipMaps", js.undefined)
    
    inline def setGenerateStencilBuffer(value: Boolean): Self = StObject.set(x, "generateStencilBuffer", value.asInstanceOf[js.Any])
    
    inline def setGenerateStencilBufferUndefined: Self = StObject.set(x, "generateStencilBuffer", js.undefined)
    
    inline def setLayerCounts(value: js.Array[Double]): Self = StObject.set(x, "layerCounts", value.asInstanceOf[js.Any])
    
    inline def setLayerCountsUndefined: Self = StObject.set(x, "layerCounts", js.undefined)
    
    inline def setLayerCountsVarargs(value: Double*): Self = StObject.set(x, "layerCounts", js.Array(value*))
    
    inline def setLayerIndex(value: js.Array[Double]): Self = StObject.set(x, "layerIndex", value.asInstanceOf[js.Any])
    
    inline def setLayerIndexUndefined: Self = StObject.set(x, "layerIndex", js.undefined)
    
    inline def setLayerIndexVarargs(value: Double*): Self = StObject.set(x, "layerIndex", js.Array(value*))
    
    inline def setSamplingModes(value: js.Array[Double]): Self = StObject.set(x, "samplingModes", value.asInstanceOf[js.Any])
    
    inline def setSamplingModesUndefined: Self = StObject.set(x, "samplingModes", js.undefined)
    
    inline def setSamplingModesVarargs(value: Double*): Self = StObject.set(x, "samplingModes", js.Array(value*))
    
    inline def setTargetTypes(value: js.Array[Double]): Self = StObject.set(x, "targetTypes", value.asInstanceOf[js.Any])
    
    inline def setTargetTypesUndefined: Self = StObject.set(x, "targetTypes", js.undefined)
    
    inline def setTargetTypesVarargs(value: Double*): Self = StObject.set(x, "targetTypes", js.Array(value*))
    
    inline def setTextureCount(value: Double): Self = StObject.set(x, "textureCount", value.asInstanceOf[js.Any])
    
    inline def setTextureCountUndefined: Self = StObject.set(x, "textureCount", js.undefined)
    
    inline def setTypes(value: js.Array[Double]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: Double*): Self = StObject.set(x, "types", js.Array(value*))
    
    inline def setUseSRGBBuffers(value: js.Array[Boolean]): Self = StObject.set(x, "useSRGBBuffers", value.asInstanceOf[js.Any])
    
    inline def setUseSRGBBuffersUndefined: Self = StObject.set(x, "useSRGBBuffers", js.undefined)
    
    inline def setUseSRGBBuffersVarargs(value: Boolean*): Self = StObject.set(x, "useSRGBBuffers", js.Array(value*))
  }
}
