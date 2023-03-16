
import static org.junit.jupiter.api.Assertions.*;
import org.example.lab1.Stack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class StackTest {
    private Stack<Integer> stack;

    @BeforeEach
    void setUp() throws Exception {
        stack = new Stack<Integer>();
    }

    @AfterEach
    void tearDown() throws Exception {
        stack = null;
    }

    @Test
    @Order(1)
    void testChecksEmptyStack() {
        assertTrue(stack.isEmpty());
    }

    @Test
    @Order(2)
    void testCorrectlyPushesToStack() {
        stack.pushData(1);
        stack.pushData(2);
        assertFalse(stack.isEmpty());
        assertEquals(2, stack.size());
    }

    @Test
    @Order(3)
    void testCorrectlyPopsFromStack() {
        stack.pushData(3);
        stack.pushData(4);
        assertEquals(4, stack.popData());
    }

    @Test
    @Order(4)
    void testCorrectlyPopsAndPushes() {
        stack.pushData(5);
        stack.pushData(3);
        stack.pushData(8);
        assertEquals(3, stack.size());
        assertEquals(8, stack.popData());
        assertEquals(3, stack.popData());
        assertEquals(5, stack.popData());
        assertEquals(0, stack.size());
    }


    @Test
    @Order(5)
    void testDoesNotPopFromEmptyStack() {
        assertThrows(IndexOutOfBoundsException.class, () -> stack.popData());
    }

}