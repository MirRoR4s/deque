import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayDequeTest {
    @Test
    public void testAddFirst() {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.addFirst(1);
        ad1.addFirst(2);
        ad1.addFirst(3);
        int ans = ad1.get(0);
        assertEquals(3, ans);
        ans = ad1.get(1);
        assertEquals(2, ans);
        ans = ad1.get(2);
        assertEquals(1, ans);
    }

    @Test
    public void testAddLast() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= 9; i ++) {
            deque.addLast(i);
        }

        int ans = deque.get(0);
        assertEquals(1, ans);

        ans = deque.get(1);
        assertEquals(2, ans);

        ans = deque.get(7);
        assertEquals(8, ans);

        // resize
        ans = deque.get(8);
        assertEquals(9, ans);
    }

    @Test
    public void testRemoveLast() {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.addLast(1);
        ad1.addLast(2);
        ad1.addLast(3);
        int ans = ad1.removeLast();
        assertEquals(3, ans);
        ans = ad1.removeLast();
        assertEquals(2, ans);
        ans = ad1.removeLast();
        assertEquals(1, ans);
    }

    @Test
    public void testRemoveFirst() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);

        int ans = deque.removeFirst();
        assertEquals(1, ans);
        assertEquals(deque.size(), 2);

        ans = deque.removeFirst();
        assertEquals(2, ans);
        assertEquals(deque.size(), 1);

        ans = deque.removeFirst();
        assertEquals(3, ans);
        assertEquals(deque.size(), 0);
        
        deque.removeFirst();
        assertEquals(deque.size(), 0);
    }
}
