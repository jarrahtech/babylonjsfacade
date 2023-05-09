package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.miscIInspectableMod.IInspectable
import typings.babylonjs.postProcessesRenderPipelinePostProcessRenderEffectMod.PostProcessRenderEffect
import typings.babylonjs.renderingPrePassRendererMod.PrePassRenderer
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessesRenderPipelinePostProcessRenderPipelineMod {
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/postProcessRenderPipeline", "PostProcessRenderPipeline")
  @js.native
  open class PostProcessRenderPipeline protected () extends StObject {
    /**
      * Initializes a PostProcessRenderPipeline
      * @param _engine engine to add the pipeline to
      * @param name name of the pipeline
      */
    def this(_engine: Engine, name: String) = this()
    
    /** @internal */
    def _attachCameras(cameras: js.Array[Camera], unique: Boolean): Unit = js.native
    /** @internal */
    def _attachCameras(cameras: Camera, unique: Boolean): Unit = js.native
    
    /**
      * @internal
      */
    /* protected */ var _cameras: js.Array[Camera] = js.native
    
    /** @internal */
    def _detachCameras(cameras: Camera): Unit = js.native
    /** @internal */
    def _detachCameras(cameras: Nullable[js.Array[Camera]]): Unit = js.native
    
    /** @internal */
    def _disableEffect(renderEffectName: String, cameras: Nullable[js.Array[Camera]]): Unit = js.native
    
    /** @internal */
    def _enableEffect(renderEffectName: String, cameras: js.Array[Camera]): Unit = js.native
    /** @internal */
    def _enableEffect(renderEffectName: String, cameras: Camera): Unit = js.native
    
    /* protected */ def _enableMSAAOnFirstPostProcess(sampleCount: Double): Boolean = js.native
    
    /* private */ var _engine: Any = js.native
    
    /** @internal */
    var _name: String = js.native
    
    /** @internal */
    def _rebuild(): Unit = js.native
    
    /* protected */ var _renderEffects: StringDictionary[PostProcessRenderEffect] = js.native
    
    /* protected */ var _renderEffectsForIsolatedPass: js.Array[PostProcessRenderEffect] = js.native
    
    /** @internal */
    def _reset(): Unit = js.native
    
    /** @internal */
    def _update(): Unit = js.native
    
    /**
      * Adds an effect to the pipeline
      * @param renderEffect the effect to add
      */
    def addEffect(renderEffect: PostProcessRenderEffect): Unit = js.native
    
    /** Gets the list of attached cameras */
    def cameras: js.Array[Camera] = js.native
    
    /**
      * Disposes of the pipeline
      */
    def dispose(): Unit = js.native
    
    /**
      * Gets the class name
      * @returns "PostProcessRenderPipeline"
      */
    def getClassName(): String = js.native
    
    /**
      * List of inspectable custom properties (used by the Inspector)
      * @see https://doc.babylonjs.com/toolsAndResources/inspector#extensibility
      */
    var inspectableCustomProperties: js.Array[IInspectable] = js.native
    
    /**
      * If all the render effects in the pipeline are supported
      */
    def isSupported: Boolean = js.native
    
    /**
      * Gets pipeline name
      */
    def name: String = js.native
    
    /**
      * Sets the required values to the prepass renderer.
      * @param prePassRenderer defines the prepass renderer to setup.
      * @returns true if the pre pass is needed.
      */
    def setPrePassRenderer(prePassRenderer: PrePassRenderer): Boolean = js.native
  }
}
