package typings.babylonjs.global.BABYLON

import org.scalajs.dom.AudioContext
import org.scalajs.dom.AudioDestinationNode
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MediaStreamAudioDestinationNode
import org.scalajs.dom.WebGLRenderingContext
import typings.babylonjs.BABYLON.EngineOptions
import typings.babylonjs.BABYLON.IAudioEngine
import typings.babylonjs.BABYLON.ILoadingScreen
import typings.babylonjs.BABYLON.IOfflineProvider
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.OffscreenCanvas
import typings.babylonjs.WebGL2RenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Engine")
@js.native
open class Engine protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Engine {
  /**
    * Creates a new engine
    * @param canvasOrContext defines the canvas or WebGL context to use for rendering. If you provide a WebGL context, Babylon.js will not hook events on the canvas (like pointers, keyboards, etc...) so no event observables will be available. This is mostly used when Babylon.js is used as a plugin on a system which already used the WebGL context
    * @param antialias defines enable antialiasing (default: false)
    * @param options defines further options to be sent to the getContext() function
    * @param adaptToDeviceRatio defines whether to adapt to the device's viewport characteristics (default: false)
    */
  def this(canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ]) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Boolean
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Boolean,
    options: EngineOptions
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Unit,
    options: EngineOptions
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Boolean,
    options: Unit,
    adaptToDeviceRatio: Boolean
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Boolean,
    options: EngineOptions,
    adaptToDeviceRatio: Boolean
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Unit,
    options: Unit,
    adaptToDeviceRatio: Boolean
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Unit,
    options: EngineOptions,
    adaptToDeviceRatio: Boolean
  ) = this()
}
/* static members */
object Engine {
  
  @JSGlobal("BABYLON.Engine")
  @js.native
  val ^ : js.Any = js.native
  
  /** Defines that alpha blending to SRC ALPHA * SRC + DEST */
  @JSGlobal("BABYLON.Engine.ALPHA_ADD")
  @js.native
  val ALPHA_ADD: /* 1 */ Double = js.native
  
  /** Defines that alpha blending to SRC ALPHA * SRC + (1 - SRC ALPHA) * DEST */
  @JSGlobal("BABYLON.Engine.ALPHA_COMBINE")
  @js.native
  val ALPHA_COMBINE: /* 2 */ Double = js.native
  
  /** Defines that alpha blending is disabled */
  @JSGlobal("BABYLON.Engine.ALPHA_DISABLE")
  @js.native
  val ALPHA_DISABLE: /* 0 */ Double = js.native
  
  /** Defines that alpha blending to CST * SRC + (1 - CST) * DEST */
  @JSGlobal("BABYLON.Engine.ALPHA_INTERPOLATE")
  @js.native
  val ALPHA_INTERPOLATE: /* 9 */ Double = js.native
  
  /** Defines that alpha blending to SRC ALPHA * SRC + (1 - SRC) * DEST */
  @JSGlobal("BABYLON.Engine.ALPHA_MAXIMIZED")
  @js.native
  val ALPHA_MAXIMIZED: /* 5 */ Double = js.native
  
  /** Defines that alpha blending to SRC * DEST */
  @JSGlobal("BABYLON.Engine.ALPHA_MULTIPLY")
  @js.native
  val ALPHA_MULTIPLY: /* 4 */ Double = js.native
  
  /** Defines that alpha blending to SRC + DEST */
  @JSGlobal("BABYLON.Engine.ALPHA_ONEONE")
  @js.native
  val ALPHA_ONEONE: /* 6 */ Double = js.native
  
  /** Defines that alpha blending to SRC + (1 - SRC ALPHA) * DEST */
  @JSGlobal("BABYLON.Engine.ALPHA_PREMULTIPLIED")
  @js.native
  val ALPHA_PREMULTIPLIED: /* 7 */ Double = js.native
  
  /**
    * Defines that alpha blending to SRC + (1 - SRC ALPHA) * DEST
    * Alpha will be set to (1 - SRC ALPHA) * DEST ALPHA
    */
  @JSGlobal("BABYLON.Engine.ALPHA_PREMULTIPLIED_PORTERDUFF")
  @js.native
  val ALPHA_PREMULTIPLIED_PORTERDUFF: /* 8 */ Double = js.native
  
  /**
    * Defines that alpha blending to SRC + (1 - SRC) * DEST
    * Alpha will be set to SRC ALPHA + (1 - SRC ALPHA) * DEST ALPHA
    */
  @JSGlobal("BABYLON.Engine.ALPHA_SCREENMODE")
  @js.native
  val ALPHA_SCREENMODE: /* 10 */ Double = js.native
  
  /** Defines that alpha blending to DEST - SRC * DEST */
  @JSGlobal("BABYLON.Engine.ALPHA_SUBTRACT")
  @js.native
  val ALPHA_SUBTRACT: /* 3 */ Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
  @JSGlobal("BABYLON.Engine.ALWAYS")
  @js.native
  val ALWAYS: /* 519 */ Double = js.native
  
  /**
    * Default AudioEngine factory responsible of creating the Audio Engine.
    * By default, this will create a BabylonJS Audio Engine if the workload has been embedded.
    */
  inline def AudioEngineFactory(
    hostElement: Nullable[HTMLElement],
    audioContext: Nullable[AudioContext],
    audioDestination: Nullable[AudioDestinationNode | MediaStreamAudioDestinationNode]
  ): IAudioEngine = (^.asInstanceOf[js.Dynamic].applyDynamic("AudioEngineFactory")(hostElement.asInstanceOf[js.Any], audioContext.asInstanceOf[js.Any], audioDestination.asInstanceOf[js.Any])).asInstanceOf[IAudioEngine]
  
  /** Passed to stencilOperation to specify that stencil value must be decremented */
  @JSGlobal("BABYLON.Engine.DECR")
  @js.native
  val DECR: /* 7683 */ Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be decremented with wrapping */
  @JSGlobal("BABYLON.Engine.DECR_WRAP")
  @js.native
  val DECR_WRAP: /* 34056 */ Double = js.native
  
  /** Defines that the resource was successfully delay loaded */
  @JSGlobal("BABYLON.Engine.DELAYLOADSTATE_LOADED")
  @js.native
  val DELAYLOADSTATE_LOADED: /* 1 */ Double = js.native
  
  /** Defines that the resource is currently delay loading */
  @JSGlobal("BABYLON.Engine.DELAYLOADSTATE_LOADING")
  @js.native
  val DELAYLOADSTATE_LOADING: /* 2 */ Double = js.native
  
  /** Defines that the resource is not delayed*/
  @JSGlobal("BABYLON.Engine.DELAYLOADSTATE_NONE")
  @js.native
  val DELAYLOADSTATE_NONE: /* 0 */ Double = js.native
  
  /** Defines that the resource is delayed and has not started loading */
  @JSGlobal("BABYLON.Engine.DELAYLOADSTATE_NOTLOADED")
  @js.native
  val DELAYLOADSTATE_NOTLOADED: /* 4 */ Double = js.native
  
  /**
    * Method called to create the default loading screen.
    * This can be overridden in your own app.
    * @param canvas The rendering canvas element
    * @returns The loading screen
    */
  inline def DefaultLoadingScreenFactory(canvas: HTMLCanvasElement): ILoadingScreen = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultLoadingScreenFactory")(canvas.asInstanceOf[js.Any]).asInstanceOf[ILoadingScreen]
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is equals to the stored value */
  @JSGlobal("BABYLON.Engine.EQUAL")
  @js.native
  val EQUAL: /* 514 */ Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than or equal to the stored value */
  @JSGlobal("BABYLON.Engine.GEQUAL")
  @js.native
  val GEQUAL: /* 518 */ Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than the stored value */
  @JSGlobal("BABYLON.Engine.GREATER")
  @js.native
  val GREATER: /* 516 */ Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be incremented */
  @JSGlobal("BABYLON.Engine.INCR")
  @js.native
  val INCR: /* 7682 */ Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be incremented with wrapping */
  @JSGlobal("BABYLON.Engine.INCR_WRAP")
  @js.native
  val INCR_WRAP: /* 34055 */ Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be inverted */
  @JSGlobal("BABYLON.Engine.INVERT")
  @js.native
  val INVERT: /* 5386 */ Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be kept */
  @JSGlobal("BABYLON.Engine.KEEP")
  @js.native
  val KEEP: /* 7680 */ Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than or equal to the stored value */
  @JSGlobal("BABYLON.Engine.LEQUAL")
  @js.native
  val LEQUAL: /* 515 */ Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than the stored value */
  @JSGlobal("BABYLON.Engine.LESS")
  @js.native
  val LESS: /* 513 */ Double = js.native
  
  /**
    * Will flag all materials in all scenes in all engines as dirty to trigger new shader compilation
    * @param flag defines which part of the materials must be marked as dirty
    * @param predicate defines a predicate used to filter which materials should be affected
    */
  inline def MarkAllMaterialsAsDirty(flag: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("MarkAllMaterialsAsDirty")(flag.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def MarkAllMaterialsAsDirty(flag: Double, predicate: js.Function1[/* mat */ typings.babylonjs.BABYLON.Material, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("MarkAllMaterialsAsDirty")(flag.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will never pass. i.e. Nothing will be drawn */
  @JSGlobal("BABYLON.Engine.NEVER")
  @js.native
  val NEVER: /* 512 */ Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is not equal to the stored value */
  @JSGlobal("BABYLON.Engine.NOTEQUAL")
  @js.native
  val NOTEQUAL: /* 517 */ Double = js.native
  
  /**
    * Default offline support factory responsible of creating a tool used to store data locally.
    * By default, this will create a Database object if the workload has been embedded.
    */
  inline def OfflineProviderFactory(
    urlToScene: String,
    callbackManifestChecked: js.Function1[/* checked */ Boolean, Any],
    disableManifestCheck: Boolean
  ): IOfflineProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("OfflineProviderFactory")(urlToScene.asInstanceOf[js.Any], callbackManifestChecked.asInstanceOf[js.Any], disableManifestCheck.asInstanceOf[js.Any])).asInstanceOf[IOfflineProvider]
  
  /** Passed to stencilOperation to specify that stencil value must be replaced */
  @JSGlobal("BABYLON.Engine.REPLACE")
  @js.native
  val REPLACE: /* 7681 */ Double = js.native
  
  /** Defines that texture rescaling will use a ceil to find the closer power of 2 size */
  @JSGlobal("BABYLON.Engine.SCALEMODE_CEILING")
  @js.native
  val SCALEMODE_CEILING: /* 3 */ Double = js.native
  
  /** Defines that texture rescaling will use a floor to find the closer power of 2 size */
  @JSGlobal("BABYLON.Engine.SCALEMODE_FLOOR")
  @js.native
  val SCALEMODE_FLOOR: /* 1 */ Double = js.native
  
  /** Defines that texture rescaling will look for the nearest power of 2 size */
  @JSGlobal("BABYLON.Engine.SCALEMODE_NEAREST")
  @js.native
  val SCALEMODE_NEAREST: /* 2 */ Double = js.native
  
  /** ALPHA */
  @JSGlobal("BABYLON.Engine.TEXTUREFORMAT_ALPHA")
  @js.native
  val TEXTUREFORMAT_ALPHA: /* 0 */ Double = js.native
  
  /** LUMINANCE */
  @JSGlobal("BABYLON.Engine.TEXTUREFORMAT_LUMINANCE")
  @js.native
  val TEXTUREFORMAT_LUMINANCE: /* 1 */ Double = js.native
  
  /** LUMINANCE_ALPHA */
  @JSGlobal("BABYLON.Engine.TEXTUREFORMAT_LUMINANCE_ALPHA")
  @js.native
  val TEXTUREFORMAT_LUMINANCE_ALPHA: /* 2 */ Double = js.native
  
  /** RED (2nd reference) */
  @JSGlobal("BABYLON.Engine.TEXTUREFORMAT_R")
  @js.native
  val TEXTUREFORMAT_R: /* 6 */ Double = js.native
  
  /** RED */
  @JSGlobal("BABYLON.Engine.TEXTUREFORMAT_RED")
  @js.native
  val TEXTUREFORMAT_RED: /* 6 */ Double = js.native
  
  /** RED_INTEGER */
  @JSGlobal("BABYLON.Engine.TEXTUREFORMAT_RED_INTEGER")
  @js.native
  val TEXTUREFORMAT_RED_INTEGER: /* 8 */ Double = js.native
  
  /** RG */
  @JSGlobal("BABYLON.Engine.TEXTUREFORMAT_RG")
  @js.native
  val TEXTUREFORMAT_RG: /* 7 */ Double = js.native
  
  /** RGB */
  @JSGlobal("BABYLON.Engine.TEXTUREFORMAT_RGB")
  @js.native
  val TEXTUREFORMAT_RGB: /* 4 */ Double = js.native
  
  /** RGBA */
  @JSGlobal("BABYLON.Engine.TEXTUREFORMAT_RGBA")
  @js.native
  val TEXTUREFORMAT_RGBA: /* 5 */ Double = js.native
  
  /** RGBA_INTEGER */
  @JSGlobal("BABYLON.Engine.TEXTUREFORMAT_RGBA_INTEGER")
  @js.native
  val TEXTUREFORMAT_RGBA_INTEGER: /* 11 */ Double = js.native
  
  /** RGB_INTEGER */
  @JSGlobal("BABYLON.Engine.TEXTUREFORMAT_RGB_INTEGER")
  @js.native
  val TEXTUREFORMAT_RGB_INTEGER: /* 10 */ Double = js.native
  
  /** RG_INTEGER */
  @JSGlobal("BABYLON.Engine.TEXTUREFORMAT_RG_INTEGER")
  @js.native
  val TEXTUREFORMAT_RG_INTEGER: /* 9 */ Double = js.native
  
  /** RED_INTEGER (2nd reference) */
  @JSGlobal("BABYLON.Engine.TEXTUREFORMAT_R_INTEGER")
  @js.native
  val TEXTUREFORMAT_R_INTEGER: /* 8 */ Double = js.native
  
  /** BYTE */
  @JSGlobal("BABYLON.Engine.TEXTURETYPE_BYTE")
  @js.native
  val TEXTURETYPE_BYTE: /* 3 */ Double = js.native
  
  /** FLOAT */
  @JSGlobal("BABYLON.Engine.TEXTURETYPE_FLOAT")
  @js.native
  val TEXTURETYPE_FLOAT: /* 1 */ Double = js.native
  
  /** FLOAT_32_UNSIGNED_INT_24_8_REV */
  @JSGlobal("BABYLON.Engine.TEXTURETYPE_FLOAT_32_UNSIGNED_INT_24_8_REV")
  @js.native
  val TEXTURETYPE_FLOAT_32_UNSIGNED_INT_24_8_REV: /* 15 */ Double = js.native
  
  /** HALF_FLOAT */
  @JSGlobal("BABYLON.Engine.TEXTURETYPE_HALF_FLOAT")
  @js.native
  val TEXTURETYPE_HALF_FLOAT: /* 2 */ Double = js.native
  
  /** INT */
  @JSGlobal("BABYLON.Engine.TEXTURETYPE_INT")
  @js.native
  val TEXTURETYPE_INT: /* 6 */ Double = js.native
  
  /** SHORT */
  @JSGlobal("BABYLON.Engine.TEXTURETYPE_SHORT")
  @js.native
  val TEXTURETYPE_SHORT: /* 4 */ Double = js.native
  
  /** UNSIGNED_BYTE */
  @JSGlobal("BABYLON.Engine.TEXTURETYPE_UNSIGNED_BYTE")
  @js.native
  val TEXTURETYPE_UNSIGNED_BYTE: /* 0 */ Double = js.native
  
  /** UNSIGNED_BYTE (2nd reference) */
  @JSGlobal("BABYLON.Engine.TEXTURETYPE_UNSIGNED_INT")
  @js.native
  val TEXTURETYPE_UNSIGNED_INT: /* 0 */ Double = js.native
  
  /** UNSIGNED_INT */
  @JSGlobal("BABYLON.Engine.TEXTURETYPE_UNSIGNED_INTEGER")
  @js.native
  val TEXTURETYPE_UNSIGNED_INTEGER: /* 7 */ Double = js.native
  
  /** UNSIGNED_INT_10F_11F_11F_REV */
  @JSGlobal("BABYLON.Engine.TEXTURETYPE_UNSIGNED_INT_10F_11F_11F_REV")
  @js.native
  val TEXTURETYPE_UNSIGNED_INT_10F_11F_11F_REV: /* 13 */ Double = js.native
  
  /** UNSIGNED_INT_24_8 */
  @JSGlobal("BABYLON.Engine.TEXTURETYPE_UNSIGNED_INT_24_8")
  @js.native
  val TEXTURETYPE_UNSIGNED_INT_24_8: /* 12 */ Double = js.native
  
  /** UNSIGNED_INT_2_10_10_10_REV */
  @JSGlobal("BABYLON.Engine.TEXTURETYPE_UNSIGNED_INT_2_10_10_10_REV")
  @js.native
  val TEXTURETYPE_UNSIGNED_INT_2_10_10_10_REV: /* 11 */ Double = js.native
  
  /** UNSIGNED_INT_5_9_9_9_REV */
  @JSGlobal("BABYLON.Engine.TEXTURETYPE_UNSIGNED_INT_5_9_9_9_REV")
  @js.native
  val TEXTURETYPE_UNSIGNED_INT_5_9_9_9_REV: /* 14 */ Double = js.native
  
  /** UNSIGNED_SHORT */
  @JSGlobal("BABYLON.Engine.TEXTURETYPE_UNSIGNED_SHORT")
  @js.native
  val TEXTURETYPE_UNSIGNED_SHORT: /* 5 */ Double = js.native
  
  /** UNSIGNED_SHORT_4_4_4_4 */
  @JSGlobal("BABYLON.Engine.TEXTURETYPE_UNSIGNED_SHORT_4_4_4_4")
  @js.native
  val TEXTURETYPE_UNSIGNED_SHORT_4_4_4_4: /* 8 */ Double = js.native
  
  /** UNSIGNED_SHORT_5_5_5_1 */
  @JSGlobal("BABYLON.Engine.TEXTURETYPE_UNSIGNED_SHORT_5_5_5_1")
  @js.native
  val TEXTURETYPE_UNSIGNED_SHORT_5_5_5_1: /* 9 */ Double = js.native
  
  /** UNSIGNED_SHORT_5_6_5 */
  @JSGlobal("BABYLON.Engine.TEXTURETYPE_UNSIGNED_SHORT_5_6_5")
  @js.native
  val TEXTURETYPE_UNSIGNED_SHORT_5_6_5: /* 10 */ Double = js.native
  
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  @JSGlobal("BABYLON.Engine.TEXTURE_BILINEAR_SAMPLINGMODE")
  @js.native
  val TEXTURE_BILINEAR_SAMPLINGMODE: /* 2 */ Double = js.native
  
  /** Texture is not repeating outside of 0..1 UVs */
  @JSGlobal("BABYLON.Engine.TEXTURE_CLAMP_ADDRESSMODE")
  @js.native
  val TEXTURE_CLAMP_ADDRESSMODE: /* 0 */ Double = js.native
  
  /** Cubic coordinates mode */
  @JSGlobal("BABYLON.Engine.TEXTURE_CUBIC_MODE")
  @js.native
  val TEXTURE_CUBIC_MODE: /* 3 */ Double = js.native
  
  /** Equirectangular coordinates mode */
  @JSGlobal("BABYLON.Engine.TEXTURE_EQUIRECTANGULAR_MODE")
  @js.native
  val TEXTURE_EQUIRECTANGULAR_MODE: /* 7 */ Double = js.native
  
  /** Explicit coordinates mode */
  @JSGlobal("BABYLON.Engine.TEXTURE_EXPLICIT_MODE")
  @js.native
  val TEXTURE_EXPLICIT_MODE: /* 0 */ Double = js.native
  
  /** Equirectangular Fixed Mirrored coordinates mode */
  @JSGlobal("BABYLON.Engine.TEXTURE_FIXED_EQUIRECTANGULAR_MIRRORED_MODE")
  @js.native
  val TEXTURE_FIXED_EQUIRECTANGULAR_MIRRORED_MODE: /* 9 */ Double = js.native
  
  /** Equirectangular Fixed coordinates mode */
  @JSGlobal("BABYLON.Engine.TEXTURE_FIXED_EQUIRECTANGULAR_MODE")
  @js.native
  val TEXTURE_FIXED_EQUIRECTANGULAR_MODE: /* 8 */ Double = js.native
  
  /** Inverse Cubic coordinates mode */
  @JSGlobal("BABYLON.Engine.TEXTURE_INVCUBIC_MODE")
  @js.native
  val TEXTURE_INVCUBIC_MODE: /* 6 */ Double = js.native
  
  /** mag = linear and min = linear and mip = none */
  @JSGlobal("BABYLON.Engine.TEXTURE_LINEAR_LINEAR")
  @js.native
  val TEXTURE_LINEAR_LINEAR: /* 2 */ Double = js.native
  
  /** Trilinear is mag = linear and min = linear and mip = linear */
  @JSGlobal("BABYLON.Engine.TEXTURE_LINEAR_LINEAR_MIPLINEAR")
  @js.native
  val TEXTURE_LINEAR_LINEAR_MIPLINEAR: /* 3 */ Double = js.native
  
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  @JSGlobal("BABYLON.Engine.TEXTURE_LINEAR_LINEAR_MIPNEAREST")
  @js.native
  val TEXTURE_LINEAR_LINEAR_MIPNEAREST: /* 11 */ Double = js.native
  
  /** mag = linear and min = nearest and mip = none */
  @JSGlobal("BABYLON.Engine.TEXTURE_LINEAR_NEAREST")
  @js.native
  val TEXTURE_LINEAR_NEAREST: /* 12 */ Double = js.native
  
  /** mag = linear and min = nearest and mip = linear */
  @JSGlobal("BABYLON.Engine.TEXTURE_LINEAR_NEAREST_MIPLINEAR")
  @js.native
  val TEXTURE_LINEAR_NEAREST_MIPLINEAR: /* 10 */ Double = js.native
  
  /** mag = linear and min = nearest and mip = nearest */
  @JSGlobal("BABYLON.Engine.TEXTURE_LINEAR_NEAREST_MIPNEAREST")
  @js.native
  val TEXTURE_LINEAR_NEAREST_MIPNEAREST: /* 9 */ Double = js.native
  
  /** Texture is repeating and mirrored */
  @JSGlobal("BABYLON.Engine.TEXTURE_MIRROR_ADDRESSMODE")
  @js.native
  val TEXTURE_MIRROR_ADDRESSMODE: /* 2 */ Double = js.native
  
  /** mag = nearest and min = linear and mip = none */
  @JSGlobal("BABYLON.Engine.TEXTURE_NEAREST_LINEAR")
  @js.native
  val TEXTURE_NEAREST_LINEAR: /* 7 */ Double = js.native
  
  /** mag = nearest and min = linear and mip = linear */
  @JSGlobal("BABYLON.Engine.TEXTURE_NEAREST_LINEAR_MIPLINEAR")
  @js.native
  val TEXTURE_NEAREST_LINEAR_MIPLINEAR: /* 6 */ Double = js.native
  
  /** mag = nearest and min = linear and mip = nearest */
  @JSGlobal("BABYLON.Engine.TEXTURE_NEAREST_LINEAR_MIPNEAREST")
  @js.native
  val TEXTURE_NEAREST_LINEAR_MIPNEAREST: /* 5 */ Double = js.native
  
  /** mag = nearest and min = nearest and mip = none */
  @JSGlobal("BABYLON.Engine.TEXTURE_NEAREST_NEAREST")
  @js.native
  val TEXTURE_NEAREST_NEAREST: /* 1 */ Double = js.native
  
  /** nearest is mag = nearest and min = nearest and mip = linear */
  @JSGlobal("BABYLON.Engine.TEXTURE_NEAREST_NEAREST_MIPLINEAR")
  @js.native
  val TEXTURE_NEAREST_NEAREST_MIPLINEAR: /* 8 */ Double = js.native
  
  /** mag = nearest and min = nearest and mip = nearest */
  @JSGlobal("BABYLON.Engine.TEXTURE_NEAREST_NEAREST_MIPNEAREST")
  @js.native
  val TEXTURE_NEAREST_NEAREST_MIPNEAREST: /* 4 */ Double = js.native
  
  /** nearest is mag = nearest and min = nearest and mip = none */
  @JSGlobal("BABYLON.Engine.TEXTURE_NEAREST_SAMPLINGMODE")
  @js.native
  val TEXTURE_NEAREST_SAMPLINGMODE: /* 1 */ Double = js.native
  
  /** Planar coordinates mode */
  @JSGlobal("BABYLON.Engine.TEXTURE_PLANAR_MODE")
  @js.native
  val TEXTURE_PLANAR_MODE: /* 2 */ Double = js.native
  
  /** Projection coordinates mode */
  @JSGlobal("BABYLON.Engine.TEXTURE_PROJECTION_MODE")
  @js.native
  val TEXTURE_PROJECTION_MODE: /* 4 */ Double = js.native
  
  /** Skybox coordinates mode */
  @JSGlobal("BABYLON.Engine.TEXTURE_SKYBOX_MODE")
  @js.native
  val TEXTURE_SKYBOX_MODE: /* 5 */ Double = js.native
  
  /** Spherical coordinates mode */
  @JSGlobal("BABYLON.Engine.TEXTURE_SPHERICAL_MODE")
  @js.native
  val TEXTURE_SPHERICAL_MODE: /* 1 */ Double = js.native
  
  /** Trilinear is mag = linear and min = linear and mip = linear */
  @JSGlobal("BABYLON.Engine.TEXTURE_TRILINEAR_SAMPLINGMODE")
  @js.native
  val TEXTURE_TRILINEAR_SAMPLINGMODE: /* 3 */ Double = js.native
  
  /** Texture is repeating outside of 0..1 UVs */
  @JSGlobal("BABYLON.Engine.TEXTURE_WRAP_ADDRESSMODE")
  @js.native
  val TEXTURE_WRAP_ADDRESSMODE: /* 1 */ Double = js.native
  
  /**
    * Asks the browser to exit fullscreen mode
    */
  inline def _ExitFullscreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_ExitFullscreen")().asInstanceOf[Unit]
  
  /**
    * Asks the browser to exit pointerlock mode
    */
  inline def _ExitPointerlock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_ExitPointerlock")().asInstanceOf[Unit]
  
  @JSGlobal("BABYLON.Engine._RenderPassIdCounter")
  @js.native
  def _RenderPassIdCounter: Double = js.native
  inline def _RenderPassIdCounter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RenderPassIdCounter")(x.asInstanceOf[js.Any])
  
  /**
    * Ask the browser to promote the current element to fullscreen rendering mode
    * @param element defines the DOM element to promote
    */
  inline def _RequestFullscreen(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_RequestFullscreen")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Pointerlock and fullscreen */
  /**
    * Ask the browser to promote the current element to pointerlock mode
    * @param element defines the DOM element to promote
    */
  inline def _RequestPointerlock(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_RequestPointerlock")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Method called to create the default rescale post process on each engine.
    */
  @JSGlobal("BABYLON.Engine._RescalePostProcessFactory")
  @js.native
  def _RescalePostProcessFactory: Nullable[js.Function1[/* engine */ this.type, typings.babylonjs.BABYLON.PostProcess]] = js.native
  inline def _RescalePostProcessFactory_=(x: Nullable[js.Function1[/* engine */ this.type, typings.babylonjs.BABYLON.PostProcess]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RescalePostProcessFactory")(x.asInstanceOf[js.Any])
  
  /**
    * Gets the audio engine
    * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic
    * @ignorenaming
    */
  @JSGlobal("BABYLON.Engine.audioEngine")
  @js.native
  def audioEngine: Nullable[IAudioEngine] = js.native
  inline def audioEngine_=(x: Nullable[IAudioEngine]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("audioEngine")(x.asInstanceOf[js.Any])
}
