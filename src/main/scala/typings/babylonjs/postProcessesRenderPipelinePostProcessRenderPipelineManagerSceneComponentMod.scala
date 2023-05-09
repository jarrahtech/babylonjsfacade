package typings.babylonjs

import typings.babylonjs.postProcessesRenderPipelinePostProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessesRenderPipelinePostProcessRenderPipelineManagerSceneComponentMod {
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/postProcessRenderPipelineManagerSceneComponent", "PostProcessRenderPipelineManagerSceneComponent")
  @js.native
  open class PostProcessRenderPipelineManagerSceneComponent protected ()
    extends StObject
       with ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    /* private */ var _gatherRenderTargets: Any = js.native
    
    /**
      * Disposes the component and the associated ressources.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The name of the component. Each component must have a unique name.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Rebuilds the elements related to this component in case of
      * context lost for instance.
      */
    /* CompleteClass */
    override def rebuild(): Unit = js.native
    
    /**
      * Register the component to one instance of a scene.
      */
    /* CompleteClass */
    override def register(): Unit = js.native
    
    /**
      * The scene the component belongs to.
      */
    /* CompleteClass */
    var scene: Scene = js.native
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    trait Scene extends StObject {
      
      /** @internal (Backing field) */
      var _postProcessRenderPipelineManager: PostProcessRenderPipelineManager
      
      /**
        * Gets the postprocess render pipeline manager
        * @see https://doc.babylonjs.com/features/featuresDeepDive/postProcesses/postProcessRenderPipeline
        * @see https://doc.babylonjs.com/features/featuresDeepDive/postProcesses/defaultRenderingPipeline
        */
      val postProcessRenderPipelineManager: PostProcessRenderPipelineManager
    }
    object Scene {
      
      inline def apply(
        _postProcessRenderPipelineManager: PostProcessRenderPipelineManager,
        postProcessRenderPipelineManager: PostProcessRenderPipelineManager
      ): typings.babylonjs.postProcessesRenderPipelinePostProcessRenderPipelineManagerSceneComponentMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(_postProcessRenderPipelineManager = _postProcessRenderPipelineManager.asInstanceOf[js.Any], postProcessRenderPipelineManager = postProcessRenderPipelineManager.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.babylonjs.postProcessesRenderPipelinePostProcessRenderPipelineManagerSceneComponentMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.babylonjs.postProcessesRenderPipelinePostProcessRenderPipelineManagerSceneComponentMod.babylonjsSceneAugmentingMod.Scene] (val x: Self) extends AnyVal {
        
        inline def setPostProcessRenderPipelineManager(value: PostProcessRenderPipelineManager): Self = StObject.set(x, "postProcessRenderPipelineManager", value.asInstanceOf[js.Any])
        
        inline def set_postProcessRenderPipelineManager(value: PostProcessRenderPipelineManager): Self = StObject.set(x, "_postProcessRenderPipelineManager", value.asInstanceOf[js.Any])
      }
    }
  }
}
