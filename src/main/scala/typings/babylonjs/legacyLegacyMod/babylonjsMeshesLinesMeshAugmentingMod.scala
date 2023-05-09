package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsMeshesLinesMeshAugmentingMod {
  
  @js.native
  trait InstancedLinesMesh extends StObject {
    
    /**
      * Enables the edge rendering mode on the mesh.
      * This mode makes the mesh edges visible
      * @param epsilon defines the maximal distance between two angles to detect a face
      * @param checkVerticesInsteadOfIndices indicates that we should check vertex list directly instead of faces
      * @returns the current InstancedLinesMesh
      * @see https://www.babylonjs-playground.com/#19O9TU#0
      */
    def enableEdgesRendering(): typings.babylonjs.renderingEdgesRendererMod.babylonjsMeshesLinesMeshAugmentingMod.InstancedLinesMesh = js.native
    def enableEdgesRendering(epsilon: Double): typings.babylonjs.renderingEdgesRendererMod.babylonjsMeshesLinesMeshAugmentingMod.InstancedLinesMesh = js.native
    def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Boolean): typings.babylonjs.renderingEdgesRendererMod.babylonjsMeshesLinesMeshAugmentingMod.InstancedLinesMesh = js.native
    def enableEdgesRendering(epsilon: Unit, checkVerticesInsteadOfIndices: Boolean): typings.babylonjs.renderingEdgesRendererMod.babylonjsMeshesLinesMeshAugmentingMod.InstancedLinesMesh = js.native
  }
  
  @js.native
  trait LinesMesh extends StObject {
    
    /**
      * Enables the edge rendering mode on the mesh.
      * This mode makes the mesh edges visible
      * @param epsilon defines the maximal distance between two angles to detect a face
      * @param checkVerticesInsteadOfIndices indicates that we should check vertex list directly instead of faces
      * @returns the currentAbstractMesh
      * @see https://www.babylonjs-playground.com/#19O9TU#0
      */
    def enableEdgesRendering(): typings.babylonjs.meshesAbstractMeshMod.AbstractMesh = js.native
    def enableEdgesRendering(epsilon: Double): typings.babylonjs.meshesAbstractMeshMod.AbstractMesh = js.native
    def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Boolean): typings.babylonjs.meshesAbstractMeshMod.AbstractMesh = js.native
    def enableEdgesRendering(epsilon: Unit, checkVerticesInsteadOfIndices: Boolean): typings.babylonjs.meshesAbstractMeshMod.AbstractMesh = js.native
  }
}
