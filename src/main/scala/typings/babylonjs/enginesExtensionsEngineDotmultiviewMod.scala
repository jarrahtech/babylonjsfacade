package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.enginesRenderTargetWrapperMod.RenderTargetWrapper
import typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.materialsUniformBufferMod.UniformBuffer
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesExtensionsEngineDotmultiviewMod {
  
  /* augmented module */
  object babylonjsCamerasCameraAugmentingMod {
    
    trait Camera extends StObject {
      
      /**
        * @internal
        * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
        */
      var _multiviewTexture: Nullable[RenderTargetTexture]
      
      /**
        * @internal
        * For WebXR cameras that are rendering to multiview texture arrays.
        */
      var _renderingMultiview: Boolean
      
      /**
        * @internal
        * ensures the multiview texture of the camera exists and has the specified width/height
        * @param width height to set on the multiview texture
        * @param height width to set on the multiview texture
        */
      def _resizeOrCreateMultiviewTexture(width: Double, height: Double): Unit
      
      /**
        * @internal
        * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
        */
      var _useMultiviewToSingleView: Boolean
    }
    object Camera {
      
      inline def apply(
        _renderingMultiview: Boolean,
        _resizeOrCreateMultiviewTexture: (Double, Double) => Unit,
        _useMultiviewToSingleView: Boolean
      ): Camera = {
        val __obj = js.Dynamic.literal(_renderingMultiview = _renderingMultiview.asInstanceOf[js.Any], _resizeOrCreateMultiviewTexture = js.Any.fromFunction2(_resizeOrCreateMultiviewTexture), _useMultiviewToSingleView = _useMultiviewToSingleView.asInstanceOf[js.Any], _multiviewTexture = null)
        __obj.asInstanceOf[Camera]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Camera] (val x: Self) extends AnyVal {
        
        inline def set_multiviewTexture(value: Nullable[RenderTargetTexture]): Self = StObject.set(x, "_multiviewTexture", value.asInstanceOf[js.Any])
        
        inline def set_multiviewTextureNull: Self = StObject.set(x, "_multiviewTexture", null)
        
        inline def set_renderingMultiview(value: Boolean): Self = StObject.set(x, "_renderingMultiview", value.asInstanceOf[js.Any])
        
        inline def set_resizeOrCreateMultiviewTexture(value: (Double, Double) => Unit): Self = StObject.set(x, "_resizeOrCreateMultiviewTexture", js.Any.fromFunction2(value))
        
        inline def set_useMultiviewToSingleView(value: Boolean): Self = StObject.set(x, "_useMultiviewToSingleView", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object babylonjsEnginesEngineAugmentingMod {
    
    trait Engine extends StObject {
      
      /**
        * Binds a multiview render target wrapper to be drawn to
        * @param multiviewTexture render target wrapper to bind
        */
      def bindMultiviewFramebuffer(multiviewTexture: RenderTargetWrapper): Unit
      
      /**
        * Creates a new multiview render target
        * @param width defines the width of the texture
        * @param height defines the height of the texture
        * @returns the created multiview render target wrapper
        */
      def createMultiviewRenderTargetTexture(width: Double, height: Double): RenderTargetWrapper
    }
    object Engine {
      
      inline def apply(
        bindMultiviewFramebuffer: RenderTargetWrapper => Unit,
        createMultiviewRenderTargetTexture: (Double, Double) => RenderTargetWrapper
      ): Engine = {
        val __obj = js.Dynamic.literal(bindMultiviewFramebuffer = js.Any.fromFunction1(bindMultiviewFramebuffer), createMultiviewRenderTargetTexture = js.Any.fromFunction2(createMultiviewRenderTargetTexture))
        __obj.asInstanceOf[Engine]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Engine] (val x: Self) extends AnyVal {
        
        inline def setBindMultiviewFramebuffer(value: RenderTargetWrapper => Unit): Self = StObject.set(x, "bindMultiviewFramebuffer", js.Any.fromFunction1(value))
        
        inline def setCreateMultiviewRenderTargetTexture(value: (Double, Double) => RenderTargetWrapper): Self = StObject.set(x, "createMultiviewRenderTargetTexture", js.Any.fromFunction2(value))
      }
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @internal */
      def _createMultiviewUbo(): Unit = js.native
      
      /** @internal */
      var _multiviewSceneUbo: Nullable[UniformBuffer] = js.native
      
      /** @internal */
      def _renderMultiviewToSingleView(camera: Camera): Unit = js.native
      
      /** @internal */
      var _transformMatrixR: Matrix = js.native
      
      /** @internal */
      def _updateMultiviewUbo(): Unit = js.native
      def _updateMultiviewUbo(viewR: Unit, projectionR: Matrix): Unit = js.native
      def _updateMultiviewUbo(viewR: Matrix): Unit = js.native
      def _updateMultiviewUbo(viewR: Matrix, projectionR: Matrix): Unit = js.native
    }
  }
}
