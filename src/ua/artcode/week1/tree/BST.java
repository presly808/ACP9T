package ua.artcode.week1.tree;

import java.util.Comparator;

/**
 */

// declare generic -        use generic
public class BST<E> implements BTree<E> {

    private TNode<E> root;
    private Comparator<E> comparator;
    private int size = 0;


    public BST(Comparator<E> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void add(E obj) {
        // compareTo with root
        // <  hasFreeLeftPlace -> create new node link with parent
        // > hasFreeRightPlace -> create new node link with parent
        // false, recursion comparing ->

        if (root == null) {
            root = new TNode<E>(obj, null, null, null);
            size++;
        } else {
            TNode<E> iter = root;

            while (iter != null) {

                int compareRes = comparator.compare(obj, iter.value);
                if (compareRes < 0) {
                    if (iter.left == null) {
                        iter.left = new TNode<E>(obj, null, null, iter);
                        size++;
                        return;
                    } else {
                        iter = iter.left;
                    }
                } else if (compareRes > 0) {
                    if (iter.right == null) {
                        iter.right = new TNode<E>(obj, null, null, iter);
                        size++;
                        return;
                    } else {
                        iter = iter.right;
                    }
                }
            }

        }


    }

    @Override
    public boolean contains(E obj) {
        return find(obj, root) != null;
    }


    private TNode<E> find(E el, TNode<E> iter) {

        if (iter == null) {
            return null;
        }

        int compareRes = comparator.compare(el, iter.value);

        if (compareRes < 0) {
            return find(el, iter.left);
        } else if (compareRes > 0) {
            return find(el, iter.right);
        }

        //return compareRes < 0 ? find(el, iter.left) : compareRes > 0 ? find(el, iter.left) : iter;

        return iter;
    }

    @Override
    public boolean remove(E obj) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    private String toString(TNode<E> node) {

        String res = "";

        if (node == null) {
            return "";
        }

        String left = toString(node.left);
        String me = node.value.toString() + ",";
        String right = toString(node.right);

        return left + me + right;
    }

    @Override
    public String toString() {
        return toString(root);
    }

    private static class TNode<X> {

        X value;
        TNode left;
        TNode right;
        TNode parent;

        public TNode(X value, TNode left,
                     TNode right, TNode parent) {
            this.value = value;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }
    }
}
