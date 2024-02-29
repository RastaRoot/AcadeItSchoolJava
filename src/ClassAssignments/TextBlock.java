package ClassAssignments;

public class TextBlock {
    public static void main(String[] args) {
        String sql = """
                SELECT * FROM products
                WHERE price  >= 20
                """;
    }
}