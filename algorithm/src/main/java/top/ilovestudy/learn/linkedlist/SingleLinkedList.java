package top.ilovestudy.learn.linkedlist;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author jinghui.zhang
 */
@NoArgsConstructor
@Getter
public class SingleLinkedList<E> {

  SNode<E> head;

  public SingleLinkedList(SNode<E> head) {
    addNodeToTailed(head);
  }

  public int size() {
    int length = 0;
    SNode<E> sNode = head;
    while (sNode != null) {
      length++;
      sNode = sNode.getNext();
    }
    return length;
  }

  public void addNodeToTailed(SNode<E> sNode) {
    if (head == null) {
      head = sNode;
    } else {
      SNode<E> tNode = head;
      while (tNode.getNext() != null) {
        tNode = tNode.getNext();
      }
      tNode.setNext(sNode);
    }
  }

  public SNode<E> find(SNode<E> sNode) {
    if (head == null) {
      throw new RuntimeException("you are find in a empty list");
    }

    SNode<E> tNode = head;
    while (tNode.getNext() != null) {
      if (tNode.getElement().equals(sNode.getElement())) {
        return tNode;
      }
      tNode = tNode.getNext();
    }
    return tNode.getElement().equals(sNode.getElement()) ? tNode : null;
  }

  public void delete(SNode<E> sNode) {
    if (head == null) {
      throw new RuntimeException("you are try to delete element in a empty list");
    }
    if (head.getElement().equals(sNode.getElement())) {
      this.head = this.head.getNext();
      return;
    }

    SNode<E> tNode = head;
    while (tNode.getNext() != null) {
      if (tNode.getNext().getElement().equals(sNode.getElement())) {
        tNode.setNext(tNode.getNext().getNext());
      }
      tNode = tNode.getNext();
    }
  }

  /**
   * FIXME: 2020-01-15 Use only in acyclic linked lists
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    SNode<E> tNode = head;
    while (tNode.getNext() != null) {
      sb.append(tNode.getElement()).append(" -> ");
      tNode = tNode.getNext();
    }
    sb.append(tNode.getElement());
    return sb.toString();
  }
}
