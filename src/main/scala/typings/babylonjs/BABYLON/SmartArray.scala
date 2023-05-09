package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartArray[T]
  extends StObject
     with ISmartArrayLike[T] {
  
  /* protected */ var _id: Double
  
  /**
    * Concats the active data with a given array.
    * @param array defines the data to concatenate with.
    */
  def concat(array: Any): Unit
  
  /**
    * Returns whether an element is part of the active data.
    * @param value defines the value to look for
    * @returns true if found in the active data otherwise false
    */
  def contains(value: T): Boolean
  
  /**
    * Releases all the data from the array as well as the array.
    */
  def dispose(): Unit
  
  /**
    * Iterates over the active data and apply the lambda to them.
    * @param func defines the action to apply on each value.
    */
  def forEach(func: js.Function1[/* content */ T, Unit]): Unit
  
  /**
    * Returns the position of a value in the active data.
    * @param value defines the value to find the index for
    * @returns the index if found in the active data otherwise -1
    */
  def indexOf(value: T): Double
  
  /**
    * Pushes a value at the end of the active data.
    * @param value defines the object to push in the array.
    */
  def push(value: T): Unit
  
  /**
    * Resets the active data to an empty array.
    */
  def reset(): Unit
  
  /**
    * Sorts the full sets of data.
    * @param compareFn defines the comparison function to apply.
    */
  def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Double]): Unit
}
object SmartArray {
  
  inline def apply[T](
    _id: Double,
    concat: Any => Unit,
    contains: T => Boolean,
    data: js.Array[T],
    dispose: () => Unit,
    forEach: js.Function1[/* content */ T, Unit] => Unit,
    indexOf: T => Double,
    length: Double,
    push: T => Unit,
    reset: () => Unit,
    sort: js.Function2[/* a */ T, /* b */ T, Double] => Unit
  ): SmartArray[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], concat = js.Any.fromFunction1(concat), contains = js.Any.fromFunction1(contains), data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), forEach = js.Any.fromFunction1(forEach), indexOf = js.Any.fromFunction1(indexOf), length = length.asInstanceOf[js.Any], push = js.Any.fromFunction1(push), reset = js.Any.fromFunction0(reset), sort = js.Any.fromFunction1(sort))
    __obj.asInstanceOf[SmartArray[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmartArray[?], T] (val x: Self & SmartArray[T]) extends AnyVal {
    
    inline def setConcat(value: Any => Unit): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    
    inline def setContains(value: T => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setForEach(value: js.Function1[/* content */ T, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    inline def setIndexOf(value: T => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setPush(value: T => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSort(value: js.Function2[/* a */ T, /* b */ T, Double] => Unit): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
    
    inline def set_id(value: Double): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
