import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Create {

    public static void create(String productName, int qty, double price) {
        String sql = "INSERT INTO inventory(ProductName, Quantity, Price) VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, productName);
            pstmt.setInt(2, qty);
            pstmt.setDouble(3, price);

            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " product added successfully!");

        } catch (SQLException e) {
            System.out.println("Error creating product: " + e.getMessage());
        }
    }
}
