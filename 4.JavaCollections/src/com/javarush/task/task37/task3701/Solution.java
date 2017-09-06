package task37.task3701;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/**
 * Created by ukr-sustavov on 29.08.2017.
 */
public class Solution<T> extends ArrayList<T> {

    public static void main(String[] args) {
        Solution<Integer> list = new Solution<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int count = 0;
        for (Integer i : list) {
            //1 2 3 1 2 3 1 2 3 1
            System.out.print(i + " ");
            count++;
            if (count == 10) {
                break;
            }
        }
    }

    public class RoundIterator implements Iterator<T>{

        int cursor;       // index of next element to return
        int lastRet = -1; // index of last element returned; -1 if no such
        int expectedModCount = modCount;

        @Override
        public boolean hasNext() {
            return Solution.this.size() > 0;
        }

        @Override
        public T next() {
            checkForComodification();
            int i = cursor;
            if (cursor >= Solution.this.size()) {
                i = 0;
            }
            cursor = i + 1;
            return Solution.this.get(lastRet = i);
        }

        @Override
        public void remove() {
            Solution.this.remove(Solution.this.get(lastRet));
        }

        final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new RoundIterator();
    }


}
