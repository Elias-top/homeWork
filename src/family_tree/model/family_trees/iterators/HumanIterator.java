package family_tree.model.family_trees.iterators;

import java.util.Iterator;
import java.util.List;

import family_tree.model.family_trees.TreeItem;


public class HumanIterator<E extends TreeItem> implements Iterator<E>{
    private int index;
    private List<E> humanList;

    public HumanIterator(List<E> humanList){
        this.humanList = humanList;
    }
    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return index < humanList.size();
    }

    @Override
    public E next() {
        // TODO Auto-generated method stub
        return humanList.get(index++);
    }


    
}