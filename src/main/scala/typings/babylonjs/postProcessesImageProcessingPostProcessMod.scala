package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.materialsColorCurvesMod.ColorCurves
import typings.babylonjs.materialsImageProcessingConfigurationMod.ImageProcessingConfiguration
import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.mathsMathDotcolorMod.Color4
import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import typings.babylonjs.postProcessesPostProcessMod.PostProcessOptions
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessesImageProcessingPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/imageProcessingPostProcess", "ImageProcessingPostProcess")
  @js.native
  open class ImageProcessingPostProcess protected () extends PostProcess {
    def this(
      name: String,
      options: Double | PostProcessOptions,
      camera: js.UndefOr[Nullable[Camera]],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      textureType: js.UndefOr[Double],
      imageProcessingConfiguration: js.UndefOr[ImageProcessingConfiguration]
    ) = this()
    
    /**
      * Attaches a new image processing configuration to the PBR Material.
      * @param configuration
      * @param doNotBuild
      */
    /* protected */ def _attachImageProcessingConfiguration(configuration: Nullable[ImageProcessingConfiguration]): Unit = js.native
    /* protected */ def _attachImageProcessingConfiguration(configuration: Nullable[ImageProcessingConfiguration], doNotBuild: Boolean): Unit = js.native
    
    /**
      * Defines cache preventing GC.
      */
    /* private */ var _defines: Any = js.native
    
    /* private */ var _fromLinearSpace: Any = js.native
    
    /**
      * Default configuration related to image processing available in the PBR Material.
      */
    /* protected */ var _imageProcessingConfiguration: ImageProcessingConfiguration = js.native
    
    /**
      * Keep track of the image processing observer to allow dispose and replace.
      */
    /* private */ var _imageProcessingObserver: Any = js.native
    
    /**
      * @internal
      */
    def _updateParameters(): Unit = js.native
    
    /**
      * Gets Color curves setup used in the effect if colorCurvesEnabled is set to true .
      */
    def colorCurves: Nullable[ColorCurves] = js.native
    
    /**
      * Gets whether the color curves effect is enabled.
      */
    def colorCurvesEnabled: Boolean = js.native
    /**
      * Sets whether the color curves effect is enabled.
      */
    def colorCurvesEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Sets Color curves setup used in the effect if colorCurvesEnabled is set to true .
      */
    def colorCurves_=(value: Nullable[ColorCurves]): Unit = js.native
    
    /**
      * Gets whether the color grading effect is enabled.
      */
    def colorGradingEnabled: Boolean = js.native
    /**
      * Gets whether the color grading effect is enabled.
      */
    def colorGradingEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Gets Color grading LUT texture used in the effect if colorGradingEnabled is set to true.
      */
    def colorGradingTexture: Nullable[BaseTexture] = js.native
    /**
      * Sets Color grading LUT texture used in the effect if colorGradingEnabled is set to true.
      */
    def colorGradingTexture_=(value: Nullable[BaseTexture]): Unit = js.native
    
    /**
      * Gets contrast used in the effect.
      */
    def contrast: Double = js.native
    /**
      * Sets contrast used in the effect.
      */
    def contrast_=(value: Double): Unit = js.native
    
    /**
      * Gets whether the dithering effect is enabled.
      */
    def ditheringEnabled: Boolean = js.native
    /**
      * Sets whether the dithering effect is enabled.
      */
    def ditheringEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Gets intensity of the dithering effect.
      */
    def ditheringIntensity: Double = js.native
    /**
      * Sets intensity of the dithering effect.
      */
    def ditheringIntensity_=(value: Double): Unit = js.native
    
    /**
      * Gets exposure used in the effect.
      */
    def exposure: Double = js.native
    /**
      * Sets exposure used in the effect.
      */
    def exposure_=(value: Double): Unit = js.native
    
    /**
      * Gets whether the input of the processing is in Gamma or Linear Space.
      */
    def fromLinearSpace: Boolean = js.native
    /**
      * Sets whether the input of the processing is in Gamma or Linear Space.
      */
    def fromLinearSpace_=(value: Boolean): Unit = js.native
    
    /**
      * Gets the image processing configuration used either in this material.
      */
    def imageProcessingConfiguration: ImageProcessingConfiguration = js.native
    /**
      * Sets the Default image processing configuration used either in the this material.
      *
      * If sets to null, the scene one is in use.
      */
    def imageProcessingConfiguration_=(value: ImageProcessingConfiguration): Unit = js.native
    
    /**
      * Gets whether tonemapping is enabled or not.
      */
    def toneMappingEnabled: Boolean = js.native
    /**
      * Sets whether tonemapping is enabled or not
      */
    def toneMappingEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Gets the type of tone mapping effect.
      */
    def toneMappingType: Double = js.native
    /**
      * Sets the type of tone mapping effect.
      */
    def toneMappingType_=(value: Double): Unit = js.native
    
    /**
      * Gets the vignette blend mode allowing different kind of effect.
      */
    def vignetteBlendMode: Double = js.native
    /**
      * Sets the vignette blend mode allowing different kind of effect.
      */
    def vignetteBlendMode_=(value: Double): Unit = js.native
    
    /**
      * Gets Camera field of view used by the Vignette effect.
      */
    def vignetteCameraFov: Double = js.native
    /**
      * Sets Camera field of view used by the Vignette effect.
      */
    def vignetteCameraFov_=(value: Double): Unit = js.native
    
    /**
      * Vignette center X Offset.
      */
    def vignetteCenterX: Double = js.native
    def vignetteCenterX_=(value: Double): Unit = js.native
    
    /**
      * Vignette center Y Offset.
      */
    def vignetteCenterY: Double = js.native
    def vignetteCenterY_=(value: Double): Unit = js.native
    
    /**
      * Gets Vignette center X Offset.
      * @deprecated use vignetteCenterX instead
      */
    def vignetteCentreX: Double = js.native
    /**
      * Sets Vignette center X Offset.
      * @deprecated use vignetteCenterX instead
      */
    def vignetteCentreX_=(value: Double): Unit = js.native
    
    /**
      * Gets Vignette center Y Offset.
      * @deprecated use vignetteCenterY instead
      */
    def vignetteCentreY: Double = js.native
    /**
      * Sets Vignette center Y Offset.
      * @deprecated use vignetteCenterY instead
      */
    def vignetteCentreY_=(value: Double): Unit = js.native
    
    /**
      * Gets Color of the vignette applied on the screen through the chosen blend mode (vignetteBlendMode)
      * if vignetteEnabled is set to true.
      */
    def vignetteColor: Color4 = js.native
    /**
      * Sets Color of the vignette applied on the screen through the chosen blend mode (vignetteBlendMode)
      * if vignetteEnabled is set to true.
      */
    def vignetteColor_=(value: Color4): Unit = js.native
    
    /**
      * Gets whether the vignette effect is enabled.
      */
    def vignetteEnabled: Boolean = js.native
    /**
      * Sets whether the vignette effect is enabled.
      */
    def vignetteEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Gets Vignette stretch size.
      */
    def vignetteStretch: Double = js.native
    /**
      * Sets Vignette stretch size.
      */
    def vignetteStretch_=(value: Double): Unit = js.native
    
    /**
      * Gets Vignette weight or intensity of the vignette effect.
      */
    def vignetteWeight: Double = js.native
    /**
      * Sets Vignette weight or intensity of the vignette effect.
      */
    def vignetteWeight_=(value: Double): Unit = js.native
  }
}
