package typings.babylonjs.meshesIndexMod

import typings.babylonjs.anon.Max
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.physicsV1PhysicsImpostorMod.IPhysicsEnabledObject
import typings.babylonjs.physicsV1PhysicsImpostorMod.PhysicsImpostor
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/index", "Mesh")
@js.native
open class Mesh protected ()
  extends typings.babylonjs.meshesMeshMod.Mesh {
  /**
    * @constructor
    * @param name The value used by scene.getMeshByName() to do a lookup.
    * @param scene The scene to add this mesh to.
    * @param parent The parent of this mesh, if it has one
    * @param source An optional Mesh from which geometry is shared, cloned.
    * @param doNotCloneChildren When cloning, skip cloning child meshes of source, default False.
    *                  When false, achieved by calling a clone(), also passing False.
    *                  This will make creation of children, recursive.
    * @param clonePhysicsImpostor When cloning, include cloning mesh physics impostor, default True.
    */
  def this(name: String) = this()
  def this(name: String, scene: Nullable[Scene]) = this()
  def this(name: String, scene: Unit, parent: Nullable[Node]) = this()
  def this(name: String, scene: Nullable[Scene], parent: Nullable[Node]) = this()
  def this(name: String, scene: Unit, parent: Unit, source: Nullable[typings.babylonjs.meshesMeshMod.Mesh]) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Nullable[Node],
    source: Nullable[typings.babylonjs.meshesMeshMod.Mesh]
  ) = this()
  def this(
    name: String,
    scene: Nullable[Scene],
    parent: Unit,
    source: Nullable[typings.babylonjs.meshesMeshMod.Mesh]
  ) = this()
  def this(
    name: String,
    scene: Nullable[Scene],
    parent: Nullable[Node],
    source: Nullable[typings.babylonjs.meshesMeshMod.Mesh]
  ) = this()
  def this(name: String, scene: Unit, parent: Unit, source: Unit, doNotCloneChildren: Boolean) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Unit,
    source: Nullable[typings.babylonjs.meshesMeshMod.Mesh],
    doNotCloneChildren: Boolean
  ) = this()
  def this(name: String, scene: Unit, parent: Nullable[Node], source: Unit, doNotCloneChildren: Boolean) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Nullable[Node],
    source: Nullable[typings.babylonjs.meshesMeshMod.Mesh],
    doNotCloneChildren: Boolean
  ) = this()
  def this(name: String, scene: Nullable[Scene], parent: Unit, source: Unit, doNotCloneChildren: Boolean) = this()
  def this(
    name: String,
    scene: Nullable[Scene],
    parent: Unit,
    source: Nullable[typings.babylonjs.meshesMeshMod.Mesh],
    doNotCloneChildren: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[Scene],
    parent: Nullable[Node],
    source: Unit,
    doNotCloneChildren: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[Scene],
    parent: Nullable[Node],
    source: Nullable[typings.babylonjs.meshesMeshMod.Mesh],
    doNotCloneChildren: Boolean
  ) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Unit,
    source: Unit,
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Unit,
    source: Unit,
    doNotCloneChildren: Unit,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Unit,
    source: Nullable[typings.babylonjs.meshesMeshMod.Mesh],
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Unit,
    source: Nullable[typings.babylonjs.meshesMeshMod.Mesh],
    doNotCloneChildren: Unit,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Nullable[Node],
    source: Unit,
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Nullable[Node],
    source: Unit,
    doNotCloneChildren: Unit,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Nullable[Node],
    source: Nullable[typings.babylonjs.meshesMeshMod.Mesh],
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Unit,
    parent: Nullable[Node],
    source: Nullable[typings.babylonjs.meshesMeshMod.Mesh],
    doNotCloneChildren: Unit,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[Scene],
    parent: Unit,
    source: Unit,
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[Scene],
    parent: Unit,
    source: Unit,
    doNotCloneChildren: Unit,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[Scene],
    parent: Unit,
    source: Nullable[typings.babylonjs.meshesMeshMod.Mesh],
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[Scene],
    parent: Unit,
    source: Nullable[typings.babylonjs.meshesMeshMod.Mesh],
    doNotCloneChildren: Unit,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[Scene],
    parent: Nullable[Node],
    source: Unit,
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[Scene],
    parent: Nullable[Node],
    source: Unit,
    doNotCloneChildren: Unit,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[Scene],
    parent: Nullable[Node],
    source: Nullable[typings.babylonjs.meshesMeshMod.Mesh],
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[Scene],
    parent: Nullable[Node],
    source: Nullable[typings.babylonjs.meshesMeshMod.Mesh],
    doNotCloneChildren: Unit,
    clonePhysicsImpostor: Boolean
  ) = this()
}
/* static members */
object Mesh {
  
  @JSImport("babylonjs/Meshes/index", "Mesh")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Mesh side orientation : usually the internal or back surface
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.BACKSIDE")
  @js.native
  val BACKSIDE: Double = js.native
  
  /**
    * Mesh tile positioning : part tiles on bottom
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.BOTTOM")
  @js.native
  val BOTTOM: Double = js.native
  
  /**
    * Mesh cap setting : two caps, one at the beginning  and one at the end of the mesh
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.CAP_ALL")
  @js.native
  val CAP_ALL: Double = js.native
  
  /**
    * Mesh cap setting : one cap at the end of the mesh
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.CAP_END")
  @js.native
  val CAP_END: Double = js.native
  
  /**
    * Mesh cap setting : one cap at the beginning of the mesh
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.CAP_START")
  @js.native
  val CAP_START: Double = js.native
  
  /**
    * Mesh tile positioning : part tiles same on left/right or top/bottom
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.CENTER")
  @js.native
  val CENTER: Double = js.native
  
  inline def Center(meshesOrMinMaxVector: js.Array[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh]): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Center")(meshesOrMinMaxVector.asInstanceOf[js.Any]).asInstanceOf[Vector3]
  /**
    * Returns the center of the `{min:` Vector3`, max:` Vector3`}` or the center of MinMax vector3 computed from a mesh array
    * @param meshesOrMinMaxVector could be an array of meshes or a `{min:` Vector3`, max:` Vector3`}` object
    * @returns a vector3
    */
  inline def Center(meshesOrMinMaxVector: Max): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Center")(meshesOrMinMaxVector.asInstanceOf[js.Any]).asInstanceOf[Vector3]
  
  /**
    * Mesh side orientation : by default, `FRONTSIDE`
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.DEFAULTSIDE")
  @js.native
  val DEFAULTSIDE: Double = js.native
  
  /**
    * Mesh side orientation : both internal and external or front and back surfaces
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.DOUBLESIDE")
  @js.native
  val DOUBLESIDE: Double = js.native
  
  /**
    * Mesh pattern setting : rotate pattern and rotate
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.FLIP_N_ROTATE_ROW")
  @js.native
  val FLIP_N_ROTATE_ROW: Double = js.native
  
  /**
    * Mesh pattern setting : flip and rotate alternate tiles on each row or column
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.FLIP_N_ROTATE_TILE")
  @js.native
  val FLIP_N_ROTATE_TILE: Double = js.native
  
  /**
    * Mesh pattern setting : flip (reflect in y axis) all tiles on alternate rows
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.FLIP_ROW")
  @js.native
  val FLIP_ROW: Double = js.native
  
  /**
    * Mesh pattern setting : flip (reflect in y axis) alternate tiles on each row or column
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.FLIP_TILE")
  @js.native
  val FLIP_TILE: Double = js.native
  
  /**
    * Mesh side orientation : usually the external or front surface
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.FRONTSIDE")
  @js.native
  val FRONTSIDE: Double = js.native
  
  /**
    * Indicates that the instanced meshes should be sorted from back to front before rendering if their material is transparent
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.INSTANCEDMESH_SORT_TRANSPARENT")
  @js.native
  def INSTANCEDMESH_SORT_TRANSPARENT: Boolean = js.native
  inline def INSTANCEDMESH_SORT_TRANSPARENT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSTANCEDMESH_SORT_TRANSPARENT")(x.asInstanceOf[js.Any])
  
  /**
    * Mesh tile positioning : part tiles on left
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.LEFT")
  @js.native
  val LEFT: Double = js.native
  
  /**
    * Merge the array of meshes into a single mesh for performance reasons.
    * @param meshes array of meshes with the vertices to merge. Entries cannot be empty meshes.
    * @param disposeSource when true (default), dispose of the vertices from the source meshes.
    * @param allow32BitsIndices when the sum of the vertices > 64k, this must be set to true.
    * @param meshSubclass (optional) can be set to a Mesh where the merged vertices will be inserted.
    * @param subdivideWithSubMeshes when true (false default), subdivide mesh into subMeshes.
    * @param multiMultiMaterials when true (false default), subdivide mesh into subMeshes with multiple materials, ignores subdivideWithSubMeshes.
    * @returns a new mesh
    */
  inline def MergeMeshes(meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh]): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = ^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh], disposeSource: Boolean): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  inline def MergeMeshes(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): Nullable[typings.babylonjs.meshesMeshMod.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.meshesMeshMod.Mesh]]
  
  /**
    * Merge the array of meshes into a single mesh for performance reasons.
    * @param meshes array of meshes with the vertices to merge. Entries cannot be empty meshes.
    * @param disposeSource when true (default), dispose of the vertices from the source meshes.
    * @param allow32BitsIndices when the sum of the vertices > 64k, this must be set to true.
    * @param meshSubclass (optional) can be set to a Mesh where the merged vertices will be inserted.
    * @param subdivideWithSubMeshes when true (false default), subdivide mesh into subMeshes.
    * @param multiMultiMaterials when true (false default), subdivide mesh into subMeshes with multiple materials, ignores subdivideWithSubMeshes.
    * @returns a new mesh
    */
  inline def MergeMeshesAsync(meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh], disposeSource: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Boolean,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: Unit,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def MergeMeshesAsync(
    meshes: js.Array[typings.babylonjs.meshesMeshMod.Mesh],
    disposeSource: Unit,
    allow32BitsIndices: Unit,
    meshSubclass: typings.babylonjs.meshesMeshMod.Mesh,
    subdivideWithSubMeshes: Unit,
    multiMultiMaterials: Boolean
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  /**
    * Returns an object containing a min and max Vector3 which are the minimum and maximum vectors of each mesh bounding box from the passed array, in the world coordinates
    * @param meshes defines the list of meshes to scan
    * @returns an object `{min:` Vector3`, max:` Vector3`}`
    */
  inline def MinMax(meshes: js.Array[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh]): Max = ^.asInstanceOf[js.Dynamic].applyDynamic("MinMax")(meshes.asInstanceOf[js.Any]).asInstanceOf[Max]
  
  /**
    * Mesh cap setting : no cap
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.NO_CAP")
  @js.native
  val NO_CAP: Double = js.native
  
  /**
    * Mesh pattern setting : no flip or rotate
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.NO_FLIP")
  @js.native
  val NO_FLIP: Double = js.native
  
  /**
    * Returns a new Mesh object parsed from the source provided.
    * @param parsedMesh is the source
    * @param scene defines the hosting scene
    * @param rootUrl is the root URL to prefix the `delayLoadingFile` property with
    * @returns a new Mesh
    */
  inline def Parse(parsedMesh: Any, scene: Scene, rootUrl: String): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  
  /**
    * Mesh tile positioning : part tiles on right
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.RIGHT")
  @js.native
  val RIGHT: Double = js.native
  
  /**
    * Mesh pattern setting : rotate (180degs) all tiles on alternate rows
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.ROTATE_ROW")
  @js.native
  val ROTATE_ROW: Double = js.native
  
  /**
    * Mesh pattern setting : rotate (180degs) alternate tiles on each row or column
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.ROTATE_TILE")
  @js.native
  val ROTATE_TILE: Double = js.native
  
  /**
    * Mesh tile positioning : part tiles on top
    */
  @JSImport("babylonjs/Meshes/index", "Mesh.TOP")
  @js.native
  val TOP: Double = js.native
  
  /**
    * Gets the default side orientation.
    * @param orientation the orientation to value to attempt to get
    * @returns the default orientation
    * @internal
    */
  inline def _GetDefaultSideOrientation(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetDefaultSideOrientation")().asInstanceOf[Double]
  inline def _GetDefaultSideOrientation(orientation: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetDefaultSideOrientation")(orientation.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * @internal
    */
  inline def _GoldbergMeshParser(parsedMesh: Any, scene: Scene): typings.babylonjs.meshesGoldbergMeshMod.GoldbergMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("_GoldbergMeshParser")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesGoldbergMeshMod.GoldbergMesh]
  
  /**
    * @internal
    */
  inline def _GroundMeshParser(parsedMesh: Any, scene: Scene): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("_GroundMeshParser")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  
  /**
    * @internal
    */
  inline def _LinesMeshParser(parsedMesh: Any, scene: Scene): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("_LinesMeshParser")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  
  @JSImport("babylonjs/Meshes/index", "Mesh._MergeMeshesCoroutine")
  @js.native
  def _MergeMeshesCoroutine: Any = js.native
  inline def _MergeMeshesCoroutine_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MergeMeshesCoroutine")(x.asInstanceOf[js.Any])
  
  /**
    * @internal
    */
  inline def _PhysicsImpostorParser(scene: Scene, physicObject: IPhysicsEnabledObject, jsonObject: Any): PhysicsImpostor = (^.asInstanceOf[js.Dynamic].applyDynamic("_PhysicsImpostorParser")(scene.asInstanceOf[js.Any], physicObject.asInstanceOf[js.Any], jsonObject.asInstanceOf[js.Any])).asInstanceOf[PhysicsImpostor]
  
  /**
    * @internal
    */
  inline def _instancedMeshFactory(name: String, mesh: typings.babylonjs.meshesMeshMod.Mesh): typings.babylonjs.meshesInstancedMeshMod.InstancedMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("_instancedMeshFactory")(name.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesInstancedMeshMod.InstancedMesh]
}
