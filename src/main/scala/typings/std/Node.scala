package typings.std

import typings.std.stdInts.`0x01`
import typings.std.stdInts.`0x02`
import typings.std.stdInts.`0x04`
import typings.std.stdInts.`0x08`
import typings.std.stdInts.`0x10`
import typings.std.stdInts.`0x20`
import typings.std.stdInts.`10`
import typings.std.stdInts.`11`
import typings.std.stdInts.`12`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import typings.std.stdInts.`4`
import typings.std.stdInts.`5`
import typings.std.stdInts.`6`
import typings.std.stdInts.`7`
import typings.std.stdInts.`8`
import typings.std.stdInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Node is an interface from which a number of DOM API object types inherit. It allows those types to be treated similarly; for example, inheriting the same set of methods, or being tested in the same way. */
@js.native
trait Node
  extends StObject
     with EventTarget {
  
  /* standard dom */
  val ATTRIBUTE_NODE: `2` = js.native
  
  /** node is a CDATASection node. */
  /* standard dom */
  val CDATA_SECTION_NODE: `4` = js.native
  
  /** node is a Comment node. */
  /* standard dom */
  val COMMENT_NODE: `8` = js.native
  
  /** node is a DocumentFragment node. */
  /* standard dom */
  val DOCUMENT_FRAGMENT_NODE: `11` = js.native
  
  /** node is a document. */
  /* standard dom */
  val DOCUMENT_NODE: `9` = js.native
  
  /** Set when other is a descendant of node. */
  /* standard dom */
  val DOCUMENT_POSITION_CONTAINED_BY: `0x10` = js.native
  
  /** Set when other is an ancestor of node. */
  /* standard dom */
  val DOCUMENT_POSITION_CONTAINS: `0x08` = js.native
  
  /** Set when node and other are not in the same tree. */
  /* standard dom */
  val DOCUMENT_POSITION_DISCONNECTED: `0x01` = js.native
  
  /** Set when other is following node. */
  /* standard dom */
  val DOCUMENT_POSITION_FOLLOWING: `0x04` = js.native
  
  /* standard dom */
  val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: `0x20` = js.native
  
  /** Set when other is preceding node. */
  /* standard dom */
  val DOCUMENT_POSITION_PRECEDING: `0x02` = js.native
  
  /** node is a doctype. */
  /* standard dom */
  val DOCUMENT_TYPE_NODE: `10` = js.native
  
  /** node is an element. */
  /* standard dom */
  val ELEMENT_NODE: `1` = js.native
  
  /* standard dom */
  val ENTITY_NODE: `6` = js.native
  
  /* standard dom */
  val ENTITY_REFERENCE_NODE: `5` = js.native
  
  /* standard dom */
  val NOTATION_NODE: `12` = js.native
  
  /** node is a ProcessingInstruction node. */
  /* standard dom */
  val PROCESSING_INSTRUCTION_NODE: `7` = js.native
  
  /** node is a Text node. */
  /* standard dom */
  val TEXT_NODE: `3` = js.native
  
  /* standard dom */
  def appendChild[T /* <: org.scalajs.dom.Node */](node: T): T = js.native
  
  /** Returns node's node document's document base URL. */
  /* standard dom */
  val baseURI: java.lang.String = js.native
  
  /** Returns the children. */
  /* standard dom */
  val childNodes: org.scalajs.dom.NodeList[ChildNode & org.scalajs.dom.Node] = js.native
  
  /** Returns a copy of node. If deep is true, the copy also includes the node's descendants. */
  /* standard dom */
  def cloneNode(): org.scalajs.dom.Node = js.native
  def cloneNode(deep: scala.Boolean): org.scalajs.dom.Node = js.native
  
  /** Returns a bitmask indicating the position of other relative to node. */
  /* standard dom */
  def compareDocumentPosition(other: org.scalajs.dom.Node): Double = js.native
  
  /** Returns true if other is an inclusive descendant of node, and false otherwise. */
  /* standard dom */
  def contains(): scala.Boolean = js.native
  def contains(other: org.scalajs.dom.Node): scala.Boolean = js.native
  
  /** Returns the first child. */
  /* standard dom */
  val firstChild: ChildNode | Null = js.native
  
  /** Returns node's root. */
  /* standard dom */
  def getRootNode(): org.scalajs.dom.Node = js.native
  def getRootNode(options: GetRootNodeOptions): org.scalajs.dom.Node = js.native
  
  /** Returns whether node has children. */
  /* standard dom */
  def hasChildNodes(): scala.Boolean = js.native
  
  /* standard dom */
  def insertBefore[T /* <: org.scalajs.dom.Node */](node: T): T = js.native
  def insertBefore[T /* <: org.scalajs.dom.Node */](node: T, child: org.scalajs.dom.Node): T = js.native
  
  /** Returns true if node is connected and false otherwise. */
  /* standard dom */
  val isConnected: scala.Boolean = js.native
  
  /* standard dom */
  def isDefaultNamespace(): scala.Boolean = js.native
  def isDefaultNamespace(namespace: java.lang.String): scala.Boolean = js.native
  
  /** Returns whether node and otherNode have the same properties. */
  /* standard dom */
  def isEqualNode(): scala.Boolean = js.native
  def isEqualNode(otherNode: org.scalajs.dom.Node): scala.Boolean = js.native
  
  /* standard dom */
  def isSameNode(): scala.Boolean = js.native
  def isSameNode(otherNode: org.scalajs.dom.Node): scala.Boolean = js.native
  
  /** Returns the last child. */
  /* standard dom */
  val lastChild: ChildNode | Null = js.native
  
  /* standard dom */
  def lookupNamespaceURI(): java.lang.String | Null = js.native
  def lookupNamespaceURI(prefix: java.lang.String): java.lang.String | Null = js.native
  
  /* standard dom */
  def lookupPrefix(): java.lang.String | Null = js.native
  def lookupPrefix(namespace: java.lang.String): java.lang.String | Null = js.native
  
  /** Returns the next sibling. */
  /* standard dom */
  val nextSibling: ChildNode | Null = js.native
  
  /** Returns a string appropriate for the type of node. */
  /* standard dom */
  val nodeName: java.lang.String = js.native
  
  /** Returns the type of node. */
  /* standard dom */
  val nodeType: Double = js.native
  
  /* standard dom */
  var nodeValue: java.lang.String | Null = js.native
  
  /** Removes empty exclusive Text nodes and concatenates the data of remaining contiguous exclusive Text nodes into the first of their nodes. */
  /* standard dom */
  def normalize(): Unit = js.native
  
  /** Returns the node document. Returns null for documents. */
  /* standard dom */
  val ownerDocument: org.scalajs.dom.Document | Null = js.native
  
  /** Returns the parent element. */
  /* standard dom */
  val parentElement: org.scalajs.dom.HTMLElement | Null = js.native
  
  /** Returns the parent. */
  /* standard dom */
  val parentNode: org.scalajs.dom.ParentNode | Null = js.native
  
  /** Returns the previous sibling. */
  /* standard dom */
  val previousSibling: ChildNode | Null = js.native
  
  /* standard dom */
  def removeChild[T /* <: org.scalajs.dom.Node */](child: T): T = js.native
  
  /* standard dom */
  def replaceChild[T /* <: org.scalajs.dom.Node */](node: org.scalajs.dom.Node, child: T): T = js.native
  
  /* standard dom */
  var textContent: java.lang.String | Null = js.native
}
