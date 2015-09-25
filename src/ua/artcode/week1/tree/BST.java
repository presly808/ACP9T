package ua.artcode.week1.tree;

import java.util.Comparator;

/**
 */

// declare generic -        use generic
public class BST<E> implements BTree<E> {

    private TNode<E> root;
    private Comparator<E> comparator;


    public BST(Comparator<E> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void add(E obj) {
        // compareTo with root
        // <  hasFreeLeftPlace -> create new node link with parent
        // > hasFreeRightPlace -> create new node link with parent
        // false, recursion comparing ->

        if(root == null){
            root = new TNode<E>(obj, null, null, null);
        } else {
            TNode<E> iter = root;

            while(iter != null){

                int compareRes = comparator.compare(obj, iter.value);
                if(compareRes < 0){
                    if(iter.left == null){
                        iter.left = new TNode<E>(obj,null,null,iter);
                        return;
                    } else {
                        iter = iter.left;
                    }
                } else if(compareRes > 0){
                    if(iter.right == null){
                        iter.right = new TNode<E>(obj,null,null,iter);
                        return;
                    } else {
                        iter = iter.right;
                    }
                }
            }

        }


    }

    @Override
    public boolean contains(Object obj) {
        return false;
    }

    @Override
    public boolean remove(E obj) {
        return false;
    }

    @Override
    public int size() {
        return 0;
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
