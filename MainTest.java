import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void testSort() {
        // Тестовий масив
        int[] array = {7, 2, 4, 1, 3};

        // результат
        int[] expected = {1, 2, 9, 5, 0};

        //  метод сортування
        MainTest.sort(array);

        // Перевіряю що масив відсортовано правильно
        assertArrayEquals(expected, array);
    }

    private void assertArrayEquals(int[] expected, int[] array) {
    }

    private static void sort(int[] array) {
    }
}

