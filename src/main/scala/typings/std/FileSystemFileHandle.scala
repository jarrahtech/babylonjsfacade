package typings.std

import typings.std.stdStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait FileSystemFileHandle
  extends StObject
     with FileSystemHandle {
  
  /* standard dom */
  def getFile(): js.Promise[org.scalajs.dom.File]
  
  /* standard dom */
  @JSName("kind")
  val kind_FileSystemFileHandle: file
}
object FileSystemFileHandle {
  
  inline def apply(
    getFile: () => js.Promise[org.scalajs.dom.File],
    isSameEntry: FileSystemHandle => js.Promise[scala.Boolean],
    name: java.lang.String
  ): FileSystemFileHandle = {
    val __obj = js.Dynamic.literal(getFile = js.Any.fromFunction0(getFile), isSameEntry = js.Any.fromFunction1(isSameEntry), kind = "file", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemFileHandle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemFileHandle] (val x: Self) extends AnyVal {
    
    inline def setGetFile(value: () => js.Promise[org.scalajs.dom.File]): Self = StObject.set(x, "getFile", js.Any.fromFunction0(value))
    
    inline def setKind(value: file): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
