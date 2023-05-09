package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matrix extends StObject {
  
  /* private */ var _isIdentity: Any = js.native
  
  /* private */ var _isIdentity3x2: Any = js.native
  
  /* private */ var _isIdentity3x2Dirty: Any = js.native
  
  /* private */ var _isIdentityDirty: Any = js.native
  
  /* private */ val _m: Any = js.native
  
  /* private */ var _updateIdentityStatus: Any = js.native
  
  /**
    * Adds the current matrix with a second one
    * Example Playground - https://playground.babylonjs.com/#AV9X17#44
    * @param other defines the matrix to add
    * @returns a new matrix as the addition of the current matrix and the given one
    */
  def add(other: DeepImmutable[Matrix]): this.type = js.native
  
  /**
    * add a value at the specified position in the current Matrix
    * Example Playground - https://playground.babylonjs.com/#AV9X17#47
    * @param index the index of the value within the matrix. between 0 and 15.
    * @param value the value to be added
    * @returns the current updated matrix
    */
  def addAtIndex(index: Double, value: Double): this.type = js.native
  
  /**
    * Sets the given matrix "result" to the addition of the current matrix and the given one
    * Example Playground - https://playground.babylonjs.com/#AV9X17#45
    * @param other defines the matrix to add
    * @param result defines the target matrix
    * @returns result input
    */
  def addToRef[T /* <: Matrix */](other: DeepImmutable[Matrix], result: T): T = js.native
  
  /**
    * Adds in place the given matrix to the current matrix
    * Example Playground - https://playground.babylonjs.com/#AV9X17#46
    * @param other defines the second operand
    * @returns the current updated matrix
    */
  def addToSelf(other: DeepImmutable[Matrix]): this.type = js.native
  
  /**
    * Adds the translation vector (using 3 floats) in the current matrix
    * Example Playground - https://playground.babylonjs.com/#AV9X17#20
    * Example Playground - https://playground.babylonjs.com/#AV9X17#48
    * @param x defines the 1st component of the translation
    * @param y defines the 2nd component of the translation
    * @param z defines the 3rd component of the translation
    * @returns the current updated matrix
    */
  def addTranslationFromFloats(x: Double, y: Double, z: Double): this.type = js.native
  
  /**
    * Returns the matrix as a Float32Array or Array<number>
    * Example Playground - https://playground.babylonjs.com/#AV9X17#114
    * @returns the matrix underlying array.
    */
  def asArray(): DeepImmutable[js.typedarray.Float32Array | js.Array[Double]] = js.native
  
  /**
    * Copy the current matrix from the given one
    * Example Playground - https://playground.babylonjs.com/#AV9X17#21
    * @param other defines the source matrix
    * @returns the current updated matrix
    */
  def copyFrom(other: DeepImmutable[Matrix]): this.type = js.native
  
  def copyToArray(array: js.Array[Double]): this.type = js.native
  def copyToArray(array: js.Array[Double], offset: Double): this.type = js.native
  /**
    * Populates the given array from the starting index with the current matrix values
    * @param array defines the target array
    * @param offset defines the offset in the target array where to start storing values
    * @returns the current matrix
    */
  def copyToArray(array: js.typedarray.Float32Array): this.type = js.native
  def copyToArray(array: js.typedarray.Float32Array, offset: Double): this.type = js.native
  
  /**
    * Decomposes the current Matrix into a translation, rotation and scaling components
    * Example Playground - https://playground.babylonjs.com/#AV9X17#12
    * @param scale defines the scale vector3 given as a reference to update
    * @param rotation defines the rotation quaternion given as a reference to update
    * @param translation defines the translation vector3 given as a reference to update
    * @param preserveScalingNode Use scaling sign coming from this node. Otherwise scaling sign might change.
    * @returns true if operation was successful
    */
  def decompose(): Boolean = js.native
  def decompose(scale: Unit, rotation: Unit, translation: Unit, preserveScalingNode: TransformNode): Boolean = js.native
  def decompose(scale: Unit, rotation: Unit, translation: Vector3): Boolean = js.native
  def decompose(scale: Unit, rotation: Unit, translation: Vector3, preserveScalingNode: TransformNode): Boolean = js.native
  def decompose(scale: Unit, rotation: Quaternion): Boolean = js.native
  def decompose(scale: Unit, rotation: Quaternion, translation: Unit, preserveScalingNode: TransformNode): Boolean = js.native
  def decompose(scale: Unit, rotation: Quaternion, translation: Vector3): Boolean = js.native
  def decompose(scale: Unit, rotation: Quaternion, translation: Vector3, preserveScalingNode: TransformNode): Boolean = js.native
  def decompose(scale: Vector3): Boolean = js.native
  def decompose(scale: Vector3, rotation: Unit, translation: Unit, preserveScalingNode: TransformNode): Boolean = js.native
  def decompose(scale: Vector3, rotation: Unit, translation: Vector3): Boolean = js.native
  def decompose(scale: Vector3, rotation: Unit, translation: Vector3, preserveScalingNode: TransformNode): Boolean = js.native
  def decompose(scale: Vector3, rotation: Quaternion): Boolean = js.native
  def decompose(scale: Vector3, rotation: Quaternion, translation: Unit, preserveScalingNode: TransformNode): Boolean = js.native
  def decompose(scale: Vector3, rotation: Quaternion, translation: Vector3): Boolean = js.native
  def decompose(scale: Vector3, rotation: Quaternion, translation: Vector3, preserveScalingNode: TransformNode): Boolean = js.native
  
  /**
    * Decomposes the current Matrix into a translation, rotation and scaling components of the provided node
    * Example Playground - https://playground.babylonjs.com/#AV9X17#13
    * @param node the node to decompose the matrix to
    * @returns true if operation was successful
    */
  def decomposeToTransformNode(node: TransformNode): Boolean = js.native
  
  /**
    * Gets the determinant of the matrix
    * Example Playground - https://playground.babylonjs.com/#AV9X17#34
    * @returns the matrix determinant
    */
  def determinant(): Double = js.native
  
  /**
    * Check equality between this matrix and a second one
    * @param value defines the second matrix to compare
    * @returns true is the current matrix and the given one values are strictly equal
    */
  def equals(value: DeepImmutable[Matrix]): Boolean = js.native
  
  /**
    * Returns the name of the current matrix class
    * @returns the string "Matrix"
    */
  def getClassName(): String = js.native
  
  /**
    * Gets the hash code of the current matrix
    * @returns the hash code
    */
  def getHashCode(): Double = js.native
  
  /**
    * Gets only rotation part of the current matrix
    * @returns a new matrix sets to the extracted rotation matrix from the current one
    */
  def getRotationMatrix(): this.type = js.native
  
  /**
    * Extracts the rotation matrix from the current one and sets it as the given "result"
    * @param result defines the target matrix to store data to
    * @returns result input
    */
  def getRotationMatrixToRef[T /* <: Matrix */](result: T): T = js.native
  
  /**
    * Gets specific row of the matrix
    * Example Playground - https://playground.babylonjs.com/#AV9X17#36
    * @param index defines the number of the row to get
    * @returns the index-th row of the current matrix as a new Vector4
    */
  def getRow(index: Double): Nullable[Vector4] = js.native
  
  /**
    * Gets specific row of the matrix to ref
    * Example Playground - https://playground.babylonjs.com/#AV9X17#36
    * @param index defines the number of the row to get
    * @param rowVector vector to store the index-th row of the current matrix
    * @returns result input
    */
  def getRowToRef[T /* <: Vector4 */](index: Double, rowVector: T): T = js.native
  
  /**
    * Gets the translation value of the current matrix
    * Example Playground - https://playground.babylonjs.com/#AV9X17#122
    * @returns a new Vector3 as the extracted translation from the matrix
    */
  def getTranslation(): Vector3 = js.native
  
  /**
    * Fill a Vector3 with the extracted translation from the matrix
    * Example Playground - https://playground.babylonjs.com/#AV9X17#123
    * @param result defines the Vector3 where to store the translation
    * @returns the current matrix
    */
  def getTranslationToRef[T /* <: Vector3 */](result: T): T = js.native
  
  /**
    * Inverts the current matrix in place
    * Example Playground - https://playground.babylonjs.com/#AV9X17#118
    * @returns the current inverted matrix
    */
  def invert(): this.type = js.native
  
  /**
    * Sets the given matrix to the current inverted Matrix
    * Example Playground - https://playground.babylonjs.com/#AV9X17#119
    * @param other defines the target matrix
    * @returns result input
    */
  def invertToRef[T /* <: Matrix */](other: T): T = js.native
  
  /**
    * Check if the current matrix is identity
    * @returns true is the matrix is the identity matrix
    */
  def isIdentity(): Boolean = js.native
  
  /**
    * Check if the current matrix is identity as a texture matrix (3x2 store in 4x4)
    * @returns true is the matrix is the identity matrix
    */
  def isIdentityAs3x2(): Boolean = js.native
  
  /**
    * Gets the internal data of the matrix
    */
  def m: DeepImmutable[js.typedarray.Float32Array | js.Array[Double]] = js.native
  
  /**
    * Update the updateFlag to indicate that the matrix has been updated
    */
  def markAsUpdated(): Unit = js.native
  
  /**
    * Multiply two matrices
    * Example Playground - https://playground.babylonjs.com/#AV9X17#15
    * A.multiply(B) means apply B to A so result is B x A
    * @param other defines the second operand
    * @returns a new matrix set with the multiplication result of the current Matrix and the given one
    */
  def multiply(other: DeepImmutable[Matrix]): this.type = js.native
  
  /**
    * mutiply the specified position in the current Matrix by a value
    * @param index the index of the value within the matrix. between 0 and 15.
    * @param value the value to be added
    * @returns the current updated matrix
    */
  def multiplyAtIndex(index: Double, value: Double): this.type = js.native
  
  def multiplyToArray(other: DeepImmutable[Matrix], result: js.Array[Double], offset: Double): this.type = js.native
  /**
    * Sets the Float32Array "result" from the given index "offset" with the multiplication of the current matrix and the given one
    * @param other defines the second operand
    * @param result defines the array where to store the multiplication
    * @param offset defines the offset in the target array where to start storing values
    * @returns the current matrix
    */
  def multiplyToArray(other: DeepImmutable[Matrix], result: js.typedarray.Float32Array, offset: Double): this.type = js.native
  
  /**
    * Sets the given matrix "result" with the multiplication result of the current Matrix and the given one
    * A.multiplyToRef(B, R) means apply B to A and store in R and R = B x A
    * Example Playground - https://playground.babylonjs.com/#AV9X17#16
    * @param other defines the second operand
    * @param result defines the matrix where to store the multiplication
    * @returns result input
    */
  def multiplyToRef[T /* <: Matrix */](other: DeepImmutable[Matrix], result: T): T = js.native
  
  /**
    * Remove rotation and scaling part from the matrix
    * @returns the updated matrix
    */
  def removeRotationAndScaling(): this.type = js.native
  
  /**
    * Sets all the matrix elements to zero
    * @returns the current matrix
    */
  def reset(): this.type = js.native
  
  /**
    * Compute a new matrix set with the current matrix values multiplied by scale (float)
    * @param scale defines the scale factor
    * @returns a new matrix
    */
  def scale(scale: Double): this.type = js.native
  
  /**
    * Scale the current matrix values by a factor and add the result to a given matrix
    * @param scale defines the scale factor
    * @param result defines the Matrix to store the result
    * @returns result input
    */
  def scaleAndAddToRef[T /* <: Matrix */](scale: Double, result: T): T = js.native
  
  /**
    * Scale the current matrix values by a factor to a given result matrix
    * @param scale defines the scale factor
    * @param result defines the matrix to store the result
    * @returns result input
    */
  def scaleToRef[T /* <: Matrix */](scale: Double, result: T): T = js.native
  
  /**
    * Sets the index-th row of the current matrix to the vector4 values
    * Example Playground - https://playground.babylonjs.com/#AV9X17#36
    * @param index defines the number of the row to set
    * @param row defines the target vector4
    * @returns the updated current matrix
    */
  def setRow(index: Double, row: Vector4): this.type = js.native
  
  /**
    * Sets the index-th row of the current matrix with the given 4 x float values
    * Example Playground - https://playground.babylonjs.com/#AV9X17#36
    * @param index defines the row index
    * @param x defines the x component to set
    * @param y defines the y component to set
    * @param z defines the z component to set
    * @param w defines the w component to set
    * @returns the updated current matrix
    */
  def setRowFromFloats(index: Double, x: Double, y: Double, z: Double, w: Double): this.type = js.native
  
  /**
    * Inserts the translation vector in the current matrix
    * Example Playground - https://playground.babylonjs.com/#AV9X17#121
    * @param vector3 defines the translation to insert
    * @returns the current updated matrix
    */
  def setTranslation(vector3: DeepImmutable[Vector3]): this.type = js.native
  
  /**
    * Inserts the translation vector (using 3 floats) in the current matrix
    * Example Playground - https://playground.babylonjs.com/#AV9X17#120
    * @param x defines the 1st component of the translation
    * @param y defines the 2nd component of the translation
    * @param z defines the 3rd component of the translation
    * @returns the current updated matrix
    */
  def setTranslationFromFloats(x: Double, y: Double, z: Double): this.type = js.native
  
  /**
    * Returns the matrix as a Float32Array or Array<number>
    * Example Playground - https://playground.babylonjs.com/#AV9X17#49
    * @returns the matrix underlying array
    */
  def toArray(): DeepImmutable[js.typedarray.Float32Array | js.Array[Double]] = js.native
  
  /**
    * Writes to the given matrix a normal matrix, computed from this one (using values from identity matrix for fourth row and column).
    * Example Playground - https://playground.babylonjs.com/#AV9X17#17
    * @param ref matrix to store the result
    */
  def toNormalMatrix[T /* <: Matrix */](ref: T): T = js.native
  
  /**
    * Toggles model matrix from being right handed to left handed in place and vice versa
    */
  def toggleModelMatrixHandInPlace(): this.type = js.native
  
  /**
    * Toggles projection matrix from being right handed to left handed in place and vice versa
    */
  def toggleProjectionMatrixHandInPlace(): this.type = js.native
  
  /**
    * Compute the transpose of the matrix
    * Example Playground - https://playground.babylonjs.com/#AV9X17#40
    * @returns the new transposed matrix
    */
  def transpose(): this.type = js.native
  
  /**
    * Compute the transpose of the matrix and store it in a given matrix
    * Example Playground - https://playground.babylonjs.com/#AV9X17#41
    * @param result defines the target matrix
    * @returns result input
    */
  def transposeToRef[T /* <: Matrix */](result: T): T = js.native
  
  /**
    * Gets the update flag of the matrix which is an unique number for the matrix.
    * It will be incremented every time the matrix data change.
    * You can use it to speed the comparison between two versions of the same matrix.
    */
  var updateFlag: Double = js.native
}
